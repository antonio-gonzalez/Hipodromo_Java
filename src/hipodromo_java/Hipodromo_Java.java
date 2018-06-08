/*
 * En el hipodromo de java se disputa una gran competencia 
 * tenemos 5 valientes caballos en la grilla de partida 
 * se abren las competencias para determinar el caballo campeon elige 
 * tu el tuyo y no te quedes sin participar
 */
package hipodromo_java;

import java.util.Scanner;

/**
 *
 * @author pachoca
 */
public class Hipodromo_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        System.out.println("BIENVENIDO A SU HIPODROMO DE JAVA ");
        System.out.print("COMO TE LLAMAS?\t");
        String nombre;
        nombre = x.nextLine();
        System.out.println(nombre+" tenemos los siguientes sementales en competicia escoge uno ");
        System.out.println("1. Astromelia");
        System.out.println("2. Lirio");
        System.out.println("3. Agapanto");
        System.out.println("4. Clavel");
        System.out.println("5. Amapola"); 
        String caballo [] = { "Astromelia","Lirio","Agapanto","Clavel","Amapola"};
        int num = x.nextInt();
        if (num <= caballo.length){
            System.out.println( nombre+" el caballo que tomaste fue ►"+ caballo [num-1] +"◄ cuanto le vas apostar" );
        }
        else {
            System.out.println(nombre+" el caballo que tomo no es correcto por favor intenta de nuevamente");
        }
        int apos = x.nextInt();
        if (apos > 1000){
            System.out.println(nombre+ " tu apuesta es superior a 1000 ganaras el  50% entonces ganaras  "+ (apos) *(0.5) + " y si tu ganas se te entregara " + (apos *0.5 + apos)  );
        }
        else {
            System.out.println(nombre+ " si tu apuesta es inferior a 999 ganaras el 100% de tu ganas sera  "+ apos* 2);
        }
        System.out.println("신◈기◈今天◈(★)QUE COMIENSE LA CARRERA (★)◈동방◈기◈天  ");
        for (int i=0; i<caballo.length; i++){
            num=(int)(Math.random()*i);
                
        } System.out.println("en la carrera  el ganador fue: " + caballo [num]);
        if(caballo != caballo ){
            
            System.out.println("felicidades tu " + caballo [num-1] + " ganeste " + (apos *0.5 + apos) + "||" + (apos* 2) + nombre );
        } 
        else {
            System.out.println("animo campeón \n" + nombre + " sigue apostando" );
        }
          }
       
}

