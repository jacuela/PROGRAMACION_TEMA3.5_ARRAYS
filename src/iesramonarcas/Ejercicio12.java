/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

/**
 *
 * @author jacuela
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[5][5];
        int sumafila,sumacolumna;
        
        //Recorro la matriz y la inicializo con numeros aleatorios
        // i es la fila
        // j es la columna
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j]=(int)(Math.random()*10);  
            }
        }
        
        //Imprimo la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  "+matriz[i][j]+"  ");  
            }
            System.out.println("");
        }
        
        System.out.println();
        //Sumamos los elementos de una fila. Recorro por filas
        for (int fila = 0; fila < 5; fila++) {
            sumafila=0;
            for (int columna = 0; columna < 5; columna++) {
                sumafila = sumafila+matriz[fila][columna];
            }
            System.out.println("Suma de fila "+(fila+1)+":"+sumafila);
        }
        
        
        System.out.println();
        //Sumamos los elementos de una columna. Recorro por columnas
        for (int columna = 0; columna < 5; columna++) {
            sumacolumna=0;
            for (int fila = 0; fila < 5; fila++) {
                sumacolumna = sumacolumna+matriz[fila][columna];
            }
            System.out.println("Suma de columna "+(columna+1)+":"+sumacolumna);
        }
        
        
        
       
    }
    
}
