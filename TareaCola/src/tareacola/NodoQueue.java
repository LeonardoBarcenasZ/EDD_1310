/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacola;

/**
 *
 * @author Mayra
 */
public class NodoQueue<T> {
    private Nodo<T> frente;
    private Nodo<T> atras;
    private int length;

    public NodoQueue() {
        frente = atras = null;
        length = 0;
    }

    public boolean isEmpty() {
        return frente == null && length == 0;
    }

    public int length() {
        return length;
    }

    public T Dequeue() {
        if(isEmpty()) {
            return null;
        }

        if(frente == atras) {
            atras = null;
        }

        T topValor = frente.getData();
        frente = frente.getNext();
        length--;
        return topValor;
    }

    public T frente() {
        if(isEmpty()) {
            return null;
        }

        return frente.getData();
    }

    public void Enqueue(T valor) {
        Nodo<T> nuevoNodo = new Nodo<T>(valor);
        if(isEmpty()) {
            frente = atras = nuevoNodo;
        } else {
            atras.setNext(nuevoNodo);
            atras = nuevoNodo;
        }
        length++;
    }

    @Override
    public String toString() {
        String pilaString = "";
        Nodo<T> iNodo = frente;
        while(iNodo!= null){
            pilaString += iNodo;
            iNodo = iNodo.getNext();
        }
        return pilaString;
    }
    
}
