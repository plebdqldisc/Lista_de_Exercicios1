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
public class exercicio5 {
    public static void main(String[] args) {
    
        int maximo;
        
        Scanner scanner = new Scanner( System.in);
        
        System.out.println("informe o numero que começa");
        maximo = scanner.nextInt();
        System.out.println("Está aqui a contagem: ");
        
        while(maximo >= 0) {
            System.out.println(maximo);
            
            maximo = maximo - 1;
        }
        
            System.out.println("Contagem feita");
    }
}
