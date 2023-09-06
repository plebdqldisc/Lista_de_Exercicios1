/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios;

import java.util.Scanner;

/**
 *
 * @author arthur.7923
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int soma;
        
        Scanner scanner = new Scanner (System.in);
        
        
        System.out.println("------SOMA------");
    
        System.out.println("insira o primeiro numero");
        num1 = scanner.nextInt();
        
        System.out.println("insira o segundo numero");
        num2 = scanner.nextInt();
        
        soma = num1 + num2;
        System.out.println("sua soma deu: " + soma);
    }
    
}
