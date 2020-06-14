/*
*Nombre: Gerardo AyalaJuarez
*Tema:Proyecto final
*Descripcion: Interfaz de el objeto rmi
*fecha: 13 - Junio - 2020
*
*/
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.ImageIcon;

/**
 *
 * @author futbo
 */
public interface AhorcadoInterface extends Remote{
    public int generarPartida(int sala, String playeron) throws RemoteException;
    public String trychar(String c, int sala) throws RemoteException;
    public String tryFrase(String c, int sala) throws RemoteException;
    public String getFrase(int sala) throws RemoteException;
    public String actualidad(int sala) throws RemoteException;
    public ImageIcon status(int sala) throws RemoteException;
    public void Restablecer(int sala) throws RemoteException;
    
}
