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
public class ex_4vetor {
    public static void main(String args[]) {

        int[] tamanho = {132,233,32,43,600};
        
        System.out.println("Vetor original:");
        System.out.println(tamanho[0]);
        System.out.println(tamanho[1]);
        System.out.println(tamanho[2]);
        System.out.println(tamanho[3]);
        System.out.println(tamanho[4]);
        
       //tambem serve tamanho.length no lugar do 5
        for(int i = 5 - 1;i >= 0; i--) {
        
            System.out.println("Vetor INVERTIDO:");
            System.out.println(tamanho[i]);
        }
    }
}
