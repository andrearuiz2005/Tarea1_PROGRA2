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
public class papa {
    
    public static void main(String[] args) {
        String[] palabras = {"VICTORIA", "FRESA", "ESTRELLA", "LUNA", "BOSQUE", "TIGRE", "LENTES", "ARITOS", "COMPUTADORA", "EFRAIN"};
        int numeroOportunidades = 5;
        Random random = new Random();
        Scanner lea = new Scanner(System.in);

        boolean jugar = true;
        while (jugar) {
            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("|  Bienvenido al juego del Ahorcado:) |");
            System.out.println("---------------------------------------");
            System.out.println("|           Menu Principal            |");
            System.out.println("---------------------------------------");
            System.out.println("| a. Jugar                            |");
            System.out.println("| b. Cambiar las palabras del juego   |");
            System.out.println("| c. Salir del juego                  |");
            System.out.println("---------------------------------------");
            System.out.print("Ingresa tu opcion: ");
            char opcion = lea.nextLine().toUpperCase().charAt(0);

            if (opcion == 'A') {
              
                String palabra = palabras[random.nextInt(palabras.length)];
                String POculta = "";
                for (int i = 0; i < palabra.length(); i++) {
                    POculta += "_ ";
                }

                int oportunidades = numeroOportunidades;
                System.out.println("-----------------------");
                System.out.println("| Bienvenidos al juego |");
                System.out.println("-----------------------");
                while (oportunidades > 0 && POculta.contains("_")) {
                    
                    System.out.println("| Palabra a adivinar: " + POculta);
                    System.out.println("| Oportunidades : " + oportunidades);
                    
                    System.out.print("Ingresa una letra: ");
                    char letra = lea.nextLine().toUpperCase().charAt(0);

                    boolean letraAdivinada = false;
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra) {
                            POculta = POculta.substring(0, i * 2) + letra + POculta.substring(i * 2 + 1);
                            letraAdivinada = true;
                        }
                    }

                    if (letraAdivinada) {
                        System.out.println("Adivinaste una letra :)");
                        System.out.println("");
                    } else {
                        System.out.println("Esa letra no esta en la palabra :(");
                        System.out.println("");
                        oportunidades--;
                    }
                }

                if (!POculta.contains("_")) {
                    System.out.println("Congratssss! Has adivinado la palabra: " + palabra);
                } else {
                    System.out.println("Perdisteeee ! La palabra era: " + palabra);
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
                System.out.println("Opcion invalida, por favor, elige 'A', 'B' o 'C'.");
            }
        }

        System.out.println("Gracias por jugar!");
    }
}