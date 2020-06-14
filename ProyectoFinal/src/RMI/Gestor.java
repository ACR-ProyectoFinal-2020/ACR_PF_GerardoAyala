/*
*Nombre: Gerardo AyalaJuarez
*Tema:Proyecto final
*Descripcion: Clase del objeto que manipula el servidor
*fecha: 13 - Junio - 2020
*
*/
package RMI;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author futbo
 */
public class Gestor extends UnicastRemoteObject implements AhorcadoInterface {
    public ImageIcon[] situacion; 
    private Partida[] salas;
    private Vector palabras;
    private javax.swing.JTextArea log;
    public Gestor( javax.swing.JTextArea log) throws RemoteException {
        this.log = log;
        palabras= new Vector();
        situacion = new ImageIcon[5];
        situacion[0] = new ImageIcon(getClass().getResource("/RMI/Intento0.png"));
        situacion[1] = new ImageIcon(getClass().getResource("/RMI/Intento1.png"));
        situacion[2] = new ImageIcon(getClass().getResource("/RMI/Intento2.png")); 
        situacion[3] = new ImageIcon(getClass().getResource("/RMI/intento3.png"));
        situacion[4] = new ImageIcon(getClass().getResource("/RMI/intento04.png"));
        try {
            Scanner input = new Scanner(new File("palabras.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                palabras.add( line.toUpperCase());
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        salas = new Partida[999];
        for (int i = 0; i< salas.length;i++){
            salas[i] = new Partida(i);
        }
    }


    @Override
    public int generarPartida(int sala, String playeron) throws RemoteException {
        log.append("\n El jugador: "+playeron+" inicio la sala: "+sala);
        int numero = (int) (Math.random() * palabras.size()) + 1;
        if(salas[sala].isCanplay()){
            for(int i = 0 ; i< salas.length;i++){
                if(!(salas[i].isCanplay())){
                    salas[i].addPlayer(playeron,  (palabras.get(numero)).toString());
                    return i;
                }
            }
            return -1;
        }
        else{
            salas[sala].addPlayer(playeron, palabras.get(numero).toString());
            return sala;
        }
    }

    @Override
    public String trychar(String c, int sala) throws RemoteException {
        log.append("\n El jugador: "+salas[sala].getApodo()+" de la sala: "+sala+" intento una letra");
        salas[sala].tryChar(c);
        return salas[sala].getPalabrastatus();
    }

    @Override
    public String getFrase(int sala) throws RemoteException {
        return salas[sala].getPalabrastatus();
    }

    @Override
    public ImageIcon status(int sala) throws RemoteException {
        return this.situacion[salas[sala].getIntentos()];
    }

    @Override
    public String tryFrase(String c, int sala) throws RemoteException {
        salas[sala].tryFrase(c);
        return salas[sala].getPalabrastatus();}

    @Override
    public String actualidad(int sala) throws RemoteException {
        if(salas[sala].lose()){
            return "Juego Perdido";
        }
        else if(salas[sala].win()){
            return "Juego Ganado";
        }
        else{
            return "En partida";
        }
    }

    @Override
    public void Restablecer(int sala) throws RemoteException {
        log.append("\n La sala "+sala+" se termino la partida");
        salas[sala] = new Partida(sala);
    }
    
}
