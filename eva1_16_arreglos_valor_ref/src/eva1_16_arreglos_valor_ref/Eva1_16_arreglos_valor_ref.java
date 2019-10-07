/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_arreglos_valor_ref;

/**
 *
 * @author Irvin Papu
 */
public class Eva1_16_arreglos_valor_ref {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arre[]= new int[12];
        System.out.println(arre);
        llenarArreglo(arre);
        madreaArreglo(arre);
        System.out.println(arre);
        imprimirArreglo(arre);
                
    }
    public static void llenarArreglo(int[]arreg){
        for (int i = 0; i < arreg.length; i++) {
            arreg[i]=(int)(Math.random()*100);
            
        }
        System.out.println(arreg);
    }
    public static void madreaArreglo(int[]arre){
        arre=  new int [100];
        System.out.println(arre);
        
    }
    public static void imprimirArreglo(int[]arreg){
            for (int i = 0; i < arreg.length; i++) {
                System.out.print("["+ arreg[i]+"]");
            }
            System.out.println("");
    }
}
