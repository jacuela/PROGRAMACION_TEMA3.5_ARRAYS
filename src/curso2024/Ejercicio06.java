/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int []diasMes={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        String [] nombreMeses={"",
                               "enero",
                               "febrero",
                               "marzo",
                               "abril",
                               "mayo",
                               "junio",
                               "julio",
                               "agosto",
                               "septiembre",
                               "octubre",
                               "noviembre",
                               "diciembre"};
        int dia,mes,year;
        boolean  diaCorrecto,mesCorrecto,yearCorrecto;
        
        do{
            System.out.print("Dime el dia:");
            dia=Integer.parseInt(teclado.nextLine());
            if (dia<1 || dia>31) System.out.println(" >Dia erroneo");
        }while(dia<1 || dia>31);
        
        do{
            System.out.print("Dime el mes:");
            mes=Integer.parseInt(teclado.nextLine());
        }while(mes<1 || mes>12);

        System.out.print("Dime el año:");
        year=Integer.parseInt(teclado.nextLine());
        
        
        //Chequeo el año
        if (year>=1900 && year<=3000){
            yearCorrecto=true;
        }else{
            yearCorrecto=false;
        }
        
        //Chequeo el mes
        if (mes>=1 && mes<=12){
            mesCorrecto=true;
        }else{
            mesCorrecto=false;
        }
        
        //Chequeo el dia
        if (dia>=1 && dia<=diasMes[mes]){
            diaCorrecto=true;
        }else{
            diaCorrecto=false;
        }
        
        //Comprobar años bisiestos
        if (Year.of(year).isLeap() && mes==2 && dia>=1 && dia<=29){
            diaCorrecto=true;
        }
        
        
        //Analizamos booleanos
        if (diaCorrecto && mesCorrecto && yearCorrecto){
            System.out.println("Fecha correcta");
            System.out.println("El <"+dia+" de "+nombreMeses[mes]+" del "+year+"> es CORRECTO");
            System.out.printf("El <%d de %s del %d> es CORRECTO",dia,nombreMeses[mes],year);
        }    
        else{
            System.out.println("Fecha incorrecta");
        }
                
        
        
        
        //EXTRA EXTRA EXTRA
        System.out.println("AÑOS BISIESTOS del 2000 al 2030");
        for (int i = 2000; i < 2030; i++) {
            if (Year.of(i).isLeap()){
                System.out.println(i);
            }
        }
        
        
        
    }
    
}
