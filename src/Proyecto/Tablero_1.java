/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author ar466
 */
public class Tablero_1 {
    private int fila = 6;
    private int columna = 6;
    private char[][] tablero;

    public Tablero_1() {
        tablero= new char [fila][columna];
        inicializartablero();
    }

    private void inicializartablero(){
    for (int i = 0; i < fila; i++){
        for (int j = 0; j < columna; j++){
            tablero[i][j] = ' ';
            }
        }
    }
    
    public char getValorCasilla(int fila, int columna) {
        return tablero[fila][columna];
    }
    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
   
    
}
