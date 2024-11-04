/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int dia, mes, año;
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        
        diaCorrecto=false; 
        mesCorrecto=false; 
        añoCorrecto=false;
             
        
        int [] diasMes={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String [] mesesAño={"","enero","febrero","marzo","abril","mayo",
                            "junio","julio","agosto","septiembre","octubre",
                            "noviembre","diciembre"};
        
       
        
        
        System.out.print("Dime el dia:");
        dia=Integer.parseInt(entrada.nextLine());
        
        System.out.print("Dime el mes:");
        mes=Integer.parseInt(entrada.nextLine());
        
        System.out.print("Dime el año:");
        año=Integer.parseInt(entrada.nextLine());
        
        
        //Comprobamos el año
        if (año>1900 && año<3000){
            añoCorrecto=true;
          
        }
        
        //Comprobamos el mes
        if (mes>=1 && mes<=12){
            mesCorrecto=true;
        }
        
        //Comprobamos el dia
        if (dia >=1 && (dia <= diasMes[mes])){
            diaCorrecto=true;
        }
        //Si el año es bisiesto, el dia 29 es válido
        if (Year.of(año).isLeap() && dia==29){
            diaCorrecto=true;
        }
        
        //Analizo los tres booleanos  
        if (diaCorrecto && mesCorrecto && añoCorrecto){
           
           //System.out.println("El <"+dia+" de "+mesesAño[mes]+" de "+año+" es CORRECTO");
           System.out.printf("El <%d de %s de %d> es CORRECTO\n",dia,mesesAño[mes],año);
        }else{
           
           if (diaCorrecto == false) {
               System.out.println("La fecha es INCORRECTA. Día incorrecto");
           }
           if (!mesCorrecto) {
               System.out.println("La fecha es INCORRECTA. Mes incorrecto");
           }
           if (añoCorrecto == false) {
               System.out.println("La fecha es INCORRECTA. Año incorrecto");
           }
           
       }
           
           
        
        
        
        
    }
    
}
