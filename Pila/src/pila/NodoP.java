/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Mayra
 */
public class NodoP<T> {
    private T data;
    private NodoP<T> next;
    
    public NodoP() {
    }

    public NodoP(T valor) {
        this.data = valor;
    }

    public NodoP(T data, NodoP<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoP<T> getNext() {
        return next;
    }

    public void setNext(NodoP<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "|" + data + "| ------>>> ";
    }

}
