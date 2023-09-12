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
public class ex_9vetorformadiferente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] valores = {15, 5, 675, 134, 78};
        
        boolean encontrado = false;
        
        System.out.println("Lista");
        for(int i = 0; i < valores.length; i++) {
            System.out.println(i + " | " + valores[i]);
        }
        System.out.println("Qual valor deseja encontrar no vetor?");
        int valorBusca = scanner.nextInt();
        
        for(int i = 0; i < valores.length; i++) {
            if(valores[i] == valorBusca) {
                encontrado = true;
                System.out.println("O valor " + valorBusca + " está na lista, na posição " + i);
                break;
            }
        }
        if(!encontrado) {
            System.out.println("O valor " + valorBusca + " não está na lista");
        }
    }
    
}
