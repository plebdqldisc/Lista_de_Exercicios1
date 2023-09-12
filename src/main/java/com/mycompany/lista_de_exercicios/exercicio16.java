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
         //Scanner scanner = new Scanner(System.in);
         
         System.out.println("digite uma frase");
         String frase = new Scanner(System.in).nextLine(); //pode ser feito dessa forma tambem!
         
         int numCaract = 0;
         
         
         //frase = scanner.nextLine();
         
        for(int indice = 0; indice < frase.length(); indice++) {
            if (frase.charAt(indice) != ' ') {
                numCaract++;
            
            }
        }
         System.out.println("O numero de caracteres na frase é " + numCaract);
    }
}
