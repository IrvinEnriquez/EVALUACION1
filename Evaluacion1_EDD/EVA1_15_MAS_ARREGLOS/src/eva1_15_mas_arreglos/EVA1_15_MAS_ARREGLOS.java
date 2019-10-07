/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_mas_arreglos;

/**
 *
 * @author Irvin Papu
 */
public class EVA1_15_MAS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iNum=10;
        System.out.println("Valor = "+ iNum);
        incrementa(iNum);
        System.out.println("Valor = "+ iNum);
        //--
        Prueba obj= new Prueba();
        obj.iVal=10;
        
        System.out.println("Valor = "+ obj.iVal);
        incrementa2(obj);
        System.out.println("Valor = "+obj.iVal);
    }
    public static void incrementa(int iVal){
        iVal++;
        
    }
    public static void incrementa2(Prueba obj){
        obj.iVal++;
    }
    
}
class Prueba{
    int iVal;
}