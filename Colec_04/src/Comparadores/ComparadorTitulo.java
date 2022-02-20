/*

 */
package Comparadores;

import colec_04.Pelicula;
import java.util.Comparator;


public class ComparadorTitulo implements Comparator<Pelicula>{
    @Override
    public int compare (Pelicula peli1, Pelicula peli2){
        return peli1.getNombre().compareTo(peli2.getNombre());
    }
}
