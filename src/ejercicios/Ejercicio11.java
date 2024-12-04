/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author jacuela
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        int[][] num = new int[3][6]; // array de 3 filas por 6 columnas
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;
        
        
        System.out.println("Esta matriz tiene "+num.length+" filas.");
        System.out.println("Esta matriz tiene "+num[0].length+" columnas.\n\n");
        
        
        //Imprimo la matriz (forma1)
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                System.out.print("  "+num[fila][columna]+"  ");  
            }
            System.out.println("");
        }
        
        
       
        
        //OPCIONAL
        //Imprimo la matriz (forma2 mas visual)
//        int fila; int columna;
//
//        System.out.println(""); 
//        System.out.println("┌────────┬──────────┬──────────┬──────────┬──────────┬──────────┬──────────┐");
//        System.out.println("│        │  Colum 0 │  Colum 1 │  Colum 2 │  Colum 3 │  Colum 4 │  Colum 5 │");
//        System.out.println("├────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
//        
//        
//        for(fila = 0; fila < 3; fila++) {
//            
//            System.out.print("│Fila " + fila+"  │");
//        
//            for(columna = 0; columna < 6; columna++) { 
//              System.out.printf("%10d│", num[fila][columna]); 
//              Thread.sleep(500); // retardo de medio segundo
//            }
//            System.out.println("");
//            
//            if (fila<2)
//              System.out.println("├────────┼──────────┼──────────┼──────────┼──────────┼──────────┼──────────┤");
//            else
//            System.out.println("└────────┴──────────┴──────────┴──────────┴──────────┴──────────┴──────────┘");
//    
//        }
        
    }
    
}