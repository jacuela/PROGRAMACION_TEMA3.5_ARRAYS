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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int []notas={7,5,8,7,4}; //para practicar
        
        
        Scanner teclado=new Scanner(System.in);
        int []notas=new int[5];
        int max;
        int min;
        double suma,media;
        
        
        //Rellenamos las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Dime la nota "+(i+1)+":");
            notas[i]=Integer.parseInt(teclado.nextLine());
        }
        
        //Inicializamos contadores
        max=notas[0]; //podría poner 0 pq se que es la minima
        min=notas[0]; //podria poner 10 pq se que es la maxima
        suma=0;
        
        for (int i = 0; i < notas.length; i++) {
            //Busco el maximo
            if (notas[i]>max){
                max=notas[i];
            }
            //Busco el minimo
            if (notas[i]<min){
                min=notas[i];
            }
            //Calculo la suma (acumulador)
            suma=suma+notas[i];
        }
        
        media=suma/notas.length;
        
        System.out.println("El maximo es:"+max);
        System.out.println("El minimo es:"+min);
        System.out.println("La media es:"+media);

        
        
        
        
        
        
        
    }
    
}
