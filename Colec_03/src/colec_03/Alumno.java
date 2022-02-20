/*

 */
package colec_03;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Double> notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;                
    }

    public Alumno() {
        this.notas = new ArrayList();
    }

    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    

    public double notaFinal() {
        double total = 0;       
        for (Double nota : notas) {
            total += nota;
        }
        return total / notas.size();
    }
}
