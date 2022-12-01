/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adt.hashtable;

/**
 *
 * @author Mayra
 */
public class ADTHashTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TablaHash<String> tabla = new TablaHash<>(6);
        
        // Esta es la funcion add//
        
        tabla.add(60,"Adulto");
        tabla.add(80, "Anciano");
        tabla.add(10, "Niño");
        tabla.add(25, "Adolescente");
        tabla.add(2, "Infante");
        
        // Esta es la funcion valueOf//
        
        tabla.valueOf(60);
        tabla.valueOf(80);
        tabla.valueOf(25);
        
        // Esta es la funcion remove//
        
        tabla.remove(60);
        tabla.remove(2);
        tabla.remove(10);
    }
    
}
