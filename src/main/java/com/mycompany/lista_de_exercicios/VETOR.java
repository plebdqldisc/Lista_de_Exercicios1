/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios;
import java.util.ArrayList;
/**
 *
 * @author arthur.7923
 */
public class VETOR {
    public static void main(String args[]) {
        int qtdePosicoes = 5, maior;
        
        int[] vetor = new int [qtdePosicoes];
        
        vetor[0] = 12;
        vetor[1] = 520;
        vetor[2] = 100;
        vetor[3] = 87;
        vetor[4] = 15;
        
        maior = vetor[0];
        for(int cont = 0; cont < vetor.length; cont++) {
           if(vetor[cont] > maior){
               maior = vetor[cont];
           }
          System.out.println("maior valor neste vetor é: " + maior);
       }
    }
}
