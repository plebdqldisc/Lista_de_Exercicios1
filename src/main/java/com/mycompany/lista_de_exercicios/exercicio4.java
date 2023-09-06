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
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
     
        int opcao;
        float num1, num2, resultado;
     
     
        System.out.println("informe a operação");
        System.out.println("1- SOMA");
        System.out.println("2- SUBTRAÇÃO");
        System.out.println("3- MULTIPLICAÇÃO");
        System.out.println("4- DIVISÃO");
     
        opcao = scanner.nextInt();
     
     
        if (opcao == 1) { //é a soma
            System.out.println("++SOMA++");

            System.out.println("Informe o primeiro numero: ");
                num1 = scanner.nextFloat();

            System.out.println("informe o segundo numero:");
                num2 = scanner.nextFloat();

            resultado = num1 + num2;
                    
            System.out.println("A soma deu: " + resultado);   
        }else if (opcao == 2) { //é a subtração
            
            System.out.println("--Subtração--");

            System.out.println("informe o primeiro numero: ");
                num1 = scanner.nextFloat();

            System.out.println("informe o segundo numero: ");    
                num2 = scanner.nextFloat();

                resultado= num1 - num2; 

            System.out.println("A subtração deu: " + resultado); 
        }else if (opcao == 3) { //é a multiplicação
            System.out.println("**Multiplicação**");

            System.out.println("informe o primeiro numero: ");
                num1 = scanner.nextFloat();

            System.out.println("informe o segundo numero: ");
                num2 = scanner.nextFloat();

                resultado = num1 * num2; 

            System.out.println("A multiplicação deu: " + resultado); 
        }else if (opcao == 4) { //é a divisão
            System.out.print("\\DIVISÃO//");
            System.out.println("informe o primeiro numero:");
                num1 = scanner.nextFloat();

            System.out.println("informe o segundo numero:");
                num2 = scanner.nextFloat();

                resultado = num1 / num2;

            System.out.println("resultado da Divisão:" + resultado); 
        }else {
            System.out.println("operação não cadastrada na calculadora!");
            
        }  
    }
}  

