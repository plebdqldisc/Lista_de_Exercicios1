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
public class exercicio6 {
   public static void main(String[] args) {
       //tabuada do 1 ao 10
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("informe um numero de 1 a 10: ");
       int numero_tabuada, cont = 1;
       int resultado;
       
       numero_tabuada = scanner.nextInt();
       
       System.out.print("Tabuada do numero: ");
       
       while(cont <= 10) {
          resultado = numero_tabuada * cont;
          System.out.println(numero_tabuada + " X " + cont + "=" + resultado );
          
          cont++;
          
        
           
           
       }
   }
    
}
