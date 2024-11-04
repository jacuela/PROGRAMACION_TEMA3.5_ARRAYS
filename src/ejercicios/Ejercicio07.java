/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        String frase,fecha;
        
        
        //PARTE A - frase
        System.out.print("Dime una frase:");
        frase=entrada.nextLine();
        
        //Esta función separa la frase en un array de String usando un delimitador
        //El delimitador es una expresión regular (no es una cadena)
        //Si usamos " " buscará espacios en blanco
        //Si usamos "\\s" buscara cualquier tipo de espacio en blanco, inlcuidos tabuladores
        //Si usamos "\d" buscará un dígito
        //Si usamos ":" buscara el caracter -->:<--
        
        String[] palabras=frase.split(" ");  
        
        System.out.printf("\n\nLa frase tiene %d palabras\n",palabras.length);
        System.out.print("\n\nLa frase tiene "+palabras.length+" palabras\n");
        
        System.out.println("**************************");
        for (int i=0; i<palabras.length;i++){
            System.out.println(palabras[i]);
            
        }
       
        
        //PARTE B - fecha
        System.out.print("Dime una fecha [dd/mm/aaaa]:");
        fecha=entrada.nextLine();
        
        String[] unaFecha=fecha.split("/");  
        
        System.out.println("\nFecha obtenida");
        System.out.println("*****************");
        System.out.println("Dia: "+unaFecha[0]);
        System.out.println("Mes: "+unaFecha[1]);
        System.out.println("Año: "+unaFecha[2]);

        
        
    }
    
}
