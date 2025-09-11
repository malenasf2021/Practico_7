//Importación de la clase HasMap
//HasMap es una colección que guarda pares clave-valor
import java.util.HashMap;
import java.util.Scanner;

/*Desafío 19 – Catálogo de productos
Usar un HashMap<Integer,String> donde la clave sea el código de producto y el valor su nombre. 
Mostrar todos los productos con sus claves.*/


public class Desafio_19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Crea un objeto HasMap llamdo catálogo
        HashMap<Integer, String> catalogo = new HashMap<>();
        
        System.out.println("Ingrese los productos al catálogo: ");
        System.out.println("Para salir escriba s.");
        
        while(true){
            System.out.println("Escriba el código del producto o s para salir");
            String entrada = sc.next();
            
            if(entrada.equalsIgnoreCase("s")){
                break; // en ese caso sale del bucle
            }
            try{
                int codigo = Integer.parseInt(entrada);//convierte a numero codigo
                System.out.println("Producto: ");
                String nombre = sc.next();
                
                //Con el método .put(clave, valor) se agregan pares clave-valor al catálogo
                catalogo.put(codigo, nombre); 
            }catch(NumberFormatException e){
                System.out.println("Código inválido. Debe ser un número entero");
                
            }
        }
    }
}



/*
public class Desafio_19 {
    public static void main(String[] args) {
        
        //Crea un objeto HasMap llamdo catálogo
        HashMap<Integer, String> catalogo = new HashMap<>();
        
        //Con el método .put(clave, valor) se agregan pares clave-valor al catálogo
        catalogo.put(101, "Laptop");
        catalogo.put(102, "Mouse");
        catalogo.put(103, "Teclado");
        
        System.out.println("Catálogo de productos");
        
        //Recorre todas las claves del HasMap
        for(Integer codigo : catalogo.keySet()){
            System.out.println("Código: " + codigo + " Producto: " + catalogo.get(codigo));
        }
        
    }
}

*/