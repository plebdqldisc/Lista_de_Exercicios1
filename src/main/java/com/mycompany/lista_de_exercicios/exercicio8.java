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
public class exercicio8 {
    
    public static void main(String[] args) {
        // NUMERO PRIMO
        
        int num1;
        
        Scanner scanner = new Scanner ( System.in);
        
        System.out.println("-----NUMEROS PRIMOS-----");
        
        System.out.println("Insira o numero: ");
        num1 = scanner.nextInt();
        
        if (num1 % 59 == 0){
            
            System.out.println("Deu numero primo");
            
            
            
           }else {
            System.out.println("Não deu numero primo");
            
        }
    }
}
