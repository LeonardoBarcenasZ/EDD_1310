/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Mayra
 */
public class sNodo<T> {
    private NodoP<T> Top;
    private int longitud;
    
    public sNodo() {
        Top = null;
        longitud = 0;
    }

    public boolean isEmpty() {
        return Top == null && longitud == 0;
    }

    public int longitud() {
        return longitud;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        }

        T topValor = Top.getData();
        Top = Top.getNext();
        return topValor;
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }

        longitud--;
        return Top.getData();
    }

    public void push(T valor) {
        NodoP<T> newNode = new NodoP<T>(valor);
        newNode.setNext(Top);
        Top = newNode;
        longitud++;
    }

    @Override
    public String toString() {
        String pilaString = "";
        NodoP<T> iNode = Top;
        while(iNode != null){
            pilaString += iNode;
            iNode = iNode.getNext();
        }
        return pilaString;
    }
    
}
