/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int []numeros = new int[5];
        
        int num;
        
        //Bucle para leer los numeros
        for (int i=0; i<numeros.length;i++ ){
            //Este bucle es para evitar meter notas que no esten entre 0 y 10
            System.out.print("Introduce un numero:");
            num=Integer.parseInt(teclado.nextLine());
            numeros[i]=num;
        }
        
        //Bucle para mostrarlos
        System.out.println("\nARRAY DE NUMEROS");
        System.out.println("------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("numeros[%d] %10d\n",i,numeros[i]);
            
        }
        
        
        //Lo imprimo en formato medio bonito
        System.out.print("\nArray --> [");
        for (int i = 0; i < numeros.length-1; i++) {
            System.out.printf("%d|",numeros[i]);
        }
        System.out.printf("%d]\n",numeros[numeros.length-1]);
        //System.out.println("]");

        
        
    }
    
}
