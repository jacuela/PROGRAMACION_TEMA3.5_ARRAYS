/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author alberto.sanchez
 */
public class Ejercicio08 {
     public static void main(String[] args) {
        // TODO code application logic here 
       
        Scanner nuevo = new Scanner(System.in);
      
        String [] alumnos = {"Francisco","Marcos","Laura","Marta","Pedro"};
        double [] primerTrimestre =  {7,10,4,5,6};
        double [] segundoTrimestre = {4,10,10,5,5};
        double [] tercerTrimestre =  {1,10,8,2,3};
        
        double mediaAlumno;
        double sumaPrimerTrim = 0;
        double sumaSegundoTrim = 0;
        double sumaTercerTrim = 0;
        int posicion;
        
         System.out.println("Listado de alumnos");
         System.out.println("****************** ");
         for (int i = 0; i < alumnos.length; i++) {
             System.out.println((i+1)+". "+alumnos[i]);
         }
         System.out.println("");
         
         
         System.out.print("Dime la posición del alumno a buscar: ");
         posicion = Integer.parseInt(nuevo.nextLine());
         
         //En realidad, el alumno esta la en posicion-1
         mediaAlumno = (primerTrimestre[posicion-1] + segundoTrimestre[posicion-1] + tercerTrimestre[posicion-1]) / 3;
         System.out.printf("La media de %s es %.2f",alumnos[posicion-1],mediaAlumno);
         
         
         System.out.println("\n\n---------- medias del grupo ----------\n");
         
         //Calculo las medias de cada trimestre
         //*************************************
         for (int i = 0; i < primerTrimestre.length; i++) {
             sumaPrimerTrim = sumaPrimerTrim + primerTrimestre[i];   
             sumaSegundoTrim = sumaSegundoTrim + segundoTrimestre[i];
             sumaTercerTrim = sumaTercerTrim + tercerTrimestre[i];
         }
         System.out.println("La media del primer trimestre de todo el grupo es: "+(sumaPrimerTrim / (primerTrimestre.length)));
         System.out.println("La media del segundo trimestre de todo el grupo es: "+(sumaSegundoTrim / (segundoTrimestre.length)));
         System.out.println("La media del tercer trimestre de todo el grupo es: "+(sumaTercerTrim / (tercerTrimestre.length)));
         //********************************************************
     
     }   
}
