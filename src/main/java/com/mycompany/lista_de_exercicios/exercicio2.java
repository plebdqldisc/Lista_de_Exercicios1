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
public class exercicio2 {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        float media;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("--------MEDIA--------");
        
              System.out.println("insira o primeiro numero");
        num1 = scanner.nextInt();
        
              System.out.println("insira o segundo numero");
        num2 = scanner.nextInt();
        
              System.out.println("insira o terceiro numero");
        num3 = scanner.nextInt();
        
        
        media = (num1 + num2 + num3) /3 ;
        
        System.out.println("sua media deu: " + media);
    }
    
}
