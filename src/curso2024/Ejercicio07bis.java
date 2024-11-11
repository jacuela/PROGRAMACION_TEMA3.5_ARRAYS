/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio07bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String linea="alicia;peralta;manduca;alicia.peralta@gmail.com;600554433";
        
        String nombre_apellidos;
        String usuario;
        String telefono;
        
        String[] campos=linea.split(";");
        nombre_apellidos=campos[0]+" "+campos[1]+" "+campos[2];
        //nombre_apellidos=String.format("%s %s %s",campos[0],campos[1],campos[2]);
        telefono=campos[4];
        
        
        //Hago el segundo split sobre el email para obtener el nombre de usuario
        String[] campos_email=campos[3].split("@");
        usuario=campos_email[0];
        
        
        System.out.println("Nombre:"+nombre_apellidos);
        System.out.println("Usuario:"+usuario);
        System.out.println("Telefono:"+telefono);
        
    }
    
}
