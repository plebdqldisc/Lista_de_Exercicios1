/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor.OrientaçaoaObj;

/**
 *
 * @author arthur.7923
 */
public class Calculadora {
    public float resultado;

    
    
    public float getresultado() {
        return resultado;
    }
    
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    public float somar(float a, float b) {
        //setResultado (a + b);
        return a + b;
    }
    public float subtrair(float a, float b) {
        //setResultado (a - b);
        return a - b;
    }
    public float multiplicar(float a, float b) {
        //setResultado (a * b);
        return a * b;
    }
    public float dividir(float a, float b) {
     if(b > 0)
         //setResultado (a / b);
         return a / b;
     else {
         System.out.println("erro: divisão por zero!");
         //setResultado(Float.Nan);
         return Float.NaN;
     }
     
     
    }
}
