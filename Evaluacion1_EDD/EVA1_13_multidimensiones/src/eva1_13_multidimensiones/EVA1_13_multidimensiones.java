/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_multidimensiones;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_13_multidimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mat[][][][][]= new int[5][3][8][10][11];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                for (int k = 0; k < mat[i][j].length; k++) {
                    for (int l = 0; l < mat[i][j][k].length; l++) {
                        for (int m = 0; m < mat[i][j][k][l].length; m++) {
                            mat[i][j][k][l][m]=(int)(Math.random()*100);
                            System.out.print("["+mat[i][j][k][l][m]+"]");
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
    }
    
}
