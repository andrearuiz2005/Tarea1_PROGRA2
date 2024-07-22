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
public class ww {
    public static void main(String[] args){
        Scanner lea=new Scanner(System.in);
        
        lea.useDelimiter("\n");
        System.out.println("Bienvenido.");
        System.out.println("Ingrese la cantidad de productos: ");
        int canproducto=lea.nextInt();
        int numproducto=0;
        int numero=0;
        double total=0;
        String nombreproducto=" ";

        while(numero<canproducto){
            numero++;
            numproducto++;
            System.out.println("Producto #"+numproducto);
            System.out.println("Producto: ");
            String producto=lea.next();
            System.out.println("Precio Unit $:");
            double preciounit=lea.nextDouble();
            System.out.println("Cantidad: ");
            int cantidad=lea.nextInt();
            double subtotal=preciounit*cantidad;
            System.out.println("Subtotal P"+numproducto+":$"+subtotal);
            
            if (numproducto == 1) {
                nombreproducto= producto;
            } else {
                nombreproducto=nombreproducto+" - "+producto;
            }
            total=total+subtotal;
        }
        
        double isv=total*0.15;
        double totalfinal=total+isv;
        System.out.println("*******************");
        System.out.println("Productos: "+nombreproducto);
        System.out.println("Subtotal $: "+total);
        System.out.println("ISV - 15%: "+isv);
        System.out.println("Total $: "+totalfinal);
    }
}
     
