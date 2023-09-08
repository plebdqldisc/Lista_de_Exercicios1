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
public class Exercicio2_Vetor {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos elementos deseja inserir: ");
            int quantidElements = scanner.nextInt();
            int elemento;
        
            float soma = 0;
        
        for (int cont = 0; cont < quantidElements; cont++) {
            System.out.println("informe o elemento " + cont + ": " );
            elemento = scanner.nextInt();
            soma += elemento;
        }
        float media = soma / quantidElements;
        System.out.println("A média dos elementos é: " + media);
    }
    
}
