/*
 */
package Comparadores;

import colec_04.Pelicula;
import java.util.Comparator;


public class ComparadorDuracionDesc implements Comparator<Pelicula> {
        
        @Override
        public int compare (Pelicula peli1, Pelicula peli2){
            return Double.compare(peli2.getDuracion(), peli1.getDuracion());
        }
    
}
