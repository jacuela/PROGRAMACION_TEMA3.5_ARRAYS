/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //**********************************
        //  EJERCICIO EXTRA1
        //  Dada una lista de 5 numeros en codigo  
        //  indicar si dichos numeros son pares
        // 
        //**********************************
        
        int[] numeros={1,5,3,3,8};
        
        boolean sonPares=true; 
        
        
        for (int i = 0; i < 5; i++) {
            if (numeros[i]%2 != 0)
                sonPares=false;
//            else
//                sonPares=true;
        }
        
        if (sonPares) System.out.println("Sí son pares");
        else System.out.println("NO son pares");
        
        
    }
    
}
