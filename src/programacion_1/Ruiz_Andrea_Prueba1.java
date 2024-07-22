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
public class Ruiz_Andrea_Prueba1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int menu = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        
        while (menu != 5) {
            System.out.println("\n Menu");
            System.out.println("1. Palabra Alreves");
            System.out.println("2. Palindroma y Vocal");
            System.out.println("3. Mayor y Menor Ingresados");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            menu = lea.nextInt();
            
            if (menu == 1) {
                contador1++;
                System.out.println("");
                System.out.println("Palabra Alreves");
                System.out.print("Ingrese una palabra: ");
                String palabraalreves= lea.next();
                
                //Palabra al reves
                String palabrareves= "";
                for (int contador=palabraalreves.length()-1; contador>=0;contador--){
                        palabrareves+=palabraalreves.charAt(contador);
                }
                System.out.print("Palabra Alreves: "+palabrareves);
                
                
            }else if (menu == 2){
                contador2++;
                System.out.println("");
                System.out.println("Palíndroma & Vocal ");
                System.out.print("Ingrese una palabra: ");
                String palabraVocal= lea.next().toLowerCase();
                    
                int longitud = palabraVocal.length();
                boolean esPalindromo = true;

                for (int i = 0; i < longitud / 2; i++) {
                if (palabraVocal.charAt(i) != palabraVocal.charAt(longitud - i - 1)) {
                esPalindromo = false;
                }
            }
        
                    if (esPalindromo) {
                    System.out.println("La palabra es palíndroma.");
                    
                    // Conteo de vocales
                    int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
                    for (int i = 0; i < palabraVocal.length(); i++) {
                    char letra = palabraVocal.charAt(i);
                    
                    if (letra == 'a') {
                        contadorA++;
                    } else if (letra == 'e') {
                        contadorE++;
                    } else if (letra == 'i') {
                        contadorI++;
                    } else if (letra == 'o') {
                        contadorO++;
                    } else if (letra == 'u') {
                        contadorU++;
                    }
                }
                        System.out.println("Cantidad de vocales:");
                        System.out.println("Vocal A: " + contadorA);
                        System.out.println("Vocal E: " + contadorE);
                        System.out.println("Vocal I: " + contadorI);
                        System.out.println("Vocal O: " + contadorO);
                        System.out.println("Vocal U: " + contadorU);
                    } else {
                        System.out.println("La palabra no es palindroma.");
                    }
                
                
           }else if (menu == 3) {
                    contador3++;
              
                    // Solicitar al usuario la cantidad de números que desea ingresar
                    System.out.println("");
                    System.out.println("Mayor y Menor Ingresados");
                    System.out.print("Ingrese la cantidad de numeros que desea ingresar: ");
                    int cantidadNumeros = lea.nextInt();

                    
                    if (cantidadNumeros <= 0) {
                    System.out.println("La cantidad de numeros debe ser un entero positivo.");
                    } else {
                    
                    System.out.print("Ingrese el numero #1: ");
                    int primerNumero = lea.nextInt();

                    // Inicializar el mayor y menor con el primer número ingresado
                    int mayor = primerNumero;
                    int menor = primerNumero;
                    int frecuenciaMayor = 1; // Contador de frecuencia del número mayor
                    int frecuenciaMenor = 1; // Contador de frecuencia del número menor

                    // Solicitar al usuario que ingrese los números restantes y actualizar el mayor, menor y sus frecuencias
                    for (int i = 1; i < cantidadNumeros; i++) {
                    System.out.print("Ingrese el numero #" + (i + 1) + ": ");
                    int numero = lea.nextInt();

                    // Actualizar el número mayor y su frecuencia
                    if (numero > mayor) {
                        mayor = numero;
                        frecuenciaMayor = 1;
                    } else if (numero == mayor) {
                        frecuenciaMayor++;
                    }

                    if (numero < menor) {
                        menor = numero;
                        frecuenciaMenor = 1;
                    } else if (numero == menor) {
                        frecuenciaMenor++;
                }
            }

                // Imprimir resultados
                System.out.println("El numero mayor es: " + mayor + ", se repite " + frecuenciaMayor + " vez");
                System.out.println("El numero menor es: " + menor + ", se repite " + frecuenciaMenor + " vez");
                }
           }else if (menu == 4){
                contador4++;
                System.out.println("");
                System.out.println("Votaciones");
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
               
        }else if (menu == 5){
                            
               System.out.println("");
               System.out.println("Salir");
               System.out.println("Resumen de selecciones:");
               System.out.println("Palabra Alreves: " + contador1 + " veces");
               System.out.println("Palindroma & Vocal: " + contador2 + " veces");
               System.out.println("Mayor y Menor Ingresados: " + contador3 + " veces");
               System.out.println("Votaciones: " + contador4 + " veces");
               
            }
            
        }
    }
}

