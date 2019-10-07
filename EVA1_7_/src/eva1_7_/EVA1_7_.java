/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_7_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiDatos[]= new int[10];
        int aiCopia[]= new int[10];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]= (int)(Math.random()*100)+1;
            
        }
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("["+aiDatos[i]+"]");
            
        }
        System.out.println(aiDatos);//Así no se copian los arreglos
        aiDatos=aiCopia;
        aiCopia=aiDatos;
        System.out.println("Datos copiados");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("["+aiDatos[i]+"]");
            
        }
    }
    
}
