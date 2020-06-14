/*
*Nombre: Gerardo AyalaJuarez
*Tema:Proyecto final
*Descripcion: Clase que ayuda gestionar la partida
*fecha: 13 - Junio - 2020
*
*/
package RMI;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author futbo
 */
public class Partida {
    private int sala;
    private String apodo;
    private String palabrastatus;
    private String palabraganadora;
    private int intentos;
    private boolean canplay;

    public Partida(int sala) {
        this.sala = sala;
        canplay=false;
        palabrastatus = "";
        palabraganadora = "";
        intentos = 0;
    }
    
    public void addPlayer(String apodo, String palabraganadora){
        this.apodo=apodo;
        this.palabraganadora = palabraganadora;
        this.palabrastatus="";
        for(int i=0;i<palabraganadora.length();i++){
            this.palabrastatus+="_";
        }
        canplay=true;
    }
    
    public void tryChar(String prueba){
        String muesta = palabrastatus;
        boolean consumir = true;
        int i = 0;
        int sub = 0;
        int ls = 0;
        do{
            muesta = palabrastatus;
            sub = palabraganadora.indexOf(prueba, ls);
            if(sub!=-1&&sub!=0){
                consumir = false;
                palabrastatus=muesta.substring(0, sub);
                palabrastatus+=prueba;
                if((sub+1)<palabraganadora.length()){
                    palabrastatus+=muesta.substring(sub+1,muesta.length());
                }
                ls =sub+1;
            }
            else if(sub!=-1){
                consumir = false;
                palabrastatus=prueba;
                if(palabraganadora.length()>1){
                    palabrastatus+=muesta.substring(1,muesta.length());
                }
                ls=1;
            }
        }
        while(sub!=-1);
        if(consumir){
            intentos+=1;
        }
    }
    
    public void tryFrase(String prueba){
        boolean consumir = true;
        if(prueba.equals(palabraganadora)){
            consumir = false;
            palabrastatus = prueba;
        }
        
        if(consumir){
            intentos+=1;
        }
    }
    
    public boolean win(){
        boolean xd = false;
        if(lose()){
            return false;
        }
        if(palabraganadora.equals(palabrastatus)){
            xd =true;
        }
        return xd;
    }

    public int getSala() {
        return sala;
    }

    public String getApodo() {
        return apodo;
    }
    public boolean lose(){
        boolean xd = false;
        if(intentos>3){
            xd = true;
        }
        return xd;
    }
    public String getPalabrastatus() {
        return palabrastatus;
    }

    public String getPalabraganadora() {
        return palabraganadora;
    }

    public int getIntentos() {
        return intentos;
    }

    public boolean isCanplay() {
        return canplay;
    }
    
    /*public static void main(String[] aggg){ // simular una partida para ver si funciona correctamente
        Partida prueba = new Partida(325);
        String s = "hola";
        System.out.println(s.toString());
        
        prueba.addPlayer("Gerardo", "almohada");
        prueba.tryChar("e");
        System.out.println("perdio: "+prueba.lose());
        System.out.println("gano: "+ prueba.win());
        prueba.tryChar("e");
        System.out.println("perdio: "+prueba.lose());
        System.out.println("gano: "+ prueba.win());
        prueba.tryChar("e");
        System.out.println("perdio: "+prueba.lose());
        System.out.println("gano: "+ prueba.win());
        prueba.tryFrase("almohada");
        System.out.println("perdio: "+prueba.lose());
        System.out.println("gano: "+ prueba.win());
    }*/
    
}
