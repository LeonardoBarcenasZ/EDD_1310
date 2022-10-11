/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealistassimplementeligadas;

/**
 *
 * @author Mayra
 */
public class Lista {
    protected Nodo Inicio,Fin;

    public Lista() {
        Inicio = null;
        Fin = null;
    }
    
    public void aniadirAlInicio(int elemento){
        Inicio = new Nodo(elemento, Inicio);
        if(Fin == null){
            Fin = Inicio;
        }
    }
    
    public void mostrarLista (){
        Nodo recorrer = Inicio;
        System.out.println();
        System.out.println();
        
        while(recorrer != null){
            System.out.print("[" + recorrer.Dato + "]--->");
            recorrer = recorrer.Siguiente;
        }
    }
    
    
}
