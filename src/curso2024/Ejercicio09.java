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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        String []nombres = {"Juan","Amparo","Pepito","Viejo","Otro"}; // new String[5];
        int []edades = {45,35,11,65,24}; //new int[5];
        
        String nombre;
        int edad;
        
        String nombreAlumnoMayor="";
        String nombreAlumnoMenor="";
        int posicionEdadMayor;
        int posicionEdadMenor;
        
        int menorEdad, mayorEdad;
        
        //EJERCICIO - ARRAY AL COMPLETO
        
        //relleno los campos
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.print("Nombre:");
//            nombre=teclado.nextLine();
//            nombres[i]=nombre;
//            
//            System.out.print("Edad:");
//            edad=Integer.parseInt(teclado.nextLine());
//            edades[i]=edad;
//            
//        }
        
        //Obtengo la poscion del alumno mayor y menor
        //Necesito saber la menor y la mayor edad
        menorEdad=edades[0];
        posicionEdadMenor=0;
        
        mayorEdad=edades[0];
        posicionEdadMayor=0;
        
        for (int i = 0; i < edades.length; i++) {
            if (edades[i]<menorEdad){
                menorEdad=edades[i];
                posicionEdadMenor=i;
            }
            
            if (edades[i]>mayorEdad){
                mayorEdad=edades[i];
                posicionEdadMayor=i;
            }
            
        }
        
        nombreAlumnoMayor=nombres[posicionEdadMayor];
        nombreAlumnoMenor=nombres[posicionEdadMenor];
        
        System.out.println("Alumno de mayor edad: "+nombreAlumnoMayor);
        System.out.println("Alumno de menor edad: "+nombreAlumnoMenor);
        
        
        
        
    }
    
}
