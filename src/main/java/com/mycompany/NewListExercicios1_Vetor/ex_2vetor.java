/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor;

/**
 *
 * @author arthur.7923
 */
public class ex_2vetor {
    public static void main (String args []) {
        
        
        int[] numeros = new int[5];
        int quantidElements = 5;
        
        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 12;
        numeros[3] = 13;
        numeros[4] = 14;
        
        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        
        for(int cont = 0; cont < 5; cont++){
        }
        float media = soma / quantidElements;
            System.out.println("A media dos elementos é: " + media);
    }
    
}
