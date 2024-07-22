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
public class factura {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in); //activar que sea desde el teclado
        
        lea.useDelimiter("\n");
        
        System.out.print("Ingresar Edad: ");
        int edad = lea.nextInt();
        System.out.print("Ingresar producto: ");
        String producto=lea.next();
        System.out.print("Ingresar precio: $. ");
        double precio=lea.nextDouble();
        System.out.print("Ingresar cantidad: ");
        double cantidad=lea.nextInt();
        
        double subtotal,impuesto,descuento,total;
        descuento=0;
        double desc=0;
        
        subtotal=cantidad*precio;
        impuesto=subtotal*0.15;
        
        if (edad >= 65){
            descuento = subtotal *0.4;
        }

        
        if (subtotal <=1500 &&  subtotal<=3500){
            subtotal=subtotal-0.15*subtotal;
            //desc = "15%";
            //if (edad >=65)
        }else if
            (subtotal >3500 && subtotal<=5589.99){
            subtotal=subtotal-0.30*subtotal;
            //desc = "30%";
            
        }else if
            (subtotal >5589.99){
            subtotal = subtotal-0.40*subtotal;
            //desc = "40%";
        }
       
        
        total=subtotal-descuento+impuesto;
        
        System.out.println("        ");
        System.out.println(" * * * * FACTURA * * * * ");
        System.out.println("Producto: "+producto);
        System.out.println("Precio: $. "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Subtotal: "+subtotal);
        System.out.println("ISV - 15% $. : "+impuesto);
        System.out.println("Descuento tercera edad: "+descuento);
        System.out.println("Descuento Aplicado: "+desc);
        System.out.println("Total: "+total);
    }
}
