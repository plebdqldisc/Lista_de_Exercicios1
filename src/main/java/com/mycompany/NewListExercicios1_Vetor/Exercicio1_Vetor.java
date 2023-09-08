/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor;
import java.util.Scanner;
/**
 *
 * @author arthur.7923
 */
public class Exercicio1_Vetor {
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe quantos numeros deseja somar: ");
        int quantid = scanner.nextInt();
        
        int[] numeros = new int [quantid];
        
        for (int cont = 0; cont < quantid; cont++) {
            System.out.println("informe o numero " + (cont + 1) + ": " );
            numeros[cont] = scanner.nextInt();
        }
        
        int soma = calcularSoma(numeros);
        System.out.println("A soma dos numeros do array é " + soma);
        
    }
    public static int calcularSoma(int[] numeros) {
        int soma = 0;
        
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
