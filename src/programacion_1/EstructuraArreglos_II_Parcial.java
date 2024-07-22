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
public class EstructuraArreglos_II_Parcial {
 public static void main (String[] args){
     //Arreglo Express
    String listaNombre[]={"Juan","Maria","Mateo","Ruth"};
    listaNombre[2]="Lucas";
    for (int index = 0; index < listaNombre.length; index++) {
        System.out.println("["+index+"]:"+listaNombre[index]);
    }
    
    Scanner lea = new Scanner (System.in);
    int cantidad;
    System.out.print("Ingrese el tamaño: ");
    cantidad=lea.nextInt();
    lea.useDelimiter("\n");
    String listaApellido[]=new String[cantidad];
    
    for(int index=0; index<listaApellido.length; index++){
        System.out.println("["+index+"]: ");
        listaApellido[index]=lea.next();
    }
     System.out.println("*****************************");
     for(int index=0; index<listaApellido.length; index++){
         System.out.println("["+index+"]:"+listaApellido[index]);
        }
    }   
}
