/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecuencial;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisF
 */
public class Busquedasecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla[] = {4,5,3,1,2};
        int dato;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero a buscar: "));
        
        //busqueda secuencial
        int i =0;
        while(i<5&&band==false){
            if(tabla[i]==dato){
                band = true;
            }
            i++; //al final aumenta la posicion en 1 por eso más adelante es mejor restarle una posición = (i-1)
        }
            
        if (band==false){
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null,"El numero se ha encontrado en la posición: "+(i));//me funciono sin restalar 1 posicion
            
        }
    }
    
}
