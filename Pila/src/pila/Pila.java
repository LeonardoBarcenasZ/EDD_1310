/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

/**
 *
 * @author Mayra
 */
public class Pila {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        NodoP<Integer> nStack = new NodoP<>();
        System.out.println("Pila usando nodos");
        System.out.println("isEmpty(): " + nStack.isEmpty());
        System.out.println("length(): " + nStack.longitud());
        System.out.println("push(1)");
        nStack.push(1);
        System.out.println("push(2)");
        nStack.push(2);
        System.out.println("push(3)");
        nStack.push(3);
        System.out.println(nStack);
        System.out.println("peek(): " + nStack.peek());
        System.out.println("pop(): " + nStack.pop());
        System.out.println(nStack);

        sArray<Integer> aStack = new sArray<>(5);
        System.out.println("Pila usando Array");
        System.out.println("isEmpty(): " + aStack.isEmpty());
        System.out.println("length(): " + aStack.longitud());
        System.out.println("push(1)");
        aStack.push(1);
        System.out.println("push(2)");
        aStack.push(2);
        System.out.println("push(3)");
        aStack.push(3);
        System.out.println("push(4)");
        aStack.push(4);
        System.out.println("push(5)");
        aStack.push(5);
        System.out.println("isFull(): " + aStack.isFull());
        System.out.println(aStack);
        System.out.println("peek(): " + aStack.peek());
        System.out.println("pop(): " + aStack.pop());
        System.out.println(aStack);
    }
    
}
