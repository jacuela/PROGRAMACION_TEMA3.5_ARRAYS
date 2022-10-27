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
        
        
        
        //***** USANDO WHILE FOR - PARTE A - RELLENO EL ARRAY *********
        //Voy rellenando el array. No uso en este caso break, y uso una 
        //condición doble.
        
        
        //Primero lo relleno
        i=0;
        do{
            
            System.out.print("Introduce un numero [-1 para salir]:");
            num=Integer.parseInt(entrada.nextLine());    
            numeros[i]=num;
            i++;
        }while(num>=0 && i<numeros.length);
        
      
        //Lo imprimo con un while
        System.out.println("Muestro el array con un while");
        i=0;
        while (i<numeros.length && numeros[i]>=0){
            System.out.println(numeros[i]);
            i++;
        }
        
        
    }  //fin main
    
}
