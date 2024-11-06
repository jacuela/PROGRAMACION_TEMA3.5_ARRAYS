/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int []numeros1={1,2,3,2};
          int []numeros2={1,2,5,2};
          
        
        boolean sonIguales=true;
        
        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i]!=numeros2[i]){
                sonIguales=false;
                break; //me salgo pq he encontrado ya un impar
            }
            
        }
        //Analizo boolean
        if (sonIguales){
            System.out.println("SON TODOS IGUALES");
        }
        else{
            System.out.println("SON DISINTOS");
        }
        
        
        
    }
    
}
