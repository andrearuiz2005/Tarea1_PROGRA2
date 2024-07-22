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
public class Estructa_Control {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int tabla=lea.nextInt();
        int contar=0;
        
        System.out.println("WHILE*******");
        //P1 0<5 T
        while (contar<5){
        //contar=contar+1 0+1 -1 
         
            contar++;
            //
            System.out.println("Contar: "+contar);  
            //System.out.println(contar+" x "+tabla+"="+(contar*tabla));
          
        }
        System.out.println("DO*********");
        do{
            //
            contar++;
            System.out.println("Contador: "+contar);
            //
        }while(contar<5);
   
    }
        
}
