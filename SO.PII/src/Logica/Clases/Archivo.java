/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Clases;

/**
 *
 * @author VirginiaT
 */

/**
 * Clase Archivo.
 *
 * Representa un archivo individual dentro del Sistema de Archivos Simulado.
 * Almacena todos los metadatos necesarios para su gestión, su ubicación en la simulación
 * del disco (SDtable) y el contenido asociado.
 */

public class Archivo {
    
    private String nombre;
    private int id;
    private int longitud;
    private int posicioni;
    private int posicionj;
    private String contenido;
    private String color;

    public Archivo(String nombre, int id, int longitud, int posicioni, int posicionj, String contenido, String color) {
        this.nombre = nombre;
        this.id = id;
        this.longitud = longitud;
        this.posicioni = posicioni;
        this.posicionj = posicionj;
        this.contenido = contenido;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getPosicioni() {
        return posicioni;
    }

    public void setPosicioni(int posicioni) {
        this.posicioni = posicioni;
    }

    public int getPosicionj() {
        return posicionj;
    }

    public void setPosicionj(int posicionj) {
        this.posicionj = posicionj;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
     @Override
    public String toString() {
        return nombre; // Devuelve solo el nombre para mostrar en el JTree (lo que hace en realidad es que cada vez que el objeto es referenciado como una cadena, retorne esto)
    }
    
    
    
    
}
