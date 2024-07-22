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
public class Ruiz_Andrea_Ejercicio1_Pagos {
     public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        lea.useDelimiter("\n");
        
        
        
        System.out.print("Ingrese el codigo: ");
        int codigoEmpleado = lea.nextInt();
        lea.nextLine(); 
        System.out.print("Ingrese el nombre: ");
        String nombreEmpleado = lea.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellidoEmpleado = lea.nextLine();

        System.out.print("Ingrese la cantidad de horas trabajadas:");
        int hTrabajadas = lea.nextInt();

        System.out.println("Informacion de Categorias");
        System.out.println("Categoria 1 - $40 por hora extra");
        System.out.println("Categoria 2 - $50 por hora extra");
        System.out.println("Categoria 3 - $85 por hora extra");
        System.out.println("Categoria 4 - $0");
        System.out.println("Ingrese la categoria del empleado (1-4):");
        int categoriaEmpleado = lea.nextInt();

        double hExtras,tNormal,tCategoria1,tCategoria2,tCategoria3,tCategoria4,sBase,sNeto,sExtra;
        
        hExtras=0;
        tNormal=35.99;
        tCategoria1=40;
        tCategoria2=50;
        tCategoria3=85;
        tCategoria4=0;
        sExtra=0;
        sBase=0;
        sNeto=0;
        
        
        if (hTrabajadas<=40 && hTrabajadas>0){
            sBase=hTrabajadas*tNormal;
            sNeto=sBase;
            
        }else if (hTrabajadas>40 && hTrabajadas<=55){
            hExtras=hTrabajadas-40;
            if (categoriaEmpleado == 1){
                sBase=40*tNormal;
                sExtra=hExtras*tCategoria1;
                sNeto=sBase+sExtra;
                
            }else if (categoriaEmpleado == 2){
                sBase=40*tNormal;
                sExtra=hExtras*tCategoria2;
                sNeto=sBase+sExtra;
                
            }else if (categoriaEmpleado == 3){
                sBase=40* tNormal;
                sExtra=hExtras*tCategoria3;
                sNeto=sBase+sExtra;
                
            }else if (categoriaEmpleado == 4){
                sBase=40*tNormal;
                sExtra=hExtras*tCategoria4;
                sNeto=sBase+sExtra;
            }else{
                System.out.println("Categoria No existe.");
            }
        
            }else if(hTrabajadas>55){
            if (categoriaEmpleado == 1){
                sBase=40*tNormal;
                sExtra=15*tCategoria1;
                sNeto=sBase+sExtra;
                                
            }else if (categoriaEmpleado == 2){
                sBase=40*tNormal;
                sExtra=15*tCategoria2;
                sNeto=sBase+sExtra;
                
            }else if (categoriaEmpleado == 3){
                sBase=40*tNormal;
                sExtra=15*tCategoria3;
                sNeto=sBase+sExtra;
                
            }else if (categoriaEmpleado == 4){
                sBase=40*tNormal;
                sExtra=15*tCategoria4;
                sNeto=sBase+sExtra;
            }else{
                System.out.println("Ctegoria no existe.");
            }
        }
        
        sBase = Math.round(sBase * 100) / 100.00;
        sNeto = Math.round(sNeto * 100) / 100.00; 
            
            
        System.out.println("\n * * * * * * * * * * Boleta de Pago * * * * * * * * * * ");
        System.out.println("Codigo: " + codigoEmpleado);
        System.out.println("Nombre Completo: " + nombreEmpleado + " " + apellidoEmpleado);
        System.out.println("Salario Base: "+ sBase);
        System.out.println("Salarias Horas Trabajadas: " + hTrabajadas);
        System.out.println("Categoria: " + categoriaEmpleado);
        System.out.println("Salario de Horas Extras: "+ hExtras);
        System.out.println("Salario Neto: " + sNeto);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
    }
}
