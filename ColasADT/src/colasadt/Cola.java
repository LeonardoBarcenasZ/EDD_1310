/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasadt;

import java.util.ArrayList;

/**
 *
 * @author Mayra
 */
public class Cola<T> {
    ArrayList<T> Cola;
    
    public Cola(){
        Cola = new ArrayList<>();
    }
    public boolean is_empty(){
        return Cola.isEmpty();
    }
    public int length(){
        return Cola.size();
    }
    public void Enqueue (T Element){
        Cola.add(Element);
    }
    public T Eequeue(){
        T Eliminado = Cola.get(Cola.size());
        Cola.remove(Cola.size());
        return Eliminado;
    }
    @Override
    public String toString(){
    String ed = "";
    for (T dato: Cola){
        ed+= dato;
    }
    return ed;
    }

}
