/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ar466
 */
public class Tablero1 {
   private int fila=6;
   private int columna=6;
   private char[][]tablero; 
    public Tablero1() {
        tablero = new char[fila][columna];
        inicializarTablero();
    }
    private void inicializarTablero() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j] = ' ';
            }
        }
    }
    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public char getValorCasilla(int fila, int columna) {
        return tablero[fila][columna];
    }
   
    public static void main(String[] args) {
        Tablero1 tab=new Tablero1();
        System.out.println("Imprimir Tablero");
        tab.inicializarTablero();
        
    }
}
