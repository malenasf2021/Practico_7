
import java.util.HashMap;
import java.util.Scanner;

public class Desafio_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();

        System.out.println("Ingrese contactos de la agenda: nombre y apellido  y teléfono. Para salir escriba s.");

        while (true) {
            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();

            if (telefono.equalsIgnoreCase("s")) {
                break; // salir del bucle
            }

            if (telefono.isEmpty()) {
                System.out.println("El teléfono no puede estar vacío.");
                continue;
            }

            System.out.print("Nombre y apellido: ");
            String nombre = sc.nextLine();

            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
            }

            agenda.put(telefono, nombre);
        }

        System.out.println("Agenda telefónica:");
        for (String telefono : agenda.keySet()) {
            System.out.println(telefono + ": " + agenda.get(telefono));
        }

        sc.close();
    }
}



/* 
public class Desafio_24 {
    public static void main(String[] args) {
        
        //Crea un objeto HasMap llamdo catálogo
        HashMap<String, String> agenda = new HashMap<>();
        
        agenda.put("09912345678", "María Gonzalez");
        agenda.put("09923456789", "Carlos Ramírez");
        agenda.put("09934567890", "Juan Pérez");
        
        System.out.println("Agenda telefónica: ");
        for(String nombre : agenda.keySet()){
            System.out.println(nombre + " : " + agenda.get(nombre));
        }
    }
}
*/