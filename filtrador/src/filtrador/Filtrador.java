/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Chuwi
 */
public class Filtrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros;
        int i=1;
        int contNegativos=0;
        int contPositivos=0;
        int contNeutros=0;
        while(i<=5){
            numeros=Integer.parseInt(JOptionPane.showInputDialog("ingrese numeros (numero"+i+")"));
            if (numeros<0){
                contNegativos++;
            }else if(numeros==0){
                contNeutros++;
            }else if(numeros>0){
                contPositivos++;
            }
           
           
            i++;
        }
         JOptionPane.showMessageDialog(null, "Numeros positivos hay: "+contPositivos+"\n numeros negatios hay: "+contNegativos+"\nnumeros neutros hay: "+contNeutros);
    }
    
}
