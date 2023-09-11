/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor;
/**
 *
 * @author arthur.7923
 */
public class ex_1vetor {
    public static void main (String args []) {
        
        int[] numeros = new int[5];
        
        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 12;
        numeros[3] = 13;
        numeros[4] = 14;
        
        int soma = 0;
        for(int i = 0; i < 5; i++){
            soma = soma + numeros[i];
        }    
          System.out.println(soma);  
        
    }
}
