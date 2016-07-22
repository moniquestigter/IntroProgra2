/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction.IntroProgra2;


public class Alumno {
    //atributos
    private String nombre;
    private double av;
    
    //constructores
    public Alumno(String nombre){
        this.nombre = nombre;
    }
    //funciones
    public String getNombre(){
        return nombre;
    }
    public String setNombre(String nombre){
        return nombre;
    }
    public double getPromedio(){
        return av;
    }
    
    public void print(){
        System.out.println(nombre);
    }
}
