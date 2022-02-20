/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.*/

package colec_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class Colec_05 {

  
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashSet<Pais> paises = new HashSet();
        boolean continuar = true;
        
        do{
            System.out.println("Ingrese el nombre del pais");
            String nombre = entry.next();
            paises.add(new Pais(nombre));
            System.out.println("Desea agregar otro pais? S/N");
            boolean incorrecta = true;
            do{
            String rtta = entry.next();
                if ("S".equalsIgnoreCase(rtta.substring(0, 1))){  
                    incorrecta = false;
                } else if ("N".equalsIgnoreCase(rtta.substring(0, 1))){
                    incorrecta = false;
                    continuar = false;
                } else {
                    System.out.println("Ingrese una opcion valida S/N");                
                }
            }while(incorrecta);     
        }while(continuar);
        
        System.out.println("\nPaises registrados:");
        for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
        System.out.println("\nOrdenados alfabeticamente:");
        ArrayList<Pais> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);
        for (Pais pais : paisesLista) {
            System.out.println(pais.getNombre());
        }
        
        System.out.println("\nElija un pais:");
        String objetivo = entry.next();
        Iterator<Pais> it = paises.iterator();
        boolean exito = false;
        while (it.hasNext()){
            if (objetivo.equals(it.next().getNombre())){
                it.remove();
                exito = true;
            }
        } 
        if (exito){
            System.out.println("PAIS ELIMINADO");
            System.out.println("\nPaises restantes:");
            for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
        } else {
            System.out.println("El pais ingresado no se encuetra en la lista");
        }
    }

}
