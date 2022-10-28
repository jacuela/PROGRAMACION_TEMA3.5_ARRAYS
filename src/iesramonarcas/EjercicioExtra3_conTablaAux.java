/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iesramonarcas;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class EjercicioExtra3_conTablaAux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char []tablaAux=new char[10];
        
        int[] lista1={1,2,3,5};
        
        //int[] lista2={1,9,5,2};
        int[] lista2={3,1,2,5};
        
        boolean sonIguales=true;
        
        //Paso1: relleno la taba auxiliar con los
        //numeros de lista1
        for (int i = 0; i < lista1.length; i++) {
            int num=lista1[i];
            tablaAux[num]='x';
        }
        
        //Imprimo la tabla aux por gusto
        for (int i = 0; i < tablaAux.length; i++) {
            System.out.println("Posicion "+i+": "+tablaAux[i]);
        }
        
        //Paso2:compruebo si los elementos de la lista2
        //se encuentran marcados en la tablaAux
        for (int i = 0; i < lista2.length; i++) {
            int num=lista2[i];
            if (tablaAux[num]!='x'){
                sonIguales=false;
            }
            
        }
        System.out.println("");
        if (sonIguales) System.out.println("Sí son iguales");
        else System.out.println("NO son iguales");
        
       
        
    }
    
}
