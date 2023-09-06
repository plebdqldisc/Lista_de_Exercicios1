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
public class faixaetar {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         int idade;
         
         System.out.println("Faixa Etaria");
         
         System.out.println("informe sua idade por favor");
         idade = scanner.nextInt();
         
         if (idade >= 5 && idade <=7) {
             System.out.println("Você está qualificado como: Infantil A");
             
         } else if (idade >= 8 && idade <=10) {
             System.out.println("Você está qualificado como: Infantil B");
         } else if (idade >= 11 && idade <=13) {
             System.out.println("Você está qualificado como: Juvenil A");    
         } else if (idade >= 14 && idade <=17) {
             System.out.println("Você está qualificado como: Juvenil B");   
         }  else if (idade >= 18) {
             System.out.println("Você está qualificado como: Adulto");
         }    
         
         
         
    }
    
    
    
}
