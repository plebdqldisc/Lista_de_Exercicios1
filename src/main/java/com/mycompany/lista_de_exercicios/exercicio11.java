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
public class exercicio11 {
 //Maior e menor numero
    
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner ( System.in);
        
        float num1;
        float num2;
        
        System.out.println(" ------MAIOR-E-MENOR------ ");
        
        System.out.println ("Quero que digite dois numeros, para determinar qual é maior ou menor!");
        num1 = scanner.nextFloat();
        
        System.out.println("Agora digite o proximo e vamos ver o resultado");
        num2 = scanner.nextFloat();
        
        if(num1 > num2) {
            System.out.println(num1 + " é maior que " + num2 );
          
        } 
        
        if(num1 < num2) {
            System.out.println(num2 + " é maior que " + num1 );
             
        }
         
        if (num1 == num2) {
            System.out.println(num1 + " é igual a " + num2 );
            
        }
                
            
        
            
        
        
    }
}
