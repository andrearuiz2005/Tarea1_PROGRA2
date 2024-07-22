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
public class Ruiz_Andrea_Menu {
  public static void main(String[] args) {
      Scanner lea = new Scanner(System.in);
      
      lea.useDelimiter("\n");
      int menuC=0;
      String numeros;
      
      while (menuC != 4 ) {
          
           System.out.println("\n * * * * * * * * * Menu de cifras * * * * * * * * * ");
           System.out.println("1. Identificar cifras ");
           System.out.println("2. Suma de digitos ");
           System.out.println("3. Piramide ");
           System.out.println("4. Salir ");
           System.out.print("Ingrese el numero de ejercicio que desea realizar: ");
           menuC = lea.nextInt();
       
           if (menuC == 1){
               System.out.println("");
               System.out.println(" * * * * Identificador de cifras * * * * ");
               System.out.print("Introducir un numero entero: ");
               numeros=lea.next();
               
               int contar = numeros.length();
               System.out.println("");
               System.out.println(" * * * * Respuesta: * * * * ");
               System.out.println("El numero tiene " + contar + " cifras.");
               
           }else if (menuC == 2){
                System.out.println("");
                System.out.println(" * * * * Suma de cifras * * * * ");
                System.out.print("Ingresar numeros enteros no negativos: ");
                numeros = lea.next();
                int numero = Integer.parseInt(numeros);
                if (numero > 0) {
                    int suma = 0;
                    for (int i = 0; i < numeros.length(); i++) {
                        char cifraChar = numeros.charAt(i);
                        int cifraEntero = cifraChar - '0';
                        suma += cifraEntero;
                    }
                    System.out.println("");
                    System.out.println("  Respuesta de la Suma:  " + suma);
                } else {
                    System.out.println("Numero ingresado no valido. Por favor ingresar un numero positivo.");
                }
                
           }else if (menuC == 3){
               System.out.println("");
               System.out.println(" * * * * * * * Piramide * * * * * * * ");
               System.out.print("Ingrese un valor numerico: ");
               int piramideA=lea.nextInt();
               
               for (int i=1; i<= piramideA; i++) {
                   for (int espacio=1;espacio<i;espacio++) {
                        System.out.print("  ");
                    }
                    for (int menormayor=i ;menormayor<= piramideA;menormayor++) {
                        System.out.print(menormayor +" ");
                    }
                    for (int mayormenor= piramideA-1; mayormenor>=i;mayormenor--) {
                        System.out.print(mayormenor +" ");
                    }
                    System.out.println("");
                }
               
           }else if (menuC == 4){
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



  
