/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []numeros={2,3,4,4,8};
        
        boolean sonTodosPares=true;
        
        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i]%2!=0){
                sonTodosPares=false;
                break; //me salgo pq he encontrado ya un impar
            }
            
        }
        //Analizo boolean
        if (sonTodosPares){
            System.out.println("SON TODOS PARES");
        }
        else{
            System.out.println("HAY ALGUN IMPAR");
        }
        
    }
    
}
