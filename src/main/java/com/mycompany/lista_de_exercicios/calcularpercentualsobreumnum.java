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
public class calcularpercentualsobreumnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int numeronormal;
        int percentual;
        int operacao;
        
        System.out.println("informe o numero que você deseja, para fazermos o percentual");
        numeronormal = scanner.nextInt();
        
        System.out.println("informe a porcentagem agora");
        percentual = scanner.nextInt();
        
        operacao= (numeronormal/ 100) * percentual;
        
        System.out.println("sua operação deu " + operacao);
        
    }
}
