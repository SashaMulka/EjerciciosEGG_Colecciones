/*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas*/

package colec_06;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class Principal {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashMap<String, Double> productos = new HashMap<>();
        
        boolean continuar = true;
        String nombre;
        Double precio;
        do{
        System.out.println("----------------MENU------------------");
        System.out.println("1) Registrar un producto");
        System.out.println("2) Actualizar el preciode un producto");
        System.out.println("3) Borrar un producto");
        System.out.println("4) Mostrar productos");
        System.out.println("5) Salir");
        System.out.println("--------------------------------------");
        int rtta = entry.nextInt();
        switch(rtta){
            case 1:
                System.out.println("REGISTRAR UN PRODUCTO");
                System.out.println("Nombre:");
                nombre = entry.next();
                System.out.println("Precio:");
                precio = entry.nextDouble();
                productos.put(nombre, precio);
                System.out.println("Producto registrado\n");
                break;
            case 2:
                System.out.println("ACTUALIZAR PRECIO");
                System.out.println("Nombre del producto");
                nombre = entry.next();
                if(productos.containsKey(nombre)){
                    System.out.println("Precio actual: " + productos.get(nombre));
                    System.out.println("Precio nuevo:");
                    precio = entry.nextDouble();
                productos.replace(nombre, precio);
                        } else {
                    System.out.println("ERROR producto no registrado");
                }
                break;
            case 3:
                System.out.println("QUITAR PRODUCTO");
                System.out.println("Nombre del producto");
                nombre = entry.next();
                if(productos.containsKey(nombre)){
                    productos.remove(nombre);
                    System.out.println("El producto ha sido eliminado");
                } else {
                    System.out.println("ERROR producto no encontrado");
                }
                break;
            case 4:
                System.out.println("PRODUCTOS REGISTRADOS:");
                for (Map.Entry<String, Double> aux : productos.entrySet()) {
                    String key = aux.getKey();
                    Double value = aux.getValue();
                    System.out.println(key + ": " + value);
                }
                break;
            case 5:
                continuar = false;
                break;
            default:
                System.out.println("\nERROR Ingrese una opcion valida");
        }
        
        }while(continuar);
    }

}
