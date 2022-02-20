/*

 */
package Comparadores;

import colec_04.Pelicula;
import java.util.Comparator;


public class ComparadorDuracionAsc implements Comparator<Pelicula>{
    @Override
    public int compare (Pelicula peli1, Pelicula peli2) {
        return Double.compare(peli1.getDuracion(), peli2.getDuracion());
    }
}
