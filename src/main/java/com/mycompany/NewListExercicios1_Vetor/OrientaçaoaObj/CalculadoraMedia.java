/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor.OrientaçaoaObj;

/**
 *
 * @author arthur.7923
 */
public class CalculadoraMedia{
    // Classe base para a Calculadora
    
    
    float MeArSi = mediaSimples(0, 0);
    float MeArPo = mediaPonderada(0, 0, 0, 0);

    // Método para calcular a média simples
    public float mediaSimples(float a, float b) {
        return (a + b) / 2;
    }

    // Método para calcular a média ponderada ("a e b" são nums [a = num1, b = num2]. Os "A e B" são os pesos [ps1 = peso1, B = peso2]
    public float mediaPonderada(float a, float ps1, float b, float ps2) {
        return (a * ps1 + b * ps2) / (ps1 + ps2);
    }
}

