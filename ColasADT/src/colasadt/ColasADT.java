/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasadt;

/**
 *
 * @author Mayra
 */
public class ColasADT {

    public static void main(String[] args) {
        BoundedPriorityQueue<String> Barco = new BoundedPriorityQueue<>(6);
        Barco.is_empty();
        
        Barco.length();
        
        Barco.Enqueue(1, "Ninias");
        Barco.Enqueue(2, "Ninios");
        Barco.Enqueue(2, "Adultos Mayores");
        Barco.Enqueue(3, "Mujeres");
        Barco.Enqueue(3, "Hombres");
        Barco.Enqueue(4, "Maestre");
        Barco.Enqueue(4, "Mecanico");
        Barco.Enqueue(4,"Vigia");
        Barco.Enqueue(4, "Tibonel");
        Barco.Enqueue(5, "Capitan");
        
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();
        Barco.DequeueBPQ();

        Barco.toString();
    }
    
}
