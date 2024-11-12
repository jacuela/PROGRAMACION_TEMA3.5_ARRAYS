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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        String []nombres = new String[5];
        int []edades = new int[5];
        String nombre;
        int edad;
        int i;
        String nombreAlumnoMayor="";
        String nombreAlumnoMenor="";
        int edadMayor;
        int edadMenor;
        
        //PARTE1 - ARRAY RELLENO AL COMPLETO
        

        
        for (int j = 0; j < nombres.length; j++) {
            
            System.out.print("\nNombre del alumno [* para terminar]:");
            nombre=entrada.nextLine();
            nombres[j]=nombre;    
            
            if (!nombre.equals("*")){
                System.out.print("Edad del alumno:");
                edades[j]=Integer.parseInt(entrada.nextLine());    
            }else{
                //Si estoy aquí, es porque he metido un *
                edades[j]=-1;  //meto el -1 en el otro array
                break;         //aborto el bucle
            }
        }
        
        
        //Imprimo los resultados usando un while
        //Recorro el vector hasta el final o hasta encontrar un negativo
        i=0;
        while (i<nombres.length && !nombres[i].equals("*")){
            System.out.print(nombres[i]+"-----");
            System.out.println(edades[i]);
            i++;
        }
        
//        for (int j = 0; j < nombres.length; j++) {
//            if (!nombres[j].equals("*")){
//                System.out.print(nombres[j]+"-----");
//                System.out.println(edades[j]);
//            }
//            else
//                break;
//            
//        }
        
        
        
        //Recorro el vector edades hasta el final o hasta encontrar un negativo
        //Guardo los indices de mayor y menor edad
        i=0;
        edadMayor=edades[0];
        edadMenor=edades[0];
        nombreAlumnoMayor=nombres[0];
        nombreAlumnoMenor=nombres[0];
        
        
        //Usando un for
        for (int j = 0; j < nombres.length; j++) {
            
            //Si el nombre actual es distinto de *
            if (!nombres[j].equals("*")){
                
                //Guardo la maxima edad y el alumno de max edad
                if (edades[j]>edadMayor){
                    edadMayor=edades[j];
                    nombreAlumnoMayor=nombres[j];
                }
                //Guardo la minima edad y el alumno de min edad
                if (edades[j]<edadMenor){
                    edadMenor=edades[j];
                    nombreAlumnoMenor=nombres[j];
                }
            }
            else{
                break;
            }        

        }
        
        
        
        
//        //Usando un While        
//        while (i<edades.length && edades[i]!=-1){
//            
//            //Guardo la maxima edad y el alumno de max edad
//            if (edades[i]>edadMayor){
//                edadMayor=edades[i];
//                nombreAlumnoMayor=nombres[i];
//            }
//            
//            //Guardo la minima edad y el alumno de min edad
//            if (edades[i]<edadMenor){
//                edadMenor=edades[i];
//                nombreAlumnoMenor=nombres[i];
//            }
//            i++;
//        }
        
        System.out.println("El nombre del mas viejo es: "+nombreAlumnoMayor);
        System.out.println("El nombre del mas pipilolo es: "+nombreAlumnoMenor);
        
        

        
        
        
    } //fin main
    
}
