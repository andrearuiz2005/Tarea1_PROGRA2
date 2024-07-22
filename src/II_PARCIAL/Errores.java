/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package II_PARCIAL;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ar466
 */
public class Errores {
    public static void main(String[] args) {
       Scanner lea = new Scanner (System.in);
       
       while(true){ //bucle infinito
       try{
           System.out.print("Ingrese un valor numerico: ");
           int num=lea.nextInt();
           //System.out.println("Resultado x 2: "+num*2);
           System.out.println("Resultado x 2: "+(num*2/0));
       }catch (InputMismatchException e){
           lea.nextLine();
           System.out.println("Eror: Ingrese un valor entero");
       
       }catch(ArithmeticException e){//es para qie no tire error en letras rojas
           //System.out.println(e.getStackTrace()); imprime: un vacio pero no da explicacion alguna para el usuario
           //e.printStackTrace(); imprime: letras rojas
           //lea.next(); //puede ser opcion
           //lea.nextLine();
           System.out.println("Error: Ingrese un valor entero. "); // imprime: un error facil de para el usuario 
        }catch (Exception e){
            e.printStackTrace();
        }
     }
       
            }
       
       }
       
    

