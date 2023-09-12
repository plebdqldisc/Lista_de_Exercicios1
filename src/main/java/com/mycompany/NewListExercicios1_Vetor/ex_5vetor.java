/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosdevetor;
//filtragem de valores pares
/**
 *
 * @author Usuario
 */
public class ex_5vetor {
    public static void main(String[] args) {
        int [] numero ={2, 509, 2319, 5312, 14} ;
        
        System.out.println("Pares da lista:");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i]);
            }
        }
    }
}
