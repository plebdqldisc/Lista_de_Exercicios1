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
public class exercicio7 {
    public static void main(String[] args) {
        //FATORIAL
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INSIRA O NUMERO QUE VOCÊ DESEJA FATORAR: ");
        int numero_fatoracao, cont= 1;
        int teste = 1;
        
        numero_fatoracao = scanner.nextInt();
        
        while( teste <= numero_fatoracao) {
            
            cont *= teste;
            teste++;
                    
            System.out.println("O fatorial de " + numero_fatoracao + " é " + cont);
            
            
        }
        
        
    }
}
