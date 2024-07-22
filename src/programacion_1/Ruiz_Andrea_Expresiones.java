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
public class Ruiz_Andrea_Expresiones {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
    
        
       System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * *");
       System.out.println("                 Expresiones                    ");
       System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Ingrese los valores");
       System.out.print("Valor de m: ");
       double valorm=lea.nextDouble();
       System.out.print("Valor de n: ");
       double valorn=lea.nextDouble();
       System.out.print("Valor de p: ");
       double valorp=lea.nextDouble();

       System.out.print("Valor de q: ");
       double valorq=lea.nextDouble();
       System.out.print("Valor de r: ");
       double valorr=lea.nextDouble();
       System.out.print("Valor de s: ");
       double valors=lea.nextDouble();
       System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
       
       double expresiones= (valorm + (valorn / valorp))/(valorq - (valorr / valors));
       expresiones = Math.round(expresiones * 100) / 100.00;
       System.out.println("Resultado final: "+expresiones);
       System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * *");
       
    }
}
