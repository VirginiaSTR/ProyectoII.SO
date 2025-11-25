/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Clases;

import Logica.Estructuras.Lista;

/**
 *
 * @author VirginiaT
 */
public class TreeNodeData {
    private String nombre;
    private boolean esCarpeta;
    private Lista<TreeNodeData> hijos;
    
    // Datos específicos para nodos de tipo Archivo
    private String contenido;
    private int longitud;
    private int posicioni;
    private int posicionj;
    private String color;

    public TreeNodeData(String nombre, boolean esCarpeta) {
        this.nombre = nombre;
        this.esCarpeta = esCarpeta;
        this.hijos = new Lista<>("Hijos");
    }

    // Constructor para nodos de tipo Archivo
    public TreeNodeData(Archivo archivo) {
        this.nombre = archivo.getNombre();
        this.esCarpeta = false;
        this.hijos = new Lista<>("Hijos");

        // Copiar información del archivo
        this.contenido = archivo.getContenido();
        this.longitud = archivo.getLongitud();
        this.posicioni = archivo.getPosicioni();
        this.posicionj = archivo.getPosicionj();
        this.color = archivo.getColor();
    }

    // Getters y setters para todos los atributos (si es necesario)
    public String getNombre() {
        return nombre;
    }

    public boolean isEsCarpeta() {
        return esCarpeta;
    }

    public Lista<TreeNodeData> getHijos() {
        return hijos;
    }

    public void agregarHijo(TreeNodeData hijo) {
        this.hijos.append(hijo);
    }

    public String getContenido() {
        return contenido;
    }

    public int getLongitud() {
        return longitud;
    }

    public int getPosicioni() {
        return posicioni;
    }

    public int getPosicionj() {
        return posicionj;
    }

    public String getColor() {
        return color;
    }
}
