/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaconjuntos;

/**
 *
 * @author Mayra
 */
public class TareaConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conjuntos<Integer> Ca = new Conjuntos();
        Conjuntos<Integer> Cb= new Conjuntos();

        Ca.add(7);
        Ca.add(1);
        Ca.add(8);
        Ca.add(9);
        Ca.add(5);
        Ca.add(0);
        Ca.add(12);
        Ca.add(4);
        Ca.add(2);
        Ca.add(11);
        
        Cb.add(1);
        Cb.add(11);
        Cb.add(5);
        Cb.add(2);
        Cb.add(7);
        Cb.add(0);

      
        System.out.println("Longitud de Ca:\t" + Ca.length());
        System.out.println("Longitud de Cb:\t" + Cb.length());
        System.out.println("");
        
        System.out.println("Conjuntos");
        System.out.println("Ca:\t"+Ca);
        System.out.println("Cb:\t"+Cb);
        System.out.println("");
                

       
        System.out.println("Ca tiene 1 \t" + Ca.contains(1));
        System.out.println("Ca tiene 3 \t" + Ca.contains(3));
        System.out.println("Cb tiene 4 \t" + Cb.contains(4));
        System.out.println("Cb tiene 11 \t" + Cb.contains(11));
        System.out.println("");

        // eliminacion
        Ca.remove(7);

        // método igual
        System.out.println("Ca igual a Cb :\t" + Ca.equals(Cb));

        // método subconjunto
        System.out.println("Cb es el subconjunto de Ca:\t" + Cb.isSubset(Ca));
        System.out.println("");

        // método de intersección
        Conjuntos<Integer> conjunto_intersection = Ca.intersection(Cb);
        System.out.println("interseccion entre Ca y Cb:\t" + conjunto_intersection);

        // método de diferencia
        Conjuntos<Integer> conjunto_difference = Ca.difference(Cb);
        System.out.println("Diferencia entre Ca y Cb:\t" + conjunto_difference);
        System.out.println("");

        // método de union 
        Ca.union(Cb);
        System.out.println("Ca U Cb " + Ca); 
        
    }
    
}
