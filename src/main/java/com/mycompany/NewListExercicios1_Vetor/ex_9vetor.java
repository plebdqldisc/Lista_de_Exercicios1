/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor;
//busca do elemento em lista
/**
 *
 * @author Usuario
 */
public class ex_9vetor {
    public static void main(String[] args) {
        int[] elementos = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
        int SEMVERGONHA = 100;
        
        int posicao = -1; // (indica que o elemento não foi encontrado)
        
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == SEMVERGONHA) {
                posicao = i; // Atualiza a posição se for encontrado
                break; // Termina o loop
            }
        }
        
        if (posicao != -1) {
            System.out.println("O elemento " + SEMVERGONHA + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O elemento " + SEMVERGONHA + " não foi encontrado na lista.");
        }
    }
}