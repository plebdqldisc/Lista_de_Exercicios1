/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor;

/**
 *
 * @author arthur.7923
 */
public class ex_6vetor {
    public static void main(String[] args) {
        
        int[] numero = {3, 6, 9, 12, 15};
        
        System.out.println("impares da lista:");
        for(int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 != 0) {
                System.out.println(numero[i]);
            }
        }
    }
}