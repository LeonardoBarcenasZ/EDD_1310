/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaempresa;

/**
 *
 * @author Mayra
 */
import java.util.Arrays;

public class empleado {
    public static final double MONTO_H_EXTRA = 276.5;
    public static final double PRESTACION_ANUAL = 0.03;
    private int numero_empleado;
    private String nombre;
    private String Paterno;
    private String Materno;
    private int horas_extra;
    private double salario_base;
    private int anio_ingreso;


    public empleado() {}

    public empleado(
            int numero_empleado,
            String nombre,
            String Paterno,
            String Materno,
            int horas_extra,
            double sueldo_Base,
            int anio_ingreso
    ){
        this.numero_empleado = numero_empleado;
        this.nombre = nombre;
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.horas_extra = horas_extra;
        this.salario_base = salario_base;
        this.anio_ingreso = anio_ingreso;
    }

    public int getnumero_empleado() {
        return numero_empleado;
    }

    public void setnumero_empleado(int numero_empleado) {
        this.numero_empleado = numero_empleado;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpaterno() {
        return Paterno;
    }

    public void setpaterno(String paterno) {
        this.Paterno = paterno;
    }

    public String getmaterno() {
        return Materno;
    }

    public void setmaterno(String materno) {
        this.Materno = materno;
    }

    public int gethoras_extra() {
        return horas_extra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horas_extra = horas_extra;
    }

    public double getsalario_base() {
        return salario_base;
    }

    public void setsalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public int getanio_ingreso() {
        return anio_ingreso;
    }

    public void setanio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public double calcular_sueldo(){
        double total = 0.0;
        total = salario_base;
        total += salario_base * ((2022 - anio_ingreso) * PRESTACION_ANUAL);
        total += MONTO_H_EXTRA * horas_extra;
        return total;
    }

    @Override
    public String toString() {
        String data = "#: " + numero_empleado +
            ", Nombre: " + nombre +
            " " + Paterno +
            " " + Materno +
            ", Horas extra: " + horas_extra +
            ", Salario base: " + salario_base +
            ", Anio de ingreso: " + anio_ingreso;
        return data;
    }

    void setPaterno(String lineaSeparadaPorComa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setMaterno(String lineaSeparadaPorComa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void sethoras_extra(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
