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
public class Ruiz_Andrea_Control {
     public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
    
        lea.useDelimiter("\n");
        
        int menu = 0;
        
        
        while (menu != 3) {
            System.out.println("\n Menu");
            System.out.println("1. Palindroma ");
            System.out.println("2. Piramide de numeros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            menu = lea.nextInt();
            
            if (menu == 1) {
                System.out.println("");
                System.out.println("Palindroma: ");
                System.out.println("Ingresa la cantidad de palabras: ");
                int cantidadPalabras = lea.nextInt();
                lea.nextLine(); // Limpiar el buffer del scanner
                
                for (int j = 0; j < cantidadPalabras; j++) {
                    System.out.print("Ingrese la palabra " + (j + 1) + ": ");
                    String palabraVocal = lea.next().toLowerCase();
                    int longitud = palabraVocal.length();
                    boolean esPalindromo = true;
                    
                    for (int i = 0; i < longitud / 2; i++) {
                        if (palabraVocal.charAt(i) != palabraVocal.charAt(longitud - i - 1)) {
                    esPalindromo = false;
                  
                }
            }

                if (esPalindromo) {
                    System.out.println("La palabra es palíndroma.");
                } else {
                    System.out.println("La palabra no es palíndroma.");
                
                }
                
                }
            }else if (menu == 2){
                    System.out.print("Número: ");
                    int numero = lea.nextInt();

                    for (int i = 1; i <= numero; i++) {
                    // Imprimir espacios en blanco
                    for (int j = 1; j <= numero - i; j++) {
                    System.out.print("  ");
                    }

                    // Imprimir números ascendentes
                    for (int j = 1; j <= i; j++) {
                    System.out.print(j + "   ");
                }

                    // Imprimir números descendentes
                    for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + "   ");
                }

                    // Nueva línea para el siguiente nivel
                    System.out.println();
                }
            
        
                
            }else if (menu == 3){
                    System.out.println("");
                    System.out.println(" * * * * Gracias por utilizar este menu * * * * ");
                    }else {
                    System.out.println("");
                    System.out.println("****************************************************************************");
                    System.out.println("No existe esa opcion, intente con otra opcion que *si* aparezca en el menu.");
               
            }
        }
     }
}

            




     

