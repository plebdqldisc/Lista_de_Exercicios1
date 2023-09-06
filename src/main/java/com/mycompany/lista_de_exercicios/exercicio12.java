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
public class exercicio12 {
     public static void main(String[] args) {
         
         
        Scanner scanner = new Scanner ( System.in);
         
         
         float num1;
         float num2;
         System.out.println("--TROCA-DE-VARIAVEIS--");
         
         System.out.println("digite o valor numerico de duas variaveis");
         num1 = scanner.nextFloat();
         
         System.out.println("digite mais um valor numerico");
         num2 = scanner.nextFloat();
         
         System.out.println("O valor das variaveis agora: ");
         
         System.out.println("Variavel 1: " + num1);
         
         System.out.println("Variavel 2: " + num2);
         
         System.out.println("agora variaveis diferentes: ");
         float mudança;
         
         mudança = num1;
         num1 = num2;
         num2 = mudança;
         
         System.out.println("Variavel 1: " + num1);
         
         System.out.println("Variavel 2: " + num2);
         
         System.out.println("fim da operação");
     }
}

