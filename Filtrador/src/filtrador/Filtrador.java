/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtrador;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Filtrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int c1 = 0,c2 = 0,c3 = 0;
        
        for(int i = 1; i <= 20; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero " + i));
            
            if(num<0){
              c1++;  
            }else{
                if(num>0){
                    c2++;
                }else{
                    if(num==0){
                        c3++;
                    }
                }
            }
            
        }
        JOptionPane.showMessageDialog(null, "Ay " + c1 + " numeros negativos" + "\n" +
                "Ay " + c2 + " numeros positivos " + "\n" +
                "Ay " + c3 + " numeros neutros");
    }
    
}
