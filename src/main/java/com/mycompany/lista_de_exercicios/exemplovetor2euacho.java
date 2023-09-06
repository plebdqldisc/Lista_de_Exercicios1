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
public class exemplovetor2euacho {
    public static void main(String args[]) {
        Scanner scanner = new Scanner (System.in);
        
        int[] numero = new int[5];
        
        for(int i = 0; i<5; i++ ){
            System.out.println("INFORME O VALOR PARA A POSIÇÃO[" + i + "]: ");
            numero[i] = scanner.nextInt();
            
        }
        System.out.println("VALORES INFORMADOS: ");
        for (int i = 0; i<5; i++) {
            System.out.println("valor na posição " + i + ": " + numero[i]);
            
        }
    }
    
}
