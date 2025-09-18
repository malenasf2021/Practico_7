# 📚 Colecciones de Objetos en Java – Teórico y ejemplos
---

## 🔹 ArrayList
- Lista dinámica que almacena elementos en orden de inserción.  
- Permite índices (como un arreglo, pero redimensionable).  
- Admite elementos duplicados.  

✅ Ideal para listas de nombres o notas.

```java
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Ana"); // duplicado permitido

        System.out.println(nombres);         // [Ana, Pedro, Ana]
        System.out.println(nombres.get(1)); // Acceso por índice → Pedro
    }
}
```
---

## 🔹 HashMap
- Estructura de tipo clave → valor.  
- La clave debe ser única, pero los valores pueden repetirse.
- No mantiene orden de inserción.
- Tiene método `.put` para agregar a la colección.

✅ Ideal para listas de nombres o notas.

```java
import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> catalogo = new HashMap<>();
        catalogo.put(101, "Laptop");
        catalogo.put(102, "Mouse");
        catalogo.put(101, "Notebook"); // sobrescribe clave 101

        System.out.println(catalogo);        // {101=Notebook, 102=Mouse}
        System.out.println(catalogo.get(102)); // Acceso por clave → Mouse
    }
}
```
---

## 🔹 HashSet
- Conjunto que no admite duplicados.
- No mantiene orden definido.
- Solo permite comprobar si un elemento está o no.
- Método `contains`

✅ Ideal cuando se quiere evitar repetidos.

```java
import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> ciudades = new HashSet<>();
        ciudades.add("Montevideo");
        ciudades.add("Colonia");
        ciudades.add("Colonia"); // duplicado, no se guarda

        System.out.println(ciudades);              // [Montevideo, Colonia]
        System.out.println(ciudades.contains("Colonia")); // true
    }
}
```
---
## 🔹 LinkedList
- Lista enlazada doble que mantiene el orden de inserción.
- Cada elemento, llamado nodo, contiene tres cosas:
  - Dato → la información a almacenar.
  - Referencia al nodo siguiente.
  - Referencia al nodo anterior.
- Permite recorrer la lista hacia adelante y hacia atrás. 
- Más eficiente que ArrayList para insertar o eliminar en medio.
- Implementa Queue → tiene métodos de cola `(poll()`, `peek())`.

✅ Ideal para colas de tareas.

```java
import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> tareas = new LinkedList<>();
        tareas.add("Hacer la tarea");
        tareas.add("Lavar la ropa");

        System.out.println(tareas);    // [Hacer la tarea, Lavar la ropa]
        System.out.println(tareas.poll()); // Elimina y devuelve "Hacer la tarea"
        System.out.println(tareas.peek()); // Muestra "Lavar la ropa" sin eliminar
    }
}
```
---
## 🔹 TreeMap
- Mapa clave → valor que guarda los elementos ordenados por la clave.
- No admite claves repetidas.
- Tiene método `.put` para agregar a la colección.

 ✅ Ideal para diccionarios ordenados.

 ```java
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> diccionario = new TreeMap<>();
        diccionario.put("Dog", "Perro");
        diccionario.put("Cat", "Gato");
        diccionario.put("Bird", "Pájaro");

        System.out.println(diccionario);
        // {Bird=Pájaro, Cat=Gato, Dog=Perro} → ordenado alfabéticamente
    }
}
```
---
## 🔹 Iterator
- Objeto especial para recorrer colecciones.
- Métodos principales:
  - `hasNext()` → verifica si queda un elemento.
  - `next()` → devuelve el siguiente.
  - `remove()` → elimina el último devuelto.

 ✅ Ideal para diccionarios ordenados.

 ```java
import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        Iterator<Integer> it = numeros.iterator(); //recorre el elemento numeros uno por uno
        while (it.hasNext()) { //Pregunta si hay un siguiente elemento en la colección.
            System.out.println(it.next());
        }
        // Imprime 10, 20, 30
    }
}
```
## Resumen
| Colección / Interfaz | Duplicados  | Orden                | Acceso por índice      | Clave-Valor | Caso típico                   |
| -------------------- | ----------- | ------------------- | --------------------- | ----------- | ----------------------------- |
| **ArrayList**        | ✅ Sí       | Inserción           | ✅ Sí                  | ❌ No       | Lista de datos con posiciones |
| **HashMap**          | ❌ Claves   | ❌ No               | ❌ No                  | ✅ Sí       | Diccionario, agenda           |
| **HashSet**          | ❌ No       | ❌ No               | ❌ No                  | ❌ No       | Conjunto sin repetidos        |
| **LinkedList**       | ✅ Sí       | Inserción           | ✅ Sí (menos eficiente)| ❌ No       | Cola de tareas                |
| **TreeMap**          | ❌ Claves   | ✅ Ordenado por clave| ❌ No                  | ✅ Sí       | Diccionario ordenado          |
| **Iterator**         | N/A         | Según colección     | ❌ No                  | N/A        | Recorrido genérico            |
