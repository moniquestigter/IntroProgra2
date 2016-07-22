/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction.IntroProgra2;

import java.util.ArrayList;


public class Array2 {
    public static void main(String[] args) {
        //No puedo crear array usando tipo primitivo 
        //SOLO SOPORTA CLASES ENTRE LOS DIAMANTES
        ArrayList<Integer> nums = new ArrayList<>(); 
        nums.add(8);
        nums.add(-4);
        
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('D');
        
       //mi clase
       ArrayList<Alumno> als = new ArrayList<>();
       als.add(new Alumno("caakk"));
       als.add(new Alumno("sup"));
       als.add(new Alumno("meh"));
       als.add(new Alumno("yehj"));
       
       for(Alumno pos: als){
           pos.print();
        
       //Agregar un nuevo alumno en la posicion 1
       als.add(1, new Alumno("Alicia"));
       
       //Busqueda propia para ver si esta el alumno "Alicia"
       for(Alumno cad: als){
           if(cad.getNombre().equals("Alicia"))
               System.out.println("Si esta Alicia");
       }
       //Modificar nombre del alumno en pos 3
       als.get(3).setNombre("Monica");
       
       for(Alumno a : als)
           a.print();
       
       }
    }
    
   
    
}
