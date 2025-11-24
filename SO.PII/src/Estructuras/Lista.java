/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author VirginiaT
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Lista <T>{
    private Nodo <T> pFirst;
    private String name;
    private int iN;
    
    
    public Lista (String s){
        this.name=s;
        this.pFirst=null;
        this.iN=0;
    }
    
    public Nodo<T> obtenerNodo(Object elem) {
        Nodo<T> actual = this.pFirst;
        while (actual != null) {
            if (actual.gettInfo().equals(elem)) {
                return actual;
            }
            actual = actual.getpNext();
        }
        return null;
    }
    
    public int size (){
        return this.iN;
    }
    
    public boolean isEmpty(){
        return this.pFirst==last();
    }
    
    public Nodo last(){
        return null;
    }
    
    public Nodo first(){
        return this.pFirst;
    }
    
    public T read(Nodo <T> pValor){
        return pValor.gettInfo();
    }
    
    public Nodo <T> next (Nodo <T> pValor){
        if (pValor != this.last()){
            return pValor.getpNext();
        }else{
            return null;
        }
    }
    
    public T get(int index) {
        if (index < 0 || index >= iN) {
            throw new IndexOutOfBoundsException("index overflow");
        }

        Nodo<T> current = pFirst;
        for (int i = 0; i < index; i++) {
            current = current.getpNext();
        }
        return current.gettInfo();
    }
    
    public void insert(T x, Nodo <T> pValor){
     // postinsertar.   
        Nodo <T> pNew= new Nodo <>(x);
        if (this.isEmpty()){
            this.pFirst=pNew;
        }else{
            pNew.setpNext(pValor.getpNext());
            pValor.setpNext(pNew);
        }
        iN++;
    }
    
    public String travel (){
        Nodo <T> pAux; 
        String result="";
        if(this.isEmpty()){
            result="Está vacía";
        }else{
            pAux=this.first();
            while (pAux != this.last()){
                result=result+this.read(pAux)+ ", ";
                pAux=this.next(pAux);
            }
            
        }
        return result;
    }
    
    public void append(T data) {
        Nodo<T> newNode = new Nodo<>(data);
        if (pFirst == null) {
            pFirst = newNode;
        } else {
            Nodo<T> temp = pFirst;
            while (temp.getpNext()!= null) {
                temp = temp.getpNext();
            }
            temp.setpNext(newNode);
        }
        iN++;
    }
    
    
    public Nodo <T> beforeLast(){
        if (this.isEmpty()){
            return null;
        }else{
            Nodo <T> pAux=this.first();
            while (pAux.getpNext()!= this.last()){
                pAux=this.next(pAux);
            }
            return pAux;
        }
    }
    
    public void deleteByIndex(int index) {
        // Verificar que el índice sea válido
        if (index < 0 || index >= iN) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }

        // Si el nodo a eliminar es el primero
        if (index == 0) {
            pFirst = pFirst.getpNext(); // Actualizamos el inicio de la lista
        } else {
            Nodo<T> current = pFirst;
            Nodo<T> previous = null;

            // Recorremos la lista hasta llegar al índice
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.getpNext();
            }

            // Actualizar el puntero del nodo anterior para saltar el nodo actual
            if (previous != null) {
                previous.setpNext(current.getpNext());
            }
        }

        // Reducir el tamaño de la lista
        iN--;
    }
}
