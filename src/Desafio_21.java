/*Desafío 21 – Cola de tareas
Implementar una LinkedList<String> para simular una cola de tareas pendientes. Extraer la
primera tarea y mostrar la siguiente en orden.*/

//Importa la clase LinkedList que permite manejar una lista enlazada (secuencia de elementos).
//LinkedList implementa la interfaz Queue (cola) por eso tiene los métodos poll() y peek()
import java.util.LinkedList;
import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

//Con Scanner

public class Desafio_21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Se crea una LinkedList de tipo String llamada tareas
        LinkedList<String> tareas = new LinkedList<>();

        System.out.println("Ingrese las tareas o escriba s para salir");

        while (true) {
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("s")) {
                break;
            }

            //si la cadena no está vacía, agrega entradas
            if (!entrada.isEmpty()) {
                tareas.add(entrada);
            } else {
                System.out.println("Entrada vacía, intente nuevamente");
            }
        }

        System.out.println("Cola de tareas" + tareas);

        if (!tareas.isEmpty()) {
            //El método poll elimina el primer elemento de la cola y devuelve ese elemento para mostrarlo o usarlo
            String primera = tareas.poll();
            System.out.println("Tarea realizada: " + primera);

            if (!tareas.isEmpty()) {
                //El método peek devuelve el primer elemento de la lista sin eliminarlo
                //si la lista está vacía devuelve null
                //Después de haber quitado mudarme ahora la primera tarea en comprar caja
                System.out.println("Siguiente tarea: " + tareas.peek());
            } else {
                System.out.println("No hay más tareas en la cola");
            }
        } else {
            System.out.println("No se ingresaron tareas");
        }

        sc.close();
    }
}

/*
public class Desafio_21 {
    public static void main(String[] args) {
        
        //Se crea una LinkedList de tipo String llamada tareas
        LinkedList<String> tareas = new LinkedList<>();
        
        //En una cola el primero en entrar es el primero en salir (FIFO)
        tareas.add("Mudarme");
        tareas.add("Comprar cajas");
        tareas.add("Comprar muebles");
        
        System.out.println("Cola de tareas" + tareas);
        
        //El método poll elimina el primer elemento de la cola y devuelve ese elemento para mostrarlo o usarlo
        String primera = tareas.poll();
        System.out.println("Tarea realizada: " + primera);
        
        //El método peek devuelve el primer elemento de la lista sin eliminarlo
        //si la lista está vacía devuelve null
        //Después de haber quitado mudarme ahora la primera tarea en comprar caja
        System.out.println("Siguiente tarea: " + tareas.peek());
    }
}
*/