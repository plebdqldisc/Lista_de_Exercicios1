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
public class exercicio16 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("digite uma frase");
         String frase;
         
         int cont = 0;
         int index= 0;
         
         frase = scanner.nextLine();
         
         while ( index < frase.length() ) {
         if (frase.charAt(index) != ' ') {
                cont++;
            }
            index++;
        }
         System.out.println("A frase tem " + cont + " caracteres ");
     }
    
}
