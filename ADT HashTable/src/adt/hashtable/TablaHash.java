/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt.hashtable;

import java.util.ArrayList;

/**
 *
 * @author Mayra
 * @param <T>
 */
public class TablaHash<T> {
    int Posicion;
    ArrayList<T> tabla;
    int tamanioTabla;
    
    public TablaHash(int tamanioTabla){
        tabla= new ArrayList(tamanioTabla);
    }
    public void add(int key, T value){
        Posicion= key % tamanioTabla;
        tabla.add(Posicion , value);
    }

    public T valueOf(int key){
        Posicion= key % tamanioTabla;
        return tabla.get(Posicion);
    }
    public void remove(int key){
        Posicion= key % tamanioTabla;
        tabla.remove(Posicion);
    }
}
