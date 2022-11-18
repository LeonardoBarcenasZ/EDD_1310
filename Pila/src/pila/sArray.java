/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author Mayra
 */
public class sArray<T> {
    private T[] pila;
    private int Top;
    
    public sArray(int tamanio){
        pila = (T[]) new objeto[tamanio];
        Top = -1;
    }
    
    public boolean isEmpty(){
        return Top == -1;
    }
    
    public int longitud(){
        return Top + 1;
    }
    
    public T pop(){
        if (isEmpty()){
            return null;
        }
       T elemento = pila[Top]; 
       Top --;
       return elemento;
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return pila[Top];
    }

    public void push(T elemento) throws Exception {
        if (isFull()) {
            throw new Exception("Error, limite de longitud");
        }
        Top++;
        pila[Top] = elemento;
    }

    public boolean isFull() {
        return Top == pila.length - 1;
    }

    public String toString() {
        String pilaString = "";
        for (int i = 0; i <= Top; i++) {
            pilaString += pila[i] + " ------>>> ";
        }
        return pilaString;
    }
}
