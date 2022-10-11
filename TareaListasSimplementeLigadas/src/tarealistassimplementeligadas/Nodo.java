/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealistassimplementeligadas;

/**
 *
 * @author Mayra
 */
public class Nodo {
    public int Dato;
    public Nodo Siguiente;
    public Nodo(int D){
        this.Dato = D;
    }

    public Nodo(int D, Nodo n) {
        Dato = D;
        Siguiente = n;
        
    }
}
