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
public class Ruiz_Andrea_Plantilla_de_empleado {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        lea.useDelimiter("\n"); 
        
        //hTrabajadas = horas trabajadas
        //tpHora = tarifa por hora
        //sSemanal = Salario Semanal 
        //nCompleto = nombre completo 
        
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("            Plantilla de Empleada              ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.print("Ingrese el nombre completo del empleado: ");
        String nCompleto = lea.next(); 
        System.out.print("Ingrese las horas trabajadas en el mes: ");
        double hTrabajadas = lea.nextDouble();
        System.out.print("Ingrese la tarifa por hora: ");
        double tpHora = lea.nextDouble();
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * *");
        
        double sSemanal = (hTrabajadas * tpHora) / 4;
       
       
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("             Boleta del Empleado               ");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Empleado: " + nCompleto);
        System.out.println("Hora de Trabajo Mensual: " + hTrabajadas);
        System.out.println("Tarifa por Hora: " + tpHora);
        System.out.println("Salario del Empleado Semanal: " + sSemanal);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
