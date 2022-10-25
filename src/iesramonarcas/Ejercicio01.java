/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

/**
 *
 * @author juan.antonio
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String []animales={"perro","gato","conejo","pollo","leon"};
        
        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        System.out.println(animales[4]);
        
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]);
        }
        
        
        //PARTE2
        int []numeros={2,4,6,8,10};
        
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        
        
    }
    
}
