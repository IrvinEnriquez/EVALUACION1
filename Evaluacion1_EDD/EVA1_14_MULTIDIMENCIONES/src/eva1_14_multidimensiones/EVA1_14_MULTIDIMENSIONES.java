/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_multidimensiones;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_14_MULTIDIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][]= new int[2][3];
        int matriz2[][];
        matriz2= new int[3][];
        matriz2[0]= new int [10];
        matriz2[1]= new int [100];
        matriz2[2]= new int [24];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j]= (int)(Math.random()*100)+1;
                
                
            }
            
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print("["+matriz2[i][j]+"]");
                
            }
            System.out.println("");
        }
    }
    
}
