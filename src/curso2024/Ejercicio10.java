/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
        int moda=0;
        int maxrepe=0;
        int repe;
        
        //OPCION1: solo permitimos que haya una moda
        int [] numeros={5,4,5,4,4,3};
        
        //El bucle externo coge cada numero para ver las veces
        //que se repite
        for(int i=0; i<numeros.length; i++){
            
            //El bucle interno cuenta repeticiones del elemento numeros[i]
            repe=0;  //resetear contador
            for(int j=0; j<numeros.length; j++){
                if(numeros[i]==numeros[j]){
                    repe++;
                }
            }
            
            if(repe>maxrepe){
                maxrepe=repe;
                moda=numeros[i];
            }
        }
        System.out.println("La moda es "+moda);
    
        //============================================
        //Otro parecido con bucles anidados
        //Chequear los numeros de la bonoloto
        //============================================
        
        System.out.println("----------------------------");
        int [] premiados = {1,3,5,13,21,49};
        int [] misnumeros = {1,2,3,4,5,6};
        int aciertos = 0;
        
        for (int i = 0; i < misnumeros.length; i++) {
            for (int j = 0; j < premiados.length; j++) {
                if (misnumeros[i]==premiados[j]){
                    aciertos++;
                }
            }
        }
        
        System.out.println("Aciertos Bonoloto:"+aciertos);
        
        
    }
    
}
