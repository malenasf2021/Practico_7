import java.util.ArrayList;
import java.util.Scanner;
import javax.naming.event.NamespaceChangeListener;

//Con scanner
public class Desafio_18 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();

        //Mensaje inicial
        System.out.println("Desafío 18");

        System.out.println("Ingrese números enteros (escriba s para terminar):");

        while (true) {
            String op = sc.next();
            
            
            if(op.equalsIgnoreCase("s")){
                break; //sale del bucle
            }
            
            try{
                int num = Integer.parseInt(op);
                enteros.add(num);
            }catch (NumberFormatException e){
                System.out.println("Entrada inválida, Ingrese un número entero o s para salir");
                
            }
        }

        int suma=0;
        for (int n : enteros){
            suma += n; 
        }
        
        if (!enteros.isEmpty()) {
            float promedio = (float) suma / enteros.size();
            System.out.println("Números: " + enteros);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }

        sc.close();

    }
}






/*
public class Desafio_18 {
     public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(10); 
        enteros.add(20); 
        enteros.add(30); 
        enteros.add(40); 
        
        int suma=0;
        for (int n : enteros){
            suma += n; 
        }
        float promedio = suma / enteros.size();
        
        System.out.println("Numeros: " + enteros);
        System.out.println("Promedio: " + promedio);
        
    }
}
*/