/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada*/

package colections_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class Colections_01 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas = new ArrayList();
        boolean continuar = true;
        do {
            System.out.println("Ingrese la raza del perro");
            razas.add(entry.next());
            System.out.println("");
            System.out.println("Desea agregar otro perro? (S/N)");
            String rtta;        
            do{
                rtta = entry.next();
                if (rtta.toUpperCase().charAt(0) == 'N'){
                continuar = false;
                } else if ( rtta.toUpperCase().charAt(0) != 'S'){ //rtta.toUpperCase().charAt(0) != 'N' &&
                    System.out.println("");
                    System.out.println("Ingrese una opcion valida (S/N)");
                }
            } while (rtta.toUpperCase().charAt(0) != 'N' && rtta.toUpperCase().charAt(0) != 'S');
        } while (continuar);
        
        System.out.println("");
        System.out.println("INGRESADOS:");
        for (String raza : razas) {
            System.out.println(raza);
        }
        
        System.out.println("");
        System.out.println("Seleccione un perro");
        String objetivo;
        objetivo = entry.next();
        boolean hallado = false;
        Iterator<String> it = razas.iterator();
        while (it.hasNext()){
            if (it.next().equals(objetivo)){
                it.remove();
                hallado = true;
            }
        }
        System.out.println("");
        if (hallado){
            System.out.println("Raza eliminada");                    
        } else {
            System.out.println("No se ha registrado ningun perro como ese");
        }
        
        Collections.sort(razas);
        
        System.out.println("");
        System.out.println("Registrados:");
        for (String raza : razas) {
                System.out.println(raza);
            }
    }

}
