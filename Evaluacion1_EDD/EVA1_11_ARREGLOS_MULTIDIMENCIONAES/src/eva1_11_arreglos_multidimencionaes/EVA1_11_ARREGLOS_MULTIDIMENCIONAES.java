/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_arreglos_multidimencionaes;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_11_ARREGLOS_MULTIDIMENCIONAES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aDatos[][]= new int[3][3];
        System.out.println("Direccion del arreglo "+ aDatos);
        System.out.println("Tamaño del arreglo "+ aDatos.length);
        
        System.out.println("Direccion del arreglo "+ aDatos[0]);
        System.out.println("Tamaño del arreglo "+ aDatos[0].length);
        
        System.out.println("Direccion del arreglo "+ aDatos[0][0]);
        System.out.println("Valor de la arreglo "+ aDatos[0][0]);
        
    }
    
}
