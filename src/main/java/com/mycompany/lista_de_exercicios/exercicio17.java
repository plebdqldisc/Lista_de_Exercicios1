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
public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seu peso por favor(kg)");
        float peso = scanner.nextFloat();
        
        
        
        System.out.println("Informe sua altura (metros)");
        float altura = scanner.nextFloat();
        
        float resultado;
        
        
        resultado = peso / (altura * altura);
        
        
        System.out.println("teu imc é " + resultado);
     
    }
}
