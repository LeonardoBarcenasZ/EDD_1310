/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealistassimplementeligadas;

import javax.swing.JOptionPane;

/**
 *
 * @author Mayra
 */
public class TareaListasSimplementeLigadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lista lista = new Lista();
        int opcion = 0,el;
       do{
           try {
               opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                       "1. Añadir elemento al inicio de la lista\n2.Mostrar los datos\n"
                               + "3. Salir","Menu de opciones",3));
               switch(opcion){
                   
                   case 1:
                       try {
                           el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento:",
                                   "Colocando al inicio",3));
                           lista.aniadirAlInicio(el);
                   } catch (NumberFormatException n) {
                       JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                   }
                       break;
                   case 2:
                           lista.mostrarLista();
                       break;
                   case 3:
                       break;
                   default:
                       JOptionPane.showMessageDialog(null, "Opción Incorrecta" );
                      
                   }
                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                   }
           
                   }while(opcion!=3);
    }
    
}
