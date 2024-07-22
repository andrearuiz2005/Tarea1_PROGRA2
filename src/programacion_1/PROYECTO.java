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
public class PROYECTO {
     public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        // Solicitar al usuario la cantidad de votantes
        System.out.print("Ingrese la cantidad de votantes: ");
        int cantidadVotantes = lea.nextInt();
        lea.nextLine(); // Consumir la nueva línea después de leer el número

        int votosAzul = 0;
        int votosRojo = 0;
        int votosNegro = 0;
        int votosAmarillo = 0;

        // Solicitar los votos de cada votante
        for (int i = 0; i < cantidadVotantes; i++) {
            System.out.print("Votante #" + (i + 1) + ": Ingrese su voto (AZUL, ROJO, NEGRO, AMARILLO): ");
            String voto = lea.nextLine().toUpperCase(); // Convertir el voto a mayúsculas

            // Registrar el voto
            if (voto.equals("AZUL")) {
                votosAzul++;
            } else if (voto.equals("ROJO")) {
                votosRojo++;
            } else if (voto.equals("NEGRO")) {
                votosNegro++;
            } else if (voto.equals("AMARILLO")) {
                votosAmarillo++;
            } else {
                System.out.println("Voto nulo.");
            }
        }

        // Calcular el total de votos
        int totalVotos = votosAzul + votosRojo + votosNegro + votosAmarillo;

        // Imprimir el resultado de la votación
        if (totalVotos == 0) {
            System.out.println("No se han registrado votos.");
        } else {
            double porcentajeVotosValidos = (totalVotos * 100.0) / cantidadVotantes;

            if (porcentajeVotosValidos >= 60) {
                String ganador;
                if (votosAzul > votosRojo && votosAzul > votosNegro && votosAzul > votosAmarillo) {
                    ganador = "AZUL";
                } else if (votosRojo > votosNegro && votosRojo > votosAmarillo) {
                    ganador = "ROJO";
                } else if (votosNegro > votosAmarillo) {
                    ganador = "NEGRO";
                } else {
                    ganador = "AMARILLO";
                }
                System.out.println("El ganador es: " + ganador);
            } else {
                System.out.println("VOTACIÓN FALLIDA");
            }
        }

        scanner.close();
    }
}
