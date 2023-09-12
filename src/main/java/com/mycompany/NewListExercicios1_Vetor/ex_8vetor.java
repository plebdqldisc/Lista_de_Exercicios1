/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosdevetor;
//Ordenação
/**
 *
 * @author Usuario
 */
public class ex_8vetor {
    public static void main (String[] args) {
        int[] elementos = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
        int indmeno;
        
        
        for(int indi = 0; indi< elementos.length; indi++) {
            indmeno = indi;
            for(int j = indi; j< elementos.length; j++){
                if (elementos[j] < elementos[indmeno]){
                    indmeno = j;
                }
            }
            
            int segura = elementos[indi];
            elementos[indi] = elementos[indmeno];
            elementos[indmeno] = segura;
        }
        
        for(int indi =0; indi< elementos.length; indi++) {
            System.out.println(elementos[indi]);
        }
    }
}
