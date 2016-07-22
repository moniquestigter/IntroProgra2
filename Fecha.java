/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;
import java.util.Date;


public class Fecha {
    public static void main(String[] args) {
        Date hoy = new Date();
        //print
        System.out.println("Hoy: " + hoy + "en mili: "+ hoy.getTime()); //no es 
        //necesario poner toString -- getTime para agarrar los milisegundos
        //seconds
        Date antes = new Date();
        System.out.println("Mili 1: " + antes);
        //funciona con milisegundos
    }
}
