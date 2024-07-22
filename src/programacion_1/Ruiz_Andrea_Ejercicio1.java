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
public class Ruiz_Andrea_Ejercicio1 {
    public static void main(String[] args) {
    Scanner lea =new Scanner(System.in);
    
    System.out.println("Trabajo 1 ");
    System.out.println("Ingrese el numero de meses del prestamo: ");
    int numMeses = lea.nextInt();
    double tasaInteresMensual = 0.02;
    double prestamo = 100000.00;
    double interesTotal = (prestamo * tasaInteresMensual) / numMeses;
    
    System.out.println("        ");
    System.out.println("El interes total a pagar es: $" + interesTotal);
    
    }
}
