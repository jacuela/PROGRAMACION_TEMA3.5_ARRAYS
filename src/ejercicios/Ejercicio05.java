/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author juan.antonio
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []num={6,5,4,3,2};  //lista que decrece
        //int []num={6,7,10,11,15};  //lista que crece
        //int []num={6,7,5,11,2};  //lista que crece
        //int []num={7,6,6,6,6};  //lista que crece
        
        
        
//        //**************************************   
//        // PARTE 1 PARA ENTENDER EL ALGORITMO
//        // indicar si es creciente dicha lista
//        //**************************************
//        boolean esCreciente=true;
//        
//        for (int i = 0; i < num.length-1; i++) {
//            if (num[i]>num[i+1]) esCreciente=false;
//            
//        }
//     
//        if (esCreciente) 
//            System.out.println("La lista es creciente");
//        else
//            System.out.println("La lista es decreciente");
//        
        
        
        
        //**************************************   
        // PARTE 2 - EJERCICIO COMPLETO
        // indicar si la lista es creciente, decreciente
        // o desordenada
        //**************************************
       
        boolean esCreciente=true;
        boolean esDecreciente=true;
        boolean sonIguales=true;
        
        
        
        for (int i = 0; i < num.length-1; i++) {
            
            if (num[i]!=num[i+1]) sonIguales=false;
            if (num[i]>num[i+1]) esCreciente=false;
            if (num[i]<num[i+1]) esDecreciente=false;
            
        }
     
        if (sonIguales)
            System.out.println("Son todos IGUALES");
        else if (esCreciente) 
            System.out.println("El array es CRECIENTE");
        else if (esDecreciente)
            System.out.println("El array es DECRECIENTE");
        else
            System.out.println("El array esta DESORDENADO");

        
        
    }
    
}
