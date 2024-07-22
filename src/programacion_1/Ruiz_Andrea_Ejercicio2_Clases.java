/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_1;
import java.util.Scanner;
/**
 *
 * @author ar466
 */
public class Ruiz_Andrea_Ejercicio2_Clases {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        lea.useDelimiter("\n");
        

        System.out.println("Ingrese el dia de la semana (lunes, martes, miércoles, jueves, viernes):");
        String diaSemana = lea.nextLine().toLowerCase();
        System.out.println("Ingrese la fecha (DD/MM):");
        String fecha = lea.nextLine();

        String[] fechaParts = fecha.split("/");
        int dia = Integer.parseInt(fechaParts[0]);
        int mes = Integer.parseInt(fechaParts[1]);


        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Error: ");
            return;
        }


        System.out.println("Fecha: " + diaSemana + ", " + fecha);


        if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miércoles")) {
            System.out.println("Nivel: inicial / intermedio / avanzado");
            System.out.println("¿Se tomaron examenes? ");
            String examenes = lea.nextLine().toLowerCase();
            if (examenes.equals("s")) {
                System.out.println("Ingrese la cantidad de alumnos que aprobaron:");
                int aprobados = lea.nextInt();
                System.out.println("Ingrese la cantidad de alumnos que no aprobaron:");
                int noAprobados = lea.nextInt();
                double porcentajeAprobados = ((double) aprobados / (aprobados + noAprobados)) * 100;
                System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
            }
        } else if (diaSemana.equals("jueves")) {
            System.out.println("Nivel: práctica hablada");
            System.out.println("Ingrese el porcentaje de asistencia a clase:");
            int asistencia = lea.nextInt();
            if (asistencia > 50) {
                System.out.println("Asistio la mayoría");
            } else {
                System.out.println("No asistio la mayoria");
            }
        } else if (diaSemana.equals("viernes")) {
            if (mes == 1 || mes == 7) {
                System.out.println("Comienzo de nuevo ciclo");
                System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo:");
                int alumnos = lea.nextInt();
                System.out.println("Ingrese el precio en $ por cada alumno:");
                int precio = lea.nextInt();
                int ingresoTotal = alumnos * precio;
                System.out.println("Ingreso total: " + ingresoTotal);
            } else {
                System.out.println("Nivel: ingles para viajeros");
            }
        } else {
            System.out.println("Error: ");
        }
    }
}
