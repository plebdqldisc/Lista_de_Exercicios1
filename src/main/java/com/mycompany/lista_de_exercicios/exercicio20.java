/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios;

import java.util.Scanner;
//SOMA DOS DIGITOS
/**
 *
 * @author arthur.7923
 */
public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
      System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();
        
        int soma = 0;
       
        while (numero != 0) {
            int digito = numero % 10; 
            soma += digito;
            numero /= 10; 
        }
        
        System.out.println("A soma dos dígitos é: " + soma);
        
        
        
        
        
        
        
    }
        
    
    
}
