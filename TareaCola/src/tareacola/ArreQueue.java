/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacola;

/**
 *
 * @author Mayra
 */
public class ArreQueue<T> {
    private T[] Queue;
    private int cola, frente, longitud;

    public ArreQueue(int tamanio) {
        Queue = (T[]) new Object[tamanio];
        frente = cola = -1;
        longitud = 0;
    }

    public boolean isEmpty() {
        return frente == -1;
    }

    public int length() {
        return longitud;
    }

    public T Dequeue() {
        T Element = null;
        if(!isEmpty()) {
            Element = Queue[frente];
            if (frente == cola) {
                frente = cola = -1;
            } else {
                frente = move(frente);
            }
        }
        return Element;
    }

    public T Font() {
        if (isEmpty()) {
            return null;
        }
        return Queue[frente];
    }

    public void Enqueue(T Element) throws Exception {
        if (!isFull()) {
            cola = move(cola);
            if (isEmpty()) {
                frente++;
            }
            Queue[cola] = Element;
        }
        longitud++;
    }

    public boolean isFull() {
        return  move(cola) == frente;
    }

    private int move(int Numero) {
        return (Numero + 1) % Queue.length;
    }

    public String toString() {
        String resultado = "";
        if (!isEmpty()) {
            int aux = frente;
            do {
                resultado += Queue[aux] + " ";
                aux = move(aux);
            } while (aux != move(cola));
        } else {
            resultado += "null";
        }
        return resultado;
    }

}
