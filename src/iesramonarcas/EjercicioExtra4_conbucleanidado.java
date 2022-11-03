/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iesramonarcas;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class EjercicioExtra4_conbucleanidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] lista1={1,2,3,5};
        
        int[] lista2={1,9,5,2};
        //int[] lista2={3,1,2,5};
        
        boolean sonIguales=true;
        boolean existe=false;
        
       
        //OJO, habría que comprobar como paso previo que ambos
        //arrays tengan el mismo tamaño
        
        //         if (lista1.length==lista2.length){
        //             hago el análisis
        //         }
        //         else{
        //             sonIguales=false;
        //         }
        
            
        for (int i = 0; i < lista1.length; i++) {

            //Busco el elemento actual lista1[i] en la segunta tabla
            existe=false;
            for (int j = 0; j < lista1.length; j++) {
                if (lista1[i]==lista2[j]){
                    existe=true;
                }
            }
            //Una vez recorrido todo el segundo array, compruebo si existe 
            //el elemento actual del primer array en el segundo. Si existe,
            //continuo con el análisis. Si no existe, indico que son distintos
            //y me salgo del análisis
            if (!existe){
                sonIguales=false;
                break;
            }

        }
        
        System.out.println("");
        if (sonIguales) System.out.println("Sí son iguales");
        else System.out.println("NO son iguales");
        
        
        
        
    }
    
}
