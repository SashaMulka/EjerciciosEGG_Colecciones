/*
 */
package Comparadores;

import colec_04.Pelicula;
import java.util.Comparator;


public class ComparadorDirector implements Comparator<Pelicula>{
    @Override
    public int compare (Pelicula peli1, Pelicula peli2){
        return peli1.getDirector().compareTo(peli2.getDirector());
    }
    
}
