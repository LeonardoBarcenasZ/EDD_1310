/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaempresa;

import java.io.IOException;

/**
 *
 * @author Mayra
 */
public class TareaEmpresa {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
         nomina nomina = new nomina ("junio.dat", "EDD");
        nomina.calcular_salario();
        System.out.println("-----------------------------------------------------");
        nomina.obtener_MaxMin();
    }
}
