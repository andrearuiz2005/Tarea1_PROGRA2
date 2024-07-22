/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_1;

/**
 *
 * @author ar466
 */
public class BidiArray {
    public static void main (String[] args)   {
        //Arreglo add size
        //String tablero [][]= new String[4][4];
        //Express
        String tablero [][]={{"A","B","C"},
                             {"D","E","F"},
                             {"G","H","I"},
                             {"J","K","L"},
                             {"M","N","O"}};
        
        System.out.println("Len: "+tablero.length);
        for(int fila=0; fila<tablero.length; fila++){
            for(int col=0;col<tablero[fila].length;col++){
                System.out.print(tablero[fila][col]+" ");
            }
            System.out.println("");
        }
    }
}

