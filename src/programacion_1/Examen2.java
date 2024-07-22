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
public class Examen2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = lea.nextInt();

        int num1 = 0, num2 = 1;
        int palabra = 0;
        int masjunto = 0;
        
        while (num1 <= numero) {
            System.out.print(num1 + " ");
            if (num1 == numero) {
                System.out.println("El termino de la secuencia de Fibonacci que suma " + numero + " es: " + palabra);
                System.out.println("");
                return;
            } else if (num1 < numero) {
                masjunto = num1;
            }
            int pal = num1 + num2;
            num1 = num2;
            num2 = pal;
            palabra++;
        }
        
        System.out.println("El termino de la secuencia de Fibonacci mas cercano y menor o igual a " + numero + " es: " + masjunto);
        
        lea.close();
    }
}