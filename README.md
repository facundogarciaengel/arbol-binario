# Árbol Binario en Java 🌳

Este proyecto es una implementación de un Árbol Binario en Java que incluye funcionalidades para agregar nodos, calcular la altura del árbol y contar la cantidad total de nodos.

## Descripción

El árbol binario es una estructura de datos jerárquica en la que cada nodo tiene como máximo dos hijos, llamados hijo izquierdo e hijo derecho. Este proyecto implementa las siguientes operaciones básicas:

- **Agregar nodos**: Inserción recursiva de nuevos nodos en el árbol.
- **Calcular altura**: Determina la longitud de la rama más larga desde la raíz hasta un nodo hoja.
- **Contar nodos**: Calcula la cantidad total de nodos en el árbol.

## Funcionalidades

- **Agregar nodos**: Inserción dinámica de nodos en el árbol.
- **Altura del árbol**: Cálculo de la longitud del camino más largo.
- **Cantidad de nodos**: Cálculo recursivo del número de nodos.

## Instalación

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/facundogarciaengel/arbol-binario.git
2. Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, etc.).
3. Compila y ejecuta el proyecto.

Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        AB<Integer> arbol = new AB<>();
        arbol.agregar(5);
        arbol.agregar(3);
        arbol.agregar(7);

        System.out.println("Altura del árbol: " + arbol.altura());
        System.out.println("Cantidad de nodos: " + arbol.cantNodos());
    }
}
