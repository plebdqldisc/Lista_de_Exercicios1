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
public class exercicio14 {
    public static void main(String[] args) {
        
        //Palindromo
        
        Scanner scanner = new Scanner ( System.in);
         
        String palavra;
        
        System.out.println("Diga alguma palavra para ver se ela é um palindromo");
        palavra = scanner.nextLine();
        
        char[] letraspalavraNormal = new char [palavra.length()];
        char[] letraspalavrainvertida = new char [palavra.length()];
        
        int contInv = palavra.length();
        
        boolean épalindromo = true;
        
        for (int i = 0; i < palavra.length(); i++) {
            contInv--;
            letraspalavraNormal [i] = palavra.charAt(i);// Atribui as letras como 0 como inicio da palavra para contar de forma seguida.
            letraspalavrainvertida [i] = palavra.charAt(contInv);//Atribui as letras como o tamanho da palavra para contar invertido.
        }
        for (int i = 0; i < palavra.length(); i++) {
            //Verifica se as letras dos dois vetores sao sempre iguais.
            //Caso pelo menos uma for diferente significa que a palavra não é palindromo.
            if(letraspalavraNormal[i] != letraspalavrainvertida[i]) {
                épalindromo = false;
                break;
            }
        }
        if(épalindromo) {
            System.out.println("A palavra " + palavra + " é palindromo");
        }
        else {
            System.out.println("A palavra " + palavra + "não é palindromo");
        }
    }
}
