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
public class Test {
    public static void main(String[] args) {
        String[] palabras = {"YORO", "ARENAL", "NEGRITO", "PROGRESO", "JOCON", "OLANCHITO", "MORAZAN", "SULACO", "VICTORIA", "YORITO"};
        int MAX_OPORTUNIDADES = 5; 
        Random random = new Random();
        Scanner lea = new Scanner(System.in);

        boolean jugar = true;
        while (jugar) {
            System.out.println("");
            System.out.println("* * * * * * * * * * * * * * * *");
            System.out.println("*     JUEGO DE AHORCADO       *");
            System.out.println("* * * * * * * * * * * * * * * *");
            System.out.println("* Que deseas hacer?           *");
            System.out.println("* a. Jugar                    *");
            System.out.println("* b. Cambiar Palabras         *");
            System.out.println("* c. Salir                    *");
            System.out.println("* * * * * * * * * * * * * * * *");
            System.out.print("Ingresa tu opcion: ");
            char opcion = lea.nextLine().toUpperCase().charAt(0);

            if (opcion == 'A') {
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

                    boolean palabramagica = false;
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra) {
                            palabraOculta = palabraOculta.substring(0, i * 2) + letra + palabraOculta.substring(i * 2 + 1);
                            palabramagica = true;
                        }
                    }

                    if (palabramagica) {
                        System.out.println("Adivinastee una letraaa!");
                    } else {
                        System.out.println("Te equivocaste esa no era :");
                        oportunidades--;
                    }
                }

                if (!palabraOculta.contains("_")) {
                    System.out.println("Felicidades! Has adivinado la palabra: " + palabra);
                } else {
                    System.out.println("Has perdido! La palabra era " + palabra);
                }
            } else if (opcion == 'B') {
                System.out.println("Bienvenido al cambio de palabras!");
                for (int i = 0; i < palabras.length; i++) {
                    System.out.print("Ingresa la palabra " + (i + 1) + ": ");
                    palabras[i] = lea.nextLine().toUpperCase();
                }
            } else if (opcion == 'C') {
                jugar = false;
            } else {
                System.out.println("Opcion invalida. Por favor, elige 'A', 'B' o 'C'.");
            }
        }
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("* Gracias por jugar ahorcado! *");
        System.out.println("* * * * * * * * * * * * * * * *");
    }
}


