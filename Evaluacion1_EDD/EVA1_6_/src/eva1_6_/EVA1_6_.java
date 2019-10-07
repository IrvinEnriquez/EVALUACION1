/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_6_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hay0 dos maneras de declarar
        int aiDatos[], a, b;
        int[] aiDatos2, x, y;
        //
        int aiCopia[];
        //inicializacion del arreglo
        int tam=100;
        aiDatos= new int [tam];
        //llenar los valores aleatorios
        for (int i = 0; i < aiDatos.length ; i++) {
            aiDatos[i]= (int)(Math.random()*100)+1;
            System.out.println(aiDatos[i]);
            
             
        }
        System.out.println("");
        tam=200;
        aiDatos=new int[tam];
        //llenar de valores aleatorios
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]=(int)(Math.random()*100)+1;
            System.out.println(aiDatos[i]);
            
            //Caracteristicas de los arreglos
            //*son objetos *la memoria es consecutiva ¨*son de acceso aleatorio
            aiDatos[4]=5000;
            aiDatos[69]=5000;
            //*son muy rapidos * son inmutables
        }
    }
    
}
