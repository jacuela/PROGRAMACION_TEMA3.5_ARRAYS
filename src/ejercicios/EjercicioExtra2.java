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
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        int[] lista1={1,2,3,2};
        
        //int[] lista2={1,9,5,2};
        int[] lista2={1,2,3,2};
        
        
        boolean sonIguales=true;
        
        for (int i = 0; i < lista1.length; i++) {
            if (lista1[i]!=lista2[i]){
                sonIguales=false;
            }
        }
       
         if (sonIguales) System.out.println("Sí son iguales");
         else System.out.println("NO son iguales");
        
       
        
        
        
        
        
        
    }
    
}
