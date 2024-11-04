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
public class AAPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int edad;
        
        
        int []edades={18,15,16,31,42};
        
        int []edades2=new int[5];
//        edades2[0]=18;
//        edades2[1]=15;
//        edades2[2]=16;
//        edades2[3]=31;
//        edades2[4]=42;
        System.out.println("Edad:"+edades[0]);
        System.out.println("Edad:"+edades[1]);
        System.out.println("Edad:"+edades[2]);
        System.out.println("Edad:"+edades[3]);
        System.out.println("Edad:"+edades[4]);
        
        System.out.println("--------------------");
        System.out.println("mostramos el array <edades>");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad:"+edades[i]);
            
        }
        
        System.out.println("----------------");
        for (int i = 0; i < edades2.length; i++) {
            System.out.print("Dime una edad:");
            edad=Integer.parseInt(teclado.nextLine());
            edades2[i]=edad;
        }
        
        System.out.println("mostramos el array <edades2>");
        for (int i = 0; i < edades2.length; i++) {
            System.out.println("Edad:"+edades2[i]);
            
        }
        
        
        int []edades3;
        
       
        
    }
    
}
