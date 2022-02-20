/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula 
se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas. 
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla*/

package colec_04;

import Comparadores.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;



public class Colec_04 {

  
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        boolean continuar = true;
        PeliculaService peliculas = new PeliculaService();
        do {
            ArrayList<Double> notas = new ArrayList();
             System.out.println("-----Cargar Pelicula----");
            System.out.println("Nombre:");
            String nombre = entry.next();
            System.out.println("Director:");
            String director = entry.next();
            System.out.println("Duracion:");
            double duracion = entry.nextDouble();

            
            peliculas.crearPelicula(nombre, director, duracion);                        
            
            System.out.println("Agregar otra Pelicula? (S/N)");
            String rtta;        
            do{
                rtta = entry.next();
                if (rtta.toUpperCase().charAt(0) == 'N'){
                continuar = false;
                } else if ( rtta.toUpperCase().charAt(0) != 'S'){
                    System.out.println("\nIngrese una opcion valida (S/N)");
                }
            } while (rtta.toUpperCase().charAt(0) != 'N' && rtta.toUpperCase().charAt(0) != 'S');
        }while(continuar);
        
        System.out.println("\n-----Peliculas Registradas-----");
        peliculas.mostrarPeliculas();
        System.out.println("\n-----Peliculas con duracion mayor a 1 hora-----");
        peliculas.mostrarPeliculas(1);
        System.out.println("\n-----Peliculas ordenadas por duracion en forma descendente-----");       
        Collections.sort(peliculas.getPeliculas() , new ComparadorDuracionDesc());
        peliculas.mostrarPeliculas();
        System.out.println("\n-----Peliculas ordenadas por duracion en forma Ascendente-----");       
        Collections.sort(peliculas.getPeliculas() , new ComparadorDuracionAsc());
        peliculas.mostrarPeliculas();
        System.out.println("\n-----Peliculas ordenadas por titulo-----");       
        Collections.sort(peliculas.getPeliculas() , new ComparadorTitulo());
        peliculas.mostrarPeliculas();
        System.out.println("\n-----Peliculas ordenadas por director-----"); 
        Collections.sort(peliculas.getPeliculas() , new ComparadorDirector());
        peliculas.mostrarPeliculas();
        
    }

}
