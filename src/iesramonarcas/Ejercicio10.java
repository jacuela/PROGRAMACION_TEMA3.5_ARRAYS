/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

/**
 *
 * @author paula
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
        
//        //OPCION1: solo permitimos que haya una moda
//        int [] numeros={5,4,5,2,5};
//        for(int i=0; i<numeros.length; i++){
//            //Cuento repeticiones del elemento i  
//            repe=0;
//            for(int j=0; j<numeros.length; j++){
//                if(numeros[i]==numeros[j]){
//                    repe++;
//                }
//            }
//            
//            if(repe>maxrepe){
//                maxrepe=repe;
//                moda=numeros[i];
//            }
//        }
//        System.out.println("La moda es "+moda);
        

        
        //OPCION2: puede haber más de una moda
        int [] numeros={5,4,5,2,4};
        //int [] numeros={5,4,5,4,3,3,3};
        //int [] numeros={5,4,7,9,10};
        
         
        //En el array modas[] voy guardando las modas encontradas. Es un array
        //que posrñia llegar a tener el mismo tamaño que numeros, si todos
        //los numeros fueran distintos
        int [] modas=new int[numeros.length];
        int totalModas=0;

        for(int i=0; i<numeros.length; i++){
           //Cuento repeticiones del elemento i 
           repe=0;

           for(int j=0; j<numeros.length; j++){
               if(numeros[i]==numeros[j]){
                   repe++;
               }
           }

           //Encuentro una nueva moda
           if(repe>maxrepe){
               //System.out.println("..log..Nueva moda:"+numeros[i] );
               //Aquí podría resetar a 0 el array modas, pero al llevar
               //la variable totalModas, no es nenesario.
               maxrepe=repe;
               totalModas=1;
               modas[totalModas-1]=numeros[i];

           }

           //Encuntro otra moda con las mismas repeticiones
           else if (repe==maxrepe){
               //Primero compruebo que esa moda no esta ya hallada y metida
               boolean modaYaTratada=false;
               for (int j = 0; j < modas.length; j++) {
                   if (numeros[i]==modas[j]){
                       modaYaTratada=true;
                   }
               }
               
               if (!modaYaTratada){
                   //System.out.println("..log..Mismas repetciones del "+numeros[i]); 
                   totalModas++;
                   modas[totalModas-1]=numeros[i];
               }
           }
        }
        
        //Muestro las modas. Las tengo en el array modas. Y tengo totalModas
        //Me he liado en mostrarlo para que salga bonito, cada modas
        //separada por coma
        System.out.print("La moda es: ");
        System.out.print(modas[0]);
        for (int i = 1; i < totalModas; i++) {
             System.out.print(", "+modas[i]);
        }
        System.out.println(); 
      



    }
    
}
