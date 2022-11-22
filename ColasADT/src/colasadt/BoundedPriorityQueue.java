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
public class BoundedPriorityQueue<T> extends Cola<T> {
    ArrayList<T> colaPrioridad;
    Cola<T> colaInterna;
    T sac;
    public BoundedPriorityQueue(){
        super.Dequeue();
        super.is_empty();
        super.length();
        colaInterna = new Cola<>();
        colaPrioridad = new ArrayList<>();
        for (int i = 0; i<6; i++){
            colaPrioridad.add((T) colaInterna);
        }
    }
    public void Enqueue(int Prioridad, T Elemento){
        colaPrioridad.add(Prioridad, Elemento);
    }
    public void DequeueBPQ(){
        colaPrioridad.remove(sac);
        T sacInterno= colaPrioridad.get(0);
        sacInterno.Dequeue();
    }
    
}
