/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.Estructuras;

/**
 *
 * @author VirginiaT
 */

/**
 * Clase Nodo<T>.
 *
 * Representa un nodo individual en la implementación de la lista enlazada simple genérica (Clase Lista).
 * Cada nodo almacena un elemento de dato y una referencia al siguiente nodo en la secuencia.
 * Es la base fundamental para la construcción dinámica de la lista.
 *
 * @param <T> El tipo de dato que almacenará el nodo.
 */

public class Nodo <T>{
    private T tInfo;
    private Nodo <T> pNext;
    
    //Constructor
    public Nodo (T elem){
        this.tInfo=elem;
        this.pNext=null;
        
    } 

    /**
     * @return the tInfo
     */
    public T gettInfo() {
        return tInfo;
    }

    /**
     * @param tInfo the tInfo to set
     */
    public void settInfo(T tInfo) {
        this.tInfo = tInfo;
    }

    /**
     * @return the pNext
     */
    public Nodo <T> getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo <T> pNext) {
        this.pNext = pNext;
    }
    
}