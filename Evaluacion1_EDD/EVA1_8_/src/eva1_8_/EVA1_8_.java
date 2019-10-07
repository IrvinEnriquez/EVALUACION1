/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_8_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiDatos[]= new int[10];
        int aiCopia[]= new int[10];
        System.out.println("Datos originales ");
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]=(int)(Math.random()*100)+1;
            
        }
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("["+aiDatos[i]+"]");
            
            System.out.println("");
        }
        for (int i = 0; i < aiDatos.length; i++) {
            aiCopia[i]=aiDatos[i];
            
        }
        Imprimir(aiDatos);
        Imprimir(aiCopia);
    }
    public static void Imprimir(int[]args){
        for (int i = 0; i < args.length; i++) {
            System.out.print("["+args[i]+"]");
            
        }
        System.out.println(args);
    }
    
}
