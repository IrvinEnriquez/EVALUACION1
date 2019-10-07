/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_5_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //los arreglos de java en un objeto
        int aiDatos[]= new int[10];
        System.out.println(aiDatos);
        //llenar con valores aleatorios
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]= (int)(Math.random()*100)+1;
            
        }
        System.out.println("For normal");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
            
        }
    }
    
}
