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
public class exercicio3 {
     
    public static void main(String[] args) {
        
        int num1;
        
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("-----PAR OU IMPAR-----");
        
        System.out.println("insira o numero");
        num1 = scanner.nextInt();
        
        if(num1 % 2 == 0){
            System.out.println("deu par"); 
        
        } else{ 
            System.out.println("deu impar");
        }
    }
}
