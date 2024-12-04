/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException  {
        // TODO code application logic here
        
        int [][] num = new int[3][6];
        
        num[0][1]=30;
        num[0][2]=2;
        num[0][5]=5;
        num[1][0]=75;
        num[2][2]=-2;
        num[2][3]=9;
        num[2][5]=11;
       
        
        System.out.println("Num filas:"+num.length);
        System.out.println("Num columnas:"+num[0].length);
        
        //Imprimir el array
        for (int i = 0; i < num.length; i++) {
            
            //Imprime una fila completa
            for (int j = 0; j < num[0].length; j++) {
                System.out.printf("%4d",num[i][j]);
                Thread.sleep(500); // retardo de medio segundo
            }
            System.out.println("");
        }
       
        
        
    }
    
}
