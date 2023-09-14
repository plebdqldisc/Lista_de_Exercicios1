/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor.OrientaçaoaObj;

/**
 *
 * @author arthur.7923
 */
public class CalculadoraMedia {
    // Classe base para a Calculadora

    // Método para calcular a média simples
    public float mediaSimples(float digit1, float digit2) {
        return (digit1 + digit2) / 2;
    }

    // Método para calcular a média ponderada (Os digit sao nums: digit1 = num1, digit2 = num2)
    public float mediaPonderada(float digit1, float peso1, float digit2, float peso2) {
        return (digit1 * peso1 + digit2 * peso2) / (peso1 + peso2);
    }
}
