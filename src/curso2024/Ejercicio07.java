/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[]palabras;
        
        String frase="Alicia tiene 30 años y es guapa";
        
        palabras=frase.split(" ");
        
        
        //Indico numero de palabras
        System.out.println("Hay "+palabras.length+" palabras");
        System.out.println("---------");
        //Imprimo las palabras
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        System.out.println("---------");

        
        String fecha="6/11/2024";
        
        String []camposFecha=fecha.split("/");
        System.out.println("Dia:"+camposFecha[0]);
        System.out.println("Mes:"+camposFecha[1]);
        System.out.println("Año:"+camposFecha[2]);
        
        
        
        
    }
    
}
