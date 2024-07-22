/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ar466
 */
public class aaa {
    public static void main(String[] args) {

        String[] palabras = {"HONDURAS", "ARGENTINA", "ESPAÑA", "MEXICO", "ALEMANIA", "ITALIA", "FRANCIA", "BRASIL", "CHILE", "CANADA"};
        int MAX_OPORTUNIDADES = 5;
        Random random = new Random();
        Scanner lea = new Scanner(System.in);

        boolean jugar = true;
        while (jugar) {
            System.out.println("\nQue deseas hacer?");
            System.out.println("a. Jugar");
            System.out.println("b. Cambiar Palabras");
            System.out.println("c. Salir");
            System.out.print("Ingresa tu opcion: ");
            char opcion = lea.nextLine().toUpperCase().charAt(0);

            if (opcion == 'A') {
                // Jugar
                String palabra = palabras[random.nextInt(palabras.length)];
                String palabraOculta = "";
                for (int i = 0; i < palabra.length(); i++) {
                    palabraOculta += "_ ";
                }

                int oportunidades = MAX_OPORTUNIDADES;

                while (oportunidades > 0 && palabraOculta.contains("_")) {
                    System.out.println("Palabra a adivinar: " + palabraOculta);
                    System.out.println("Oportunidades restantes: " + oportunidades);
                    System.out.print("Ingresa una letra: ");
                    char letra = lea.nextLine().toUpperCase().charAt(0);

                    boolean letraAdivinada = false;
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra) {
                            palabraOculta = palabraOculta.substring(0, i * 2) + letra + palabraOculta.substring(i * 2 + 1);
                            letraAdivinada = true;
                        }
                    }

                    if (letraAdivinada) {
                        System.out.println("Le pegaste a un caracter!");
                    } else {
                        System.out.println("Esa letra no esta en la palabra.");
                        oportunidades--;
                    }
                }

                if (!palabraOculta.contains("_")) {
                    System.out.println("Felicidades! Has adivinado la palabra: " + palabra);
                } else {
                    System.out.println("Has perdido! La palabra era: " + palabra);
                }
            } else if (opcion == 'B') {
                // Cambiar Palabras
                System.out.println("Bienvenido al cambio de palabras!");
                for (int i = 0; i < palabras.length; i++) {
                    System.out.print("Ingresa la palabra " + (i + 1) + ": ");
                    palabras[i] = lea.nextLine().toUpperCase();
                }
            } else if (opcion == 'C') {
                // Salir
                jugar = false;
            } else {
                System.out.println("Opcion invalida. Por favor, elige 'A', 'B' o 'C'.");
            }
        }

        System.out.println("Gracias por jugar!");
    }
}
