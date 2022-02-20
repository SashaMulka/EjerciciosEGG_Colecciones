/*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
nformación al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al 
método. Dentro del método se usará la lista notas para calcular el promedio final de 
alumnoSiendo este promedio final, devuelto por el método y mostrado en el main.*/

package colec_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class Colec_03 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        boolean continuar = true;
        
        ArrayList<Alumno> alumnos = new ArrayList();
        
        do {
            ArrayList<Double> notas = new ArrayList();
            System.out.println("Nombre del alumno");
            String nombre = entry.next();
            System.out.println("Primer nota");
            notas.add(entry.nextDouble());
            System.out.println("Segunda nota");
            notas.add(entry.nextDouble());
            System.out.println("Tercer nota");
            notas.add(entry.nextDouble());
            
            Alumno alumno = new Alumno(nombre, notas);
            
            alumnos.add(alumno);
            
            System.out.println("Agregar otro alumno? (S/N)");
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
    
                    for (Alumno alumno : alumnos) {
                System.out.println(alumno.getNombre());
                System.out.println(alumno.getNotas());
                    }
                               
                System.out.println("\n-----Calcular nota final-----");
                System.out.println("Ingrese el nombre del alumno");
                String objetivo = entry.next();
                boolean noEsta = true; 
                Iterator<Alumno> it = alumnos.iterator();
                while (it.hasNext()){
                    Alumno i= it.next();                   
                    if (i.getNombre().equals(objetivo)){
                        
                        System.out.println("La nota final de " + i.getNombre() + " es " + i.notaFinal());
                        noEsta = false;
                    }
                }
                if (noEsta) {
                    System.out.println("\nEl alumno no se encuentra en el registro");
                }
        
    }

}
