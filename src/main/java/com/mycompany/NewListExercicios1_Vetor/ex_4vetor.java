/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor;

/**
 *
 * @author arthur.7923
 */
public class ex_4vetor {
    public static void main(String args[]) {

        int[] tamanho = {132,233,32,43,600};

        
        

        
        System.out.println("Vetor original:");
        System.out.println(tamanho[0]);
        System.out.println(tamanho[1]);
        System.out.println(tamanho[2]);
        System.out.println(tamanho[3]);
        System.out.println(tamanho[4]);
        

       //começa no 4 e vai diminuindo de 1 em 1 até chegar no zero com ajuda do i--
        for(int i = 4;i >= 0; i--) {

       //tambem serve tamanho.length no lugar do 5
        //for(int i = 5 - 1;i >= 0; i--) {

        
            System.out.println("Vetor INVERTIDO:");
            System.out.println(tamanho[i]);
        }
    }
}