/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor;

import java.util.Scanner;

/**
 *
 * @author arthur.7923
 */
public class ex_3vetor {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int maior, menor;
        
        numeros[0] = 1;
        numeros[1] = 11;
        numeros[2] = 12;
        numeros[3] = 13;
        numeros[4] = 30;
        
        maior = numeros[0];
        for(int cont = 0; cont < numeros.length; cont++) {
            if(numeros[cont] > maior) {
                maior = numeros[cont];
            } 
        }
        menor = numeros[0];
        for(int cont = 0; cont < numeros.length; cont++) {
            if(numeros[cont] < menor) {
                menor = numeros[cont];
            }
        }
            System.out.println("maior valor neste vetor é: " + maior);
            System.out.println("menor valor neste vetor é: " + menor);
    }
    
}
