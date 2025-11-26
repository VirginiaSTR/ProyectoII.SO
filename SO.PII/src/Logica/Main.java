/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;
import GUI.Pantalla;
import Logica.Clases.Archivo;
import Logica.Estructuras.Lista;

/**
 *
 * @author VirginiaT
 */


/**
 * Clase Main.
 *
 * Esta es la clase principal que contiene el método 'main', el punto de entrada
 * de la aplicación Simulación de Sistema de Archivos.
 *
 * Se encarga de:
 * 1. Inicializar las estructuras de datos fundamentales (como la lista de Archivos).
 * 2. Crear y hacer visible la interfaz gráfica principal (Clase Pantalla).
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista<Archivo> listaArchivos = new Lista<>("Archivos");       
        Pantalla pantalla1 = new Pantalla(listaArchivos);
        pantalla1.setVisible(true);
    }
    
}
