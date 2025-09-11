import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Desafio_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> precios = new ArrayList<>();

        System.out.println("Ingrese precios (escriba 's' o 'S' para terminar):");

        //Lee las entradas indefinidamente hasta que el usuario decida salir
        while (true) {
            String entrada = scanner.next(); //Lee  la entrada como texto

            if (entrada.equalsIgnoreCase("s")) { //verifica si el usuario escribió S o s
                break; // salir del bucle
            }

            try {
                double precio = Double.parseDouble(entrada); //convierte la entrada de texto a decimal
                precios.add(precio);
                
            //Si la entrada no es un nímero válido muestra un mensaje de error
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número o 's' para salir.");
            }
        }
        
        //Variable suma que acumila los precios
        double suma = 0;
        //Mediante iterator se recorre todos los precios de la lista
        Iterator<Double> ite = precios.iterator();
        
        /** Este bucle recorre todos los elementos: 
        it.hasNext() → devuelve true si todavía queda un elemento por recorrer.
        it.next() → devuelve el siguiente elemento y avanza al próximo.
        En cada vuelta del bucle, se suma ese valor a la variable suma.
        En otras palabras: va recorriendo la lista de precios y acumulando a la suma. */
        
        while (ite.hasNext()) {
            suma += ite.next();
        }

        if (!precios.isEmpty()) {
            double promedio = suma / precios.size();
            System.out.println("Precios: " + precios);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron precios.");
        }
        scanner.close();
    }
}



/*
public class Desafio_23 {

    public static void main(String[] args) {
        ArrayList<Double> precios = new ArrayList<>();

        precios.add(100.5);
        precios.add(200.2);
        precios.add(300.2);
        precios.add(500.1);

        double suma = 0;

        /*Se crea un iterador ite para recorrer el ArrayList de precios
        El método .Iterator devuelve un objeto que permite recorrer los elementos uno a uno. 
        Iterator<Double> ite = precios.iterator();

        /* Este bucle recorre todos los elementos: 
        it.hasNext() → devuelve true si todavía queda un elemento por recorrer.
        it.next() → devuelve el siguiente elemento y avanza al próximo.
        En cada vuelta del bucle, se suma ese valor a la variable suma.
        En otras palabras: va recorriendo la lista de precios y acumulando a la suma. 
        while (ite.hasNext()) {
            suma += ite.next();
        }

        double promedio = suma / precios.size();
        System.out.println("Precios: " + precios);
        System.out.println("Promedio: " + promedio);
    }

}
*/