/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import GUI.Pantalla;
import Clases.Archivo;
import Estructuras.Lista;

/**
 *
 * @author VirginiaT
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


