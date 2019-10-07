/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_;

import java.util.Scanner;

/**
 *
 * @author Irvin Papu
 */
public class EVA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double media=0.0;
        
        System.out.println("Cuantas personas son?");
        Scanner Num= new Scanner (System.in);
        int num= Num.nextInt();
        int[] edad= new int [num];
        for (int i= 0; 1< num; i++) {
        System.out.println("Ingrese edad");
        edad[i]= Num.nextInt();
        media= media + edad[i];
            
        }
    }
    
}
