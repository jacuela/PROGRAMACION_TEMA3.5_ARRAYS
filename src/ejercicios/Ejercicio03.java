/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author juan.antonio
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int []notas = new int[5];
        int nota;
        int max; 
        int min; 
        int suma=0;
        double media;
        
        
        //Leemos las 5 notas
        for (int i=0; i<notas.length;i++ ){
            
            do{
                System.out.print("Introduce una nota "+i+":");
                nota=Integer.parseInt(teclado.nextLine());
            }while(nota<0 || nota>10);
            
            notas[i]=nota;
        }
      
        
        
        
        //Hacemos el análisis
        min=notas[0];  //suponemos que el primer valor es el minimo
        max=notas[0];  //suponemos que el primer valor es el maximo
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>max)  max=notas[i];
            if (notas[i]<min)  min=notas[i];
            suma=suma+notas[i];
        }
        
        //Calculo media. Hago casting para que la division conserve decimales
        media=(double)suma/notas.length;
        
        //Finalmente, mostramos todos los resultados
        System.out.println("\n\n******Resultados******");
        System.out.println("La nota máxima es un: "+max);
        System.out.println("La nota mínima es un: "+min);
        System.out.println("La media es: "+media);
        
        
        
        
    }
    
}
