/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

import java.util.Calendar;
import java.util.Locale;



public class Calen {
    public static void main(String[] args) {
        Calendar hoy = Calendar.getInstance();
        System.out.println("Hoy: "+ hoy.getTime());
        //se necesita sacar date
        
        //fecha
        Calendar monique = Calendar.getInstance();
        monique.set(1997,Calendar.MARCH, 17); //meses empiezan de 0.
        System.out.println("Nacio en: "+ monique.getTime());
        
        //comparar
        if(monique.before(hoy))
            System.out.println("La chela nacio antes que hoy ");
        if(hoy.after(monique))  //same idea, diff expression 
            System.out.println("hoy es despues que naci");
        if(monique.getTimeInMillis() <= hoy.getTimeInMillis())
            System.out.println("Nacio antes que hoy");
        
        //valores individuales
        System.out.println("Año de Monique: "+ monique.get(Calendar.YEAR));
        System.out.println("Dia del año que naci: " +monique.get(Calendar.DAY_OF_YEAR));
        
        //sumar o restar
        hoy.add(Calendar.YEAR, 1);
        System.out.println("hoy en un año: " +hoy.getTime());
        hoy.add(Calendar.MONTH, -8);
        System.out.println("--menos 8 meses: " + hoy.getTime());
        
        Calendar hace10 = Calendar.getInstance();
        hace10.add(Calendar.YEAR, -10);
        
        if(monique.before(hace10))
            System.out.println("Monique tiene mas de 10 años");
        
        //sacar los nombres
        String dia = monique.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG 
                , Locale.FRENCH);
        String mes = monique.getDisplayName(Calendar.MONTH, Calendar.LONG 
                , Locale.forLanguageTag("nl"));
        System.out.println("French: " + dia + "--mes: " + mes);
        
    }
}
