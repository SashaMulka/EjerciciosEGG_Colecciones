/*
 */
package colec_04;

import java.util.ArrayList;
import java.util.Collections;



public class PeliculaService {
    private ArrayList<Pelicula> peliculas;

    public PeliculaService() {
        this.peliculas = new ArrayList<>();
    } 

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public PeliculaService(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    public void crearPelicula(String nombre, String director, double duracion) {
        Pelicula pelicula = new Pelicula();
        
        pelicula.setNombre(nombre);
        pelicula.setDirector(director);
        pelicula.setDuracion(duracion);
        
        addPelicula(pelicula);        
    }
    
    public void addPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }
    
    public void mostrarPeliculas() {
        for (Pelicula pelicula : this.peliculas) {
            System.out.println("-" + pelicula.getNombre());
        }
    }
    
    public void mostrarPeliculas(double duracion) {
        for (Pelicula pelicula : this.peliculas) {
            if (pelicula.getDuracion() >= duracion) {
            System.out.println("-" + pelicula.getNombre());
            }
        }
    }
     
    
    
     
}
