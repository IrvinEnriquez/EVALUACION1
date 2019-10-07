/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_matrices;

/**
 *
 * @author Irvin Papu
 */
public class Eva1_12_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ma[][]= new int[3][5];
        //for aninado
        for(int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j]= (int)(Math.random()*100);
                
            }
            
        }
        //imprimir
        //otros dos for aninaos
        for(int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                System.out.print("["+ ma[i][j]+"]");
                
            }
            System.out.println("");
            
        }
    }
    
}
