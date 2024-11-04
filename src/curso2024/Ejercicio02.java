/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        
        int []numeros=new int[5];
        
        //Rellenamos el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un numero:");
            numeros[i]=Integer.parseInt(teclado.nextLine());
        }
        
        System.out.println("ARRAY DE NUMEROS");
        System.out.println("----------------");
        //Forma1
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("numeros[%d]%10d\n",i,numeros[i]);
        }
        
//         for (int i = 0; i < numeros.length; i++) {
//            System.out.println("numeros["+i+"]          "+numeros[i]);
//        }
        
        //Forma2
        System.out.print("Array --> ");
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            
            if (i==numeros.length-1){
                //es el ultimo elemento
                System.out.print(numeros[i]);
            }
            else{
                System.out.print(numeros[i]+"|");
            }
            
        }
        System.out.println("]");
        
         
        
        
    }
    
}
