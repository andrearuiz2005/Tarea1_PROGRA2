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
public class Ruiz_Andrea_Ejercicio4 {
    public static void main(String[] args) {
    Scanner lea = new Scanner(System.in);
   
       System.out.println(" * * * Apartado A * * * ");
       System.out.print("Numerador 1: ");
       double num1=lea.nextDouble();
       System.out.print("Denominador 1: ");
       double den1=lea.nextDouble();
       System.out.print("Numerador 2: ");
       double num2=lea.nextDouble();
       System.out.print("Denominador 2: ");
       double den2=lea.nextDouble();
    
       double apartadoA=(num1/den1)+(num2/den2);
       apartadoA = Math.round(apartadoA * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoA);
    
       
       System.out.println("        ");
       System.out.println(" * * * Apartado B * * * ");
       System.out.print("Valor de X: ");
       double valorx=lea.nextDouble();
       System.out.print("Valor de Y: ");
       double valory=lea.nextDouble();
        
       double deno1=valorx - 5;
       double nume1= 3*valorx*valory;
       double apartadoB= (1/deno1)-(nume1/4);
       System.out.println("RESULTADO: "+apartadoB);
       
       
       System.out.println("        ");
       System.out.println(" * * * Apartado C * * * ");
       System.out.print("Numerador 1: ");
       double numer1=lea.nextDouble();
       System.out.print("Denominador 1: ");
       double denom1=lea.nextDouble();
       System.out.print("Numero entero: ");
       double numentero=lea.nextDouble();
        
       double apartadoC=(numer1/denom1)+numentero;
       apartadoC = Math.round(apartadoC * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoC);
        
       
       System.out.println("        ");
       System.out.println(" * * * Apartado D * * * ");
       System.out.print("Numero entero: ");
       double numEntero=lea.nextDouble();
       System.out.print("Numerador 2: ");
       double numero2=lea.nextDouble();
       System.out.print("Denominador 2: ");
       double denomi2=lea.nextDouble();
        
       double apartadoD=numEntero+(numero2/denomi2);
       apartadoD = Math.round(apartadoD * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoD);
       
       
       System.out.println("        ");
       System.out.println(" * * * Apartado E * * * ");
       System.out.print("Valor de A: ");
       double valorA=lea.nextDouble();
       System.out.print("Valor de B: ");
       double valorB=lea.nextDouble();
       System.out.print("Valor de C: ");
       double valorC=lea.nextDouble();
       System.out.print("Valor de D: ");
       double valorD=lea.nextDouble();
       System.out.print("Valor de E: ");
       double valorE=lea.nextDouble();
       System.out.print("Valor de F: ");
       double valorF=lea.nextDouble();
       System.out.print("Valor de G: ");
       double valorG=lea.nextDouble();
       System.out.print("Valor de H: ");
       double valorH=lea.nextDouble();
       System.out.print("Valor de J: ");
       double valorJ=lea.nextDouble();
        
       valorA=valorA*valorA;
       double valorBC= valorB-valorC;
       double valorDE= valorD-valorE;
       double valorGHJ= (valorG*valorH)/valorJ;
       double valorFGHJ= valorF-valorGHJ;
       double apartadoE=(valorA/valorBC)+(valorDE/valorFGHJ);
       System.out.println("RESULTADO: "+apartadoE);
       
       
       System.out.println("        ");
       System.out.println(" * * * Apartado F * * * ");
       System.out.print("Valor de M: ");
       double valorM=lea.nextDouble();
       System.out.print("Valor de N: ");
       double valorN=lea.nextDouble();
       System.out.print("Valor de P: ");
       double valorP=lea.nextDouble();
        
       double apartadoF=(valorM/valorN)+valorP;
       apartadoF = Math.round(apartadoF * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoF);
       
       
       System.out.println("        ");
       System.out.println(" * * * Apartado G * * * ");
       System.out.print("Valor de M: ");
       valorM=lea.nextDouble();
       System.out.print("Valor de N: ");
       valorN=lea.nextDouble();
       System.out.print("Valor de P: ");
       valorP=lea.nextDouble();
       System.out.print("Valor de Q: ");
       
       double valorQ=lea.nextDouble();
       double apartadoG= valorM +(valorN/(valorP-valorQ));
       apartadoG = Math.round(apartadoG * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoG);
       
       
       System.out.println("        ");
       System.out.println(" * * * Apartado H * * * ");
       System.out.print("Valor de A: ");
       valorA=lea.nextDouble();
       System.out.print("Valor de B: ");
       valorB=lea.nextDouble();
       System.out.print("Valor de C: ");
       valorC=lea.nextDouble();
       System.out.print("Valor de D: ");
       valorD=lea.nextDouble();
        
       double apartadoH=((valorA*valorA)/(valorB*valorB))+((valorC*valorC)/(valorD*valorD));
       apartadoH = Math.round(apartadoH * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoH);
       
       
       System.out.println("        ");
       System.out.println(" * * * Apartado I * * * ");
       System.out.print("Valor de M: ");
       double valorrrrM=lea.nextDouble();
       System.out.print("Valor de N: ");
       double valorrrrN=lea.nextDouble();
       System.out.print("Valor de P: ");
       double valorrrrP=lea.nextDouble();
       System.out.print("Valor de Q: ");
       double valorrrrQ=lea.nextDouble();
       System.out.print("Valor de R: ");
       double valorrrrR=lea.nextDouble();
       System.out.print("Valor de S: ");
       double valorrrrS=lea.nextDouble();
        
       double apartadoI=(valorrrrM+(valorrrrN/valorrrrP))/(valorrrrQ-(valorrrrR/valorrrrS));
       apartadoI = Math.round(apartadoI * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoI);
       
       
       System.out.println("        ");
       System.out.println(" * * * Apartado J * * * ");
       System.out.print("Valor de : ");
       double valorrA=lea.nextDouble();
       System.out.print("Valor de B: ");
       double valorrB=lea.nextDouble();
       System.out.print("Valor de C: ");
       double valorrC=lea.nextDouble();
       System.out.print("Valor de D: ");
       double valorrD=lea.nextDouble();
       System.out.print("Valor de E: ");
       double valorrE=lea.nextDouble();
       System.out.print("Valor de F: ");
       double valorrF=lea.nextDouble();
       System.out.print("Valor de G: ");
       double valorrG=lea.nextDouble();
       System.out.print("Valor de H: ");
       double valorrH=lea.nextDouble();

       double valorrDE = valorrD + (5*valorrE);
       double valorfgh = valorrF + (valorrG /(2*valorrH));
       double apartadoJ=((3*valorrA)+valorrB)/(valorrC-(valorrDE/valorfgh));
       apartadoJ = Math.round(apartadoJ * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoJ);
        
       
       System.out.println("        ");
       System.out.println(" * * * Apartado K * * * ");
       System.out.print("Valor de A: ");
       double valorrrA=lea.nextDouble();
       System.out.print("Valor de B: ");
       double valorrrB=lea.nextDouble();
       System.out.print("Valor de X: ");
       double valorrrX=lea.nextDouble();
        
       double apartadoK=((valorrrA*valorA)+(2*valorrrA*valorrB)+(valorrB*valorrrB))/((1/(valorrrX*valorrrX))+2);
       apartadoK = Math.round(apartadoK * 100) / 100.00;
       System.out.println("RESULTADO: "+apartadoK);
       
    }
    
}
