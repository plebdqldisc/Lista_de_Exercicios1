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
        
        int[] numero = new int[5]; //Numero representará 5 valores( do 0 ao 4 )
        
        for(int i = 0; i<5; i++ ){ //i<5 o loop do i(contador) guarda informações q o usuario mandou até 5 valores(0 ao 4), o i++ é apenas o contador do loop.
            System.out.println("INFORME O VALOR PARA A POSIÇÃO[" + i + "]: ");
            numero[i] = scanner.nextInt(); // valores que o usuario vai mandar para cada posição!
            
        }
        System.out.println("VALORES INFORMADOS: ");
        for (int i = 0; i<5; i++) {
            System.out.println("valor na posição " + i + ": " + numero[i]); // i representa as posições 0 ao 4(5 posições) e numero[i] representa o valor q o user mandou pra cada um em ordem!
            
        }
    }
    
}
