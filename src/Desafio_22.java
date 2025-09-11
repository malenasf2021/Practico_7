/*Desafío 22 – Diccionario de palabras
Crear un TreeMap<String,String> que almacene palabras en inglés como clave y 
su traducción al español como valor. Mostrar en orden alfabético.*/

import java.util.TreeMap;
import java.util.Scanner;


public class Desafio_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<String, String> diccionario = new TreeMap<>();

        System.out.println("Ingrese las palabras en Inglés y luego su traducción al Español. Escriba s para salir.");

        while (true) {
            System.out.print("Palabra en inglés: ");
            String ingles = sc.nextLine();

            if (ingles.equalsIgnoreCase("s")) {
                break;
            }

            if (ingles.isEmpty()) {
                System.out.println("La palabra no puede estar vacía");
            }

            System.out.print("Traducción al español: ");
            String espaniol = sc.nextLine();

            if (espaniol.isEmpty()) {
                System.out.println("La palabra no puede estar vacía");
            }
            diccionario.put(ingles, espaniol);
        }
        
        //El TreeMap mantiene las clavez alfabéticamente
        System.out.println("Diccionario inglés español:");
        for(String palabra : diccionario.keySet()){
            System.out.println(palabra + " : " + diccionario.get(palabra));
        }
     sc.close();
    }
}



/*
public class Desafio_22 {
    public static void main(String[] args) {
        TreeMap<String, String> diccionario = new TreeMap<>();
        
        diccionario.put("House", "casa");
        diccionario.put("Key", "llave");
        diccionario.put("Kitchen", "cocina");
        diccionario.put("Microwave", "microondas");
        
        System.out.println("Diccionario Inglés - Español");
        for(String palabra : diccionario.keySet()){
            System.out.println(palabra + " : " + diccionario.get(palabra));
        }
    }
}
*/