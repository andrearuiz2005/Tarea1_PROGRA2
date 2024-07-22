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
public class Ruiz_Andrea_Examen1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        int menu = 0;

        System.out.println("* * * * * * * * Bienvenido a los juegos * * * * * * * * ");

        while (menu != 3) {
            System.out.println("");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println("Menu de Opciones:");
            System.out.println("1. Juego de Piedra, Papel y Tijera");
            System.out.println("2. Adivinar un Numero");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opcion que desea ejecutar: ");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");

            if (lea.hasNextInt()) {
                menu = lea.nextInt();

                if (menu == 1) {
                    jugarPiedraPapelTijera(lea, random);
                } else if (menu == 2) {
                    adivinarNumero(lea, random);
                } else if (menu == 3) {
                    System.out.println("Gracias por jugar!");
                } else {
                    System.out.println("Opcion no valida. Intente nuevamente.");
                }
            } else {
                System.out.println("Por favor, ingrese un numero valido.");
                lea.next(); // Limpia el buffer del scanner
            }
        }
    }

    static void jugarPiedraPapelTijera(Scanner lea, Random random) {
        System.out.println("\nBienvenido al juego de Piedra, Papel y Tijera!");

        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            System.out.print("Ingrese su eleccion (piedra, papel, tijera): ");
            String eleccionUsuario = lea.next().toLowerCase();

            int menuComputadora = random.nextInt(3);
            String seleccionComputadora;
            if (menuComputadora == 0) {
                seleccionComputadora = "piedra";
            } else if (menuComputadora == 1) {
                seleccionComputadora = "papel";
            } else {
                seleccionComputadora = "tijera";
            }

            System.out.println("La computadora eligio: " + seleccionComputadora);

            if (eleccionUsuario.equals("piedra") && seleccionComputadora.equals("tijera") ||
                eleccionUsuario.equals("papel") && seleccionComputadora.equals("piedra") ||
                eleccionUsuario.equals("tijera") && seleccionComputadora.equals("papel")) {
                System.out.println("Ganaste!");
            } else if (eleccionUsuario.equals(seleccionComputadora)) {
                System.out.println("Es un empate!");
            } else {
                System.out.println("Perdiste!");
            }

            System.out.print("Quieres jugar de nuevo? (si/no): ");
            String respuesta = lea.next().toLowerCase();
            jugarDeNuevo = respuesta.equals("si");
        }
    }

    static void adivinarNumero(Scanner lea, Random random) {
        System.out.println("\nBienvenido al juego de adivinar el numero!");

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        final int MAX_INTENTOS = 10;

        while (intentos < MAX_INTENTOS) {
            System.out.print("Ingrese un numero entre 1 y 100: ");
            if (lea.hasNextInt()) {
                int intento = lea.nextInt();
                intentos++;

                if (intento == numeroSecreto) {
                    System.out.println("Felicidades! Adivinaste el numero en " + intentos + " intentos.");
                    return;
                } else if (intento < numeroSecreto) {
                    System.out.println("El numero es mayor.");
                } else {
                    System.out.println("El numero es menor.");
                }
            } else {
                System.out.println("Por favor, ingrese un numero valido.");
                lea.next(); // Limpia el buffer del scanner
            }
        }

        System.out.println("Lo siento, no lograste adivinar el numero. El numero era: " + numeroSecreto);
    }
}