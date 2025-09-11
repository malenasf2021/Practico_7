/*Desafío 20 – Conjunto de ciudades
Crear un HashSet<String> con nombres de ciudades. Mostrar las ciudades y verificar si
“Colonia” está presente.*/

import java.util.HashSet;
import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

//Con Scanner 


public class Desafio_20 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       HashSet<String> ciudades = new HashSet<>();
       
        System.out.println("Ingrese nombres de ciudades o escriba s para salir.");
        
        while(true){
            String entrada = sc.nextLine();
            
            if(entrada.equalsIgnoreCase("s")){
                break; // sale del bucle
            }
            

            //si la cadena no está vacía
            if(!entrada.isEmpty()){ 
                ciudades.add(entrada); //agrega ciudades
            }else{
                System.out.println("Entrada vacía, intente nuevamente");
            }
        }
        
        System.out.println("Ciudades ingresadas" + ciudades);
        
        if(ciudades.contains("Colonia")|| ciudades.contains("colonia")|| ciudades.contains("COLONIA")){
            System.out.println("Encontramos a Colonia!");
        }else{
            System.out.println("Nop, Colonia no está!");
        }
    }
}



/*
public class Desafio_20 {
    public static void main(String[] args) {
        HashSet<String> ciudades = new HashSet<>();
        ciudades.add("Montevideo");
        ciudades.add("Rivera");
        ciudades.add("Colonia");
        ciudades.add("Punta del Este");
        
        System.out.println("Ciudades: " + ciudades);
        
        if(ciudades.contains("Colonia")){
            System.out.println("¡Encontramos a Colonia!");
        }else{
            System.out.println("Nop, Colonia no está.");
        }
    }
}
*/