/*

 */
package colec_04;


public class Pelicula {
    private String nombre;
    private String director;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, double duracion) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    

    
}
