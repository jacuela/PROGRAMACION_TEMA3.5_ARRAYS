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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        int []numeros = new int[10];
        int num;
        int i;
        
        
        //***** USANDO FOR - PARTE A - RELLENO EL ARRAY *********
        //Voy rellenando el array. En el caso de encontrar un 
        //numero negativo, me salgo con el break
        
        //Recorrido con un for
        for (int j = 0; j < numeros.length; j++) {
            System.out.print("Introduce un numero [-1 para salir]:");
            num=Integer.parseInt(entrada.nextLine());    
            numeros[j]=num;
            if (num<0) { 
                break;
            }
        }
        
        //Imprimo solo los positivos
        System.out.println("\nMuestro el array con un for");
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j]>=0)
                System.out.println(numeros[j]);
            else
                break;
            
        }
        
        
        
        
    }
    
}
