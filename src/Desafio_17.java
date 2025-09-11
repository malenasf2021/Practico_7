 //Importación de la interfaz List para definir la lista de manera genérica
import java.util.List;
//Importación de la clase ArrayList para almacenar los nombres
import java.util.ArrayList;


//Importación de la clase Scanner para leer los datos ingresados
import java.util.Scanner;

public class Desafio_17 {

    public static void main(String[] args) {
        
        //Crea un objeto sc para leer las entradas del usuario
        Scanner sc = new Scanner(System.in);
        
        //Crea un objeto List de tipo String, nombres, para almacenar los nombres
        List<String> nombres = new ArrayList<>();

        //Mensaje inicial
        System.out.println("Desafío 17");
        
        //Variable de tipo String donde se guardará la opción dada por el usuario
        String opcion;

        //Bucle que se repite mientras el usuario quiera ingresar más nombres
        do {
            System.out.print("Ingrese un nombre: ");
            
            //Guarda la entrada del usuario en la variable nombre
            String nombre = sc.nextLine();
            
            //Luego lo agrega al ArrayList nombres
            nombres.add(nombre);

            //Pregunta si quiere continuar
            System.out.print("¿Desea ingresar otro nombre? (s/n): ");
            
            //Lee la entrada del usuario y la guarda en la variable opcion
            opcion = sc.nextLine();
        
        //Repite el bucle hasta que se ingrese s, indistinto si es S mayúscula o s minúscula
        } while (opcion.equalsIgnoreCase("s"));

        //Muestra un mensaje antes de mostrar la lista de nombres ingresados
        System.out.println("Lista de nombres ingresados:");
        
        //Bucle for que recorre la lista de nombres
        for (String n : nombres) {
            //Imprime cada nombre en una línea
            System.out.println(n);
        }
        //Cierra el objeto sc
        sc.close();
    }
}
