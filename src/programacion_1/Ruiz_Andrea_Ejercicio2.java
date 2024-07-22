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
public class Ruiz_Andrea_Ejercicio2 {
    public static void main(String[] args) {
    Scanner lea =new Scanner(System.in);
    
    System.out.println("Trabajo 2 ");
    System.out.println("Ingrese el numero total de segundos: ");
    int tSegundos = lea.nextInt();
    
    int horas = tSegundos / 3600;
    int restoHoras = tSegundos - (horas * 3600);

    int minutos = restoHoras / 60;
    int segundos = restoHoras - (minutos * 60);
    
    System.out.println("        ");
    System.out.println("Horas: " + horas);
    System.out.println("Minutos: " + minutos);
    System.out.println("Segundos: " + segundos);
         
    }
}
