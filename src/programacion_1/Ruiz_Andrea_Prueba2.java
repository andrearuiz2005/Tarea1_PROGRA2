/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ar466
 */
public class Ruiz_Andrea_Prueba2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño de los arreglos: ");
        int numeros = lea.nextInt();

        int[] arreglo1 = new int[numeros];
        int[] arreglo2 = new int[numeros];

        for (int index = 0; index < numeros; index++) {
            arreglo1[index] = random.nextInt(200) + 1;
            arreglo2[index] = random.nextInt(200) + 1;
        }

        int contarA = 0, contarB = 0;
        for (int index = 0; index < numeros; index++) {
            if (esPrimo(arreglo1[index])) {
                contarA++;
            }
            if (esPrimo(arreglo2[index])) {
                contarB++;
            }
        }

        int[] primosA = new int[contarA];
        int[] primosB = new int[contarB];

        int indexA = 0, indexB = 0;
        for (int index = 0; index < numeros; index++) {
            if (esPrimo(arreglo1[index])) {
                primosA[indexA++] = arreglo1[index];
            }
            if (esPrimo(arreglo2[index])) {
                primosB[indexB++] = arreglo2[index];
            }
        }

        System.out.print("Arreglo A con numeros primos: ");
        for (int index = 0; index < primosA.length; index++) {
            System.out.print(primosA[index] + " ");
        }
        System.out.println();

        System.out.print("Arreglo B con numeros primos: ");
        for (int index = 0; index < primosB.length; index++) {
            System.out.print(primosB[index] + " ");
        }
        System.out.println();

        System.out.print("Numeros en A que no estan en B: ");
        for (int index = 0; index < primosA.length; index++) {
            boolean found = false;
            for (int j = 0; j < primosB.length; j++) {
                if (primosA[index] == primosB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(primosA[index] + " ");
            }
        }
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}