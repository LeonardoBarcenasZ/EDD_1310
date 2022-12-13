/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Mayra
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer,String>map1= new HashMap<>();
        Map<Integer,String>map2= new TreeMap<>();
        Map<Integer,String>map3= new LinkedHashMap<>();
        
        System.out.println("");
        System.out.println("----->HashMap<-----");
        System.out.println("");
        
        //Este es el metodo isEmpty//
        System.out.println("¿Esta lista esta vacia? "+map1.isEmpty());
        
       //Este es el metodo put//
       System.out.println("Elementos que existen en la lista:");
        map1.put(4, "casa");
        map1.put(6, "parque");
        
        //Este es el metodo values//
        
        for(String valor: map1.values()) {
            System.out.println("--> "+ valor + " ");
        }
        
        //Este es el metodo size//
        
        System.out.println("Tamaño del mapa :"+map1.size());
        
        //Este es el metodo remove//
        System.out.println("Se quita un elemento de la lista:");
        map1.remove(4, "casa");
        
        for(String valor: map1.values()) {
            System.out.println("--> "+ valor + " ");
        }
        
        //Este es el metodo get//
        
        System.out.println("Se llama a la clave 6 :"+map1.get(6));
        
        //Este es el metodo clear//
        map1.clear();
        
        System.out.println("Eliminando valores");
        System.out.println("¿Esta lista esta vacia? "+map1.isEmpty());
        
        System.out.println("");
        System.out.println("----->TreeMap<-----");
        System.out.println("");
        
        //Este es el metodo isEmpty//
        System.out.println("¿Esta lista esta vacia? "+map2.isEmpty());
        
        //Este es el metodo put//
        System.out.println("Elementos que existen en la lista:");
        map2.put(7, "Cristiano");
        map2.put(10, "Messi");
        map2.put(4, "Ramos");
        
        //Este es el metodo values//
        
        for(String valor: map2.values()) {
            System.out.println("--> "+ valor + " ");
        }
        
        System.out.println("Remplazando jugador");
        
        //Este es el metodo replace//
        
        map2.replace(10, "Neymar");
        
          for(String valor: map2.values()) {
            System.out.println("--> "+ valor + " ");
        }
          
          //Este es el metodo size//
        
        System.out.println("Tamaño del mapa :"+map2.size());
        
        //Este es el metodo remove//
        System.out.println("Se quitan jugadores de la lista, dejando a los mejores en su posicion");
        map2.remove(10, "Neymar");
        
        for(String valor: map2.values()) {
            System.out.println("--> "+ valor + " ");
        }
        
        //Este es el metodo get//
        
        System.out.println("Se llama al mejor 4 de la historia:"+map2.get(4));
        
        //Este es el metodo clear//
        map2.clear();
        
        System.out.println("Eliminando valores");
        System.out.println("¿Esta lista esta vacia? "+map2.isEmpty());
        
        System.out.println("");
        System.out.println("----->LinkedHashMap<-----");
        System.out.println("");
        
        //Este es el metodo isEmpty//
        System.out.println("¿Esta lista esta vacia? "+map3.isEmpty());
        
        System.out.println("Elementos que existen en la lista:");
        map3.put(1, "Argentina");
        map3.put(2, "Polonia");
        map3.put(3, "Mexico");
        map3.put(4, "Arabia Saudita");
        
        //Este es el metodo values//
        
        for(String valor: map3.values()) {
            System.out.println("--> "+ valor + " ");
        }
        
        //Este es el metodo size//
        
        System.out.println("Tamaño del mapa :"+map3.size());
        
        //Este es el metodo remove//
        System.out.println("Se quitan las selecciones de la lista que no clasificaron a octavos:");
        map3.remove(3, "Mexico");
        map3.remove(4, "Arabia Saudita");
        
         for(String valor: map3.values()) {
            System.out.println("--> "+ valor + " ");
        }
        
         //Este es el metodo get//
        
        System.out.println("Se muestra la seleccion que clasifico a cuartos :"+map3.get(1));
        
        //Este es el metodo clear//
        map3.clear();
        
        System.out.println("Eliminando valores");
        System.out.println("¿Esta lista esta vacia? "+map3.isEmpty());
    }
    
}
