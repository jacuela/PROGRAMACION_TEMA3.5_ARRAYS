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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nuevo = new Scanner(System.in);
      
        
        //DATOS DEL PROGRAMA  ===============================================
        String [] alumnos = {"Francisco","Marcos","Laura","Marta","Pedro"};
        double [] primerTrimestre =  {7,10,4,5,6};
        double [] segundoTrimestre = {4,10,10,5,5};
        double [] tercerTrimestre =  {1,10,8,2,3};
        //===================================================================
        
        
        double mediaAlumno,mediaGrupo=0,sumaParcialGrupo=0,mediaParcialGrupo=0;
        
        double sumaPrimerTrim = 0;
        double sumaSegundoTrim = 0;
        double sumaTercerTrim = 0;
        int posicion;
        
        
        
        
         System.out.println("Listado de alumnos");
         System.out.println("================== ");
         for (int i = 0; i < alumnos.length; i++) {
             System.out.println((i+1)+". "+alumnos[i]);
         }
         System.out.println("");
         
         
         System.out.print("Seleccion un alumno: ");
         posicion = Integer.parseInt(nuevo.nextLine());
         System.out.println("");
         //En realidad, el alumno esta la en posicion-1
         System.out.println("1ªeva    2ªeva    3ªeva");
         System.out.println("-----------------------");
         System.out.println(primerTrimestre[posicion-1]+"      "+segundoTrimestre[posicion-1]+"      "+tercerTrimestre[posicion-1]);
         
         
         System.out.println("");
         
         
         mediaAlumno = (primerTrimestre[posicion-1] + segundoTrimestre[posicion-1] + tercerTrimestre[posicion-1]) / 3;
         System.out.printf(">La media de %s es %.2f\n\n",alumnos[posicion-1],mediaAlumno);
         
         
         
         //Calculo la media del grupo entero. Para ello, tengo que calcular las medias
         //de todos los alumnos, sumarlas y dividirlas por el tamaño del gruopo
         for (int i = 0; i < alumnos.length; i++) {
             mediaParcialGrupo = (primerTrimestre[i] + segundoTrimestre[i] + tercerTrimestre[i])/3; 
             sumaParcialGrupo=sumaParcialGrupo+mediaParcialGrupo;
             //System.out.printf("media de %s:%.2f\n",alumnos[i],mediaParcialGrupo);
         }
         mediaGrupo = sumaParcialGrupo / alumnos.length;
         
         System.out.println(">La media del GRUPO es es "+mediaGrupo);
         
         
        
    }
    
}
