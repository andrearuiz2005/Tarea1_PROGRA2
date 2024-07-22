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
public class Ruiz_Andrea_OperadorTernario {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        
        //Operador Ternario 
        // El operador ternario es una característica común en muchos lenguajes de programación que
        //permite escribir expresiones condicionales de forma más compacta.
        
        //El operador ternario en Java es una forma concisa de expresar estructuras condicionales.
        //Su sintaxis es: condición ? expresión_si_verdadero : expresión_si_falso;
        //Donde la condición es evaluada, y si es verdadera, se devuelve la expresión_si_verdadero; 
        //de lo contrario, se devuelve la expresión_si_falso.
        
        System.out.println(" * * * * * * * OPERADOR TERNARIO * * * * * * * ");
        
        System.out.println("\nEjemplo 1: Al ingresar una hora sabremos que saludo es  ");
        System.out.println(" * * * * * * * Uso de valor constante * * * * * * *  ");
        System.out.println("");
        System.out.println("||           Saludos          ||");
        System.out.println("|| Buenos Dias   || ( 1 - 12) ||");
        System.out.println("|| Buenas Tardes || (13 - 18) ||");
        System.out.println("|| Buenas Noches || (19 - 24) ||");
        System.out.println("");
        //System.out.print("Ingresar la hora: ");
        
        System.out.println("\n  * * * * * * * DESDE EL TECLADO * * * * * * * ");
        System.out.print("Ingresar la hora: ");
        int hora = lea.nextInt(); //Valor desde el teclado
        String mensajeSaludo = (hora < 12) ? "Buenos dias" : (hora < 18) ? "Buenas tardes" : "Buenas noches";
        System.out.println("Deseleandole un " + mensajeSaludo);
        
        
        System.out.println("\n * * * * * * * VALOR CONSTANTE * * * * * * * ");
        hora=19;
        System.out.println("Hora Fija: "+hora);
        mensajeSaludo = (hora < 12) ? "Buenos dias" : (hora < 18) ? "Buenas tardes" : "Buenas noches";
        System.out.println("Deseleandole un " + mensajeSaludo);

        
        System.out.println("\nEjemplo 2: Al ingresar el numero sabremos si el numero es Par o Impar ");
        System.out.println("* * * * * * * * Uso de valor variables * * * * * * * *");
        System.out.print(" Ingresar un numero:  ");
        int numero = lea.nextInt();
        String resultado = (numero % 2 == 0) ? "Par" : "Impar"; 
        System.out.println("El numero que ingresaste es " + resultado);

        
        System.out.println("\nEjemplo 3: Se ingresaran dos edades para saber cual es el menor ");
        System.out.println(" * * * * * * * Uso de valor con formulas * * * * * * * ");
        System.out.print("Ingresar edad 1: ");
        int edad1 = lea.nextInt();
        System.out.print("Ingresar edad 2: ");
        int edad2 = lea.nextInt();
        int edades = (edad1 < edad2) ? edad1 : edad2;
        System.out.println("\nLa edad de " + edades + " es menor");
        

    }
}   

