/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaempresa;

/**
 *
 * @author Mayra
 */
import java.io.BufferedReader
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class nomina {

    static void obtener_MaxMin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void calcular_salario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nombre_compania;
    private arreglo<empleado> empleados;
    private String rutaArch;
    public static String SEPARADOR_SALTO_DE_LINEA = "\n";
    public static String SEPARADOR_COMA = ",";
    private BufferedReader lect;
    private String renglon; 
    private String par[] = null;

    public nomina(String rutaArch, String nombre_compania) throws IOException {
        this.nombre_compania = nombre_compania;
        this.rutaArch = rutaArch;
        int contador = 0;
        String line, fileContent = "";
        BufferedReader bufferLectura = new BufferedReader(new FileReader(this.rutaArch));

        bufferLectura.readLine();
        while((line = bufferLectura.readLine()) != null) {
            fileContent += line + "\n";
            contador++;
        }
        bufferLectura.close();

        String[] separadoPorSaltosDeLinea = fileContent.split(SEPARADOR_SALTO_DE_LINEA);

        empleados = new arreglo<>(contador);

        for(int i = 0; i < separadoPorSaltosDeLinea.length; i++) {
            String[] lineaSeparadaPorComas = separadoPorSaltosDeLinea[i].split(SEPARADOR_COMA);
            empleado trabajadorTemp = new empleado();
            trabajadorTemp.setnumero_empleado(parseInt(lineaSeparadaPorComas[0]));
            trabajadorTemp.setnombre(lineaSeparadaPorComas[1]);
            trabajadorTemp.setPaterno(lineaSeparadaPorComas[2]);
            trabajadorTemp.setMaterno(lineaSeparadaPorComas[3]);
            trabajadorTemp.sethoras_extra(parseInt(lineaSeparadaPorComas[4]));
            trabajadorTemp.setsalario_base(parseInt(lineaSeparadaPorComas[5]));
            trabajadorTemp.setanio_ingreso(parseInt(lineaSeparadaPorComas[6]));
            empleados.setItem(i, trabajadorTemp);
        }
    }
    
    public void imprimirLinea() {
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i]+ "  |  ");
        }
    }

    public void calcularSalario() {
        for(int i = 0; i < empleados.getLength(); i++){
            System.out.println(empleados.getItem(i));
            System.out.println("Salario total: " + empleados.getItem(i).calcular_sueldo());
        }
    }

    public void obtenerMaxMin() {
        empleado maxEmpleado = empleados.getItem(0);
        empleado minEmpleado = empleados.getItem(0);
        for(empleado currTrabajador : empleados) {
            if(currTrabajador.getanio_ingreso() > maxEmpleado.getanio_ingreso()) {
                maxEmpleado = currTrabajador;
            }
            if(currTrabajador.getanio_ingreso() < minEmpleado.getanio_ingreso()) {
                minEmpleado = currTrabajador;
            }
        }

        System.out.println("Empleados con mas y menos antiguedad en: " + nombre_compania);
        System.out.println("Primer empleado encontrado con menor antiguedad: ");
        System.out.println(minEmpleado);
        System.out.println("Primer empleado encontrado con mayor antiguedad: ");
        System.out.println(maxEmpleado);
    }
}
