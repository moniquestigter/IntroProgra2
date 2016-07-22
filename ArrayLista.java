/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

import java.util.ArrayList;


public class ArrayLista {
    public static void main(String[] args) {
        //constructor del arrayList
         ArrayList<String> lista = new ArrayList<>(); 
         /*
         Agregar valores en un arreglo
            array[x] = valor
         */
         lista.add("Hola");
         lista.add("Yas");
         lista.add("BASTA");
         
         //imprimir con foreach
         
         for(String cad: lista){
            System.out.println("-"+cad);
        }
         // imprmir con for normal
         
         int size = lista.size();
         for(int p=0; p<size; p++){
             System.out.println("-"+ lista.get(p));// get para obtener el valor 
             //adentro de la posicion, solo p manda la cantidad osea un num. 
         }
         
         //Agregar en una posicion especifica
         
         System.out.println("\n---En Posicion especifica");
         lista.add(2, "Chela");
         for(String cad: lista){
             System.out.println("-"+cad);
         }
         
         //modificar el valor de una pos
         
         System.out.println("\n---modificar vlor especifica");
         lista.set(0,"Hoes");
         for(String cad: lista){
             System.out.println("-"+cad);
        }
         
         //Remover un valor o conjunto de valores
         
         System.out.println("\n--REMOVER VALORES");
         lista.remove(1);
         for(String cad: lista){
             System.out.println("-"+cad);
         }
         
         /*Buscar valores ** SOLO FUNCIONA CON VALORES PRIMITIVOS O CLASES QUE
         HAN MODIFICADO SU FUNCION EQUALS() COMO LA STRING *** */
         
         if(lista.contains("Chela"))
             System.out.println("Si tiene guardado eso");
         
         
    }
}
