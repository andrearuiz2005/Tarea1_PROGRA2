/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package II_PARCIAL;

/**
 *
 * @author ar466
 */
public class EmpleadoPorHora {
    private String nombre;
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, double tarifaPorHora) {
        this.nombre = nombre;
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horas) {
        this.horasTrabajadas = horas;
    }

    public double calcularPago() {
        return tarifaPorHora * horasTrabajadas;
        
        
    }
}
