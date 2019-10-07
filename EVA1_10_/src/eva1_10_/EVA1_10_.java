/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_;

import java.util.Scanner;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_10_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] Nombre= new Persona[5];
        Scanner Captu = new Scanner (System.in);
        for (int i = 0; i < Nombre.length; i++) {
            Nombre[i]= new Persona();
            System.out.println("Introduce el nombre; ");
            Nombre[i].Nombre= Captu.nextLine();
            
        }
        imprimirArreglo(Nombre);
        
        Persona[] Copia= new Persona[Nombre.length];
        for (int i = 0; i < Nombre.length; i++) {
            Copia[i]= new Persona();
            Copia[i].Nombre= Nombre[i].Nombre;
            
        }
        
            
        }
    public static void imprimirArreglo(Persona[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nombre: "+args[i].Nombre);
            
        }
    }
    
}
class Persona{
    String Nombre;
}