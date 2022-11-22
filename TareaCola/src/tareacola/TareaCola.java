/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacola;

/**
 *
 * @author Mayra
 */
public class TareaCola {

    /**
     */
    public static void main(String[] args) throws Exception {
        
       NodoQueue<Integer> nodeQueue = new NodoQueue<>();
        System.out.println("NodeQueue");
        System.out.println("isEmpty: " + nodeQueue.isEmpty());
        System.out.println("Enqueue(1)");
        nodeQueue.Enqueue(1);
        System.out.println("Enqueue(2)");
        nodeQueue.Enqueue(2);
        System.out.println("Enqueue(3)");
        nodeQueue.Enqueue(3);
        System.out.println(nodeQueue);
        System.out.println("length: " + nodeQueue.length());
        System.out.println("isEmpty: " + nodeQueue.isEmpty());
        System.out.println("frentet: " + nodeQueue.frente());
        System.out.println("Dequeue: " + nodeQueue.Dequeue());
        System.out.println("Dequeue: " + nodeQueue.Dequeue());
        System.out.println("Dequeue: " + nodeQueue.Dequeue());
        System.out.println("isEmpty: " + nodeQueue.isEmpty());

        ArreQueue<Integer> arrayQueue = new ArreQueue<>(5);
        System.out.println("QueueArray");
        System.out.println("isEmpty: " + arrayQueue.isEmpty());
        System.out.println("Enqueue(1)");
        arrayQueue.Enqueue(1);
        System.out.println("Enqueue(2)");
        arrayQueue.Enqueue(2);
        System.out.println("Enqueue(3)");
        arrayQueue.Enqueue(3);
        System.out.println(arrayQueue);
        System.out.println("length: " + arrayQueue.length());
        System.out.println("isEmpty: " + arrayQueue.isEmpty());
        System.out.println("frente: " + arrayQueue.frente());
        System.out.println("Dequeue: " + arrayQueue.Dequeue());
        System.out.println("Dequeue: " + arrayQueue.Dequeue());
        System.out.println("Dequeue: " + arrayQueue.Dequeue());
        System.out.println("isEmpty: " + arrayQueue.isEmpty());
    }
    
}
