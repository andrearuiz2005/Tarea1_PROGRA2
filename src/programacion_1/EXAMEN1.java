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
public class EXAMEN1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");

        System.out.println("Ingresa una palabra: ");
        String palabra = lea.next().toLowerCase();

        int maxcantidad = 0;
        char caracterUtilizado = ' ';

        for (int i = 0; i < palabra.length(); i++) {
            char caracterActual = palabra.charAt(i);
            
            int frecuenciaActual = 0;

            for (int j = 0; j < palabra.length(); j++) {
                if (palabra.charAt(j) == caracterActual) {
                    frecuenciaActual++;
                }
            }

            if (frecuenciaActual > maxcantidad) {
                maxcantidad = frecuenciaActual;
                caracterUtilizado = caracterActual;
            }
        }

            System.out.println("El caracter mas frecuente es: '" + caracterUtilizado + "'");
            
    }
}