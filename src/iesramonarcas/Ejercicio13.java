/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

/**
 *
 * @author jacuela
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] alumnos = new String[5];
        double suma;
      
    
        alumnos[0] = "Juan";
        alumnos[1] = "Celia";
        alumnos[2] = "Alfredo";
        alumnos[3] = "Maria";
        alumnos[4] = "Pedro";
        
        
        double [][] notas = {{5,6,7,0},{4,2,7,0},{6,8,9,0},{10,8,9,0},{4,2,4,0}};
        
//        double [][] notas2 = new double[5][4];
//        notas2[0][0]=5;
//        notas2[0][1]=6;
//        notas2[0][2]=7;
//        
//        notas2[1][0]=4;
//           . . . 
        
        //Recorremos por filas y rellenamos la 
        //columna 4 que es la media de las anteriores
        for (int fila = 0; fila < 5; fila++) {
            suma=0;
            for (int columna = 0; columna < 3; columna++) {
                suma=suma+notas[fila][columna];
            }
            notas [fila][3]=suma/3;
        }
        
        //Imprimimos la tabla
        System.out.println("        EVA1  EVA2  EVA3  MEDIA");
        System.out.println("--------------------------------");
        for (int fila = 0; fila < 5; fila++) {
            
            System.out.printf("%-7s",alumnos[fila]);
            for (int columna = 0; columna < 4; columna++) {
                System.out.printf("%5.1f ", notas[fila][columna]);
                
            }
            System.out.println(" ");
        }
        
        
        //Rellenamos una tabla con los suspensos por evaluación
        int []listaSuspensos=new int[3];
        int suspensos;
        
        for (int columna = 0; columna < 3; columna++) {
             suspensos=0;
             for (int fila = 0; fila < 5; fila++) {
                 if(notas [fila][columna]<5){
                    suspensos++;
                 }
             }
             listaSuspensos[columna]=suspensos;
        }
        
        System.out.println("--------------------------------");
        System.out.print("Suspen:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%5d ", listaSuspensos[i]);
        }
        System.out.println("");
        
        
        //Busco la media mayor y el nombre asociado
        String nombreMayorMedia="-----"; 
        double mayorMedia=0;
        System.out.println("");
        for (int fila = 0; fila < 5; fila++) {
                if(notas [fila][3]>mayorMedia){
                    mayorMedia=notas[fila][3];
                    nombreMayorMedia=alumnos[fila]; 
                }
        
        }
        System.out.print("El alumno de mayor media es "+nombreMayorMedia+ " con una media de: "+mayorMedia );
        System.out.println("");
        
        
    }
    
}
