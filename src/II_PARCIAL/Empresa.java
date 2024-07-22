/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package II_PARCIAL;

import Prueba.EmpleadoPorHora;

/**
 *
 * @author ar466
 */

public class Empresa {
    private EmpleadoPorHora[] empleados;
    private int numEmpleados;

    public Empresa(int maxEmpleados) {
        empleados = new EmpleadoPorHora[maxEmpleados];
        numEmpleados = 0;
    }

    public boolean agregarEmpleado(EmpleadoPorHora empleado) {
        if (numEmpleados < empleados.length) {
            empleados[numEmpleados++] = empleado;
            return true;
        }
        return false;
    }

    public EmpleadoPorHora buscarEmpleado(String nombre) {
        for (int i = 0; i < numEmpleados; i++) {
            if (empleados[i].getNombre().equals(nombre)) {
                return empleados[i];
            }
        }
        return null;
    }

    public String mostrarEmpleados() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numEmpleados; i++) {
            sb.append("Empleado: ").append(empleados[i].getNombre())
              .append(", Tarifa por hora: ").append(empleados[i].getTarifaPorHora())
              .append(", Horas trabajadas: ").append(empleados[i].getHorasTrabajadas())
              .append("\n");
        }
        return sb.toString();
    }

    public boolean asignarHoras(String nombre, int horas) {
        EmpleadoPorHora empleado = buscarEmpleado(nombre);
        if (empleado != null) {
            empleado.setHorasTrabajadas(horas);
            return true;
        }
        return false;
    }

    public String pagarEmpleado(String nombre) {
        EmpleadoPorHora empleado = buscarEmpleado(nombre);
        if (empleado != null) {
            double pago = empleado.calcularPago();
            return "Pago a " + empleado.getNombre() + ": " + pago;
        }
        return "Empleado no encontrado.";
    }
}
