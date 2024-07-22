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
public class Factura_Producto {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int cantidad;
        double precio;
        
      
        do{
        System.out.println("Ingrese la cantidad de producto: ");
         cantidad=lea.nextInt();
        
        System.out.println("Ingrese el producto: ");
        String nombreproducto=lea.next();
        
        System.out.println("Ingrese el precio unitario: $. ");
         precio=lea.nextDouble();
        
        
         double subtotal = cantidad * precio;
         double isv = subtotal * 0.15;
         double total = subtotal + isv;
         
         
            System.out.println("Total: "+total);
            System.out.println("Subtotal: "+subtotal);
            System.out.println("Isv: "+isv);
            
            
        }while (true);
                 
       
        }
        }

    


