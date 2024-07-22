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
public class labia {
     public static void main(String[] args) {
      Scanner lea = new Scanner(System.in);

      lea.useDelimiter("\n");
      
        System.out.println("Ingrese la cantidad de palabras:");
        int cantidad = lea.nextInt();
        int tamaño=0;
        
        lea.nextLine(); 

        for (int index=1; index<=cantidad; index++) {
            System.out.println("Ingrese la palabra " + index + ":");
            String palabra = lea.next();
            
            for (int contar=0; contar<palabra.length();contar++){
                System.out.println("["+contar+"]: "+palabra.charAt(contar));
            }
            System.out.println("Tamaño: "+palabra.length());
            System.out.println("La palabra \"" + palabra + "\" tiene " + cantidad + " letras.");
        }

    }
}