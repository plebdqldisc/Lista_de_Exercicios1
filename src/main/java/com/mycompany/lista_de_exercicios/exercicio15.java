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
public class exercicio15 {
    public static void main(String[] args) {
        //Media de Notas
        
        
          int nota1;
        int nota2;
        int nota3;
        int Media;
         
        
       Scanner scanner = new Scanner(System.in);
       
         System.out.println("---------Media-de-Notas---------");
       
         System.out.println("Dê o primeiro numero: ");
         nota1 = scanner.nextInt();
                 
          System.out.println("Dê o segundo numero: ");
          nota2 = scanner.nextInt();
          
           System.out.println("Dê o terceiro numero: ");
           nota3 = scanner.nextInt();
        
       Media = (nota1 + nota2 + nota3) / 3;
       
       
       if (Media >= 70) {
           System.out.println("O aluno foi APROVADO");
       } else if (Media <= 70) {
            System.out.println("Aluno reprovado.");
        }
       
       
    }
}
