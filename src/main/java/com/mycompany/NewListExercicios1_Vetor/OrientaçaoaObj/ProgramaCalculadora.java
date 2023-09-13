/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.NewListExercicios1_Vetor.OrientaçaoaObj;
import java.util.Scanner;
/**
 *
 * @author arthur.7923
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadoracientifica cc = new calculadoracientifica();
        
        Scanner scanner = new Scanner (System.in);
        
        float soma, sub, mult, div, num1, num2;
        
        System.out.println("Informe o primeiro numero: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo numero: ");
        num2 = scanner.nextFloat();

        soma = cc.somar(num1,num2);
        sub = cc.subtrair(num1, num2);
        mult = cc.multiplicar(num1, num2);
        div = cc.dividir(num1, num2);

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Agora, informe um numero para saber a raiz quadrada");
        
        Double numRq = scanner.nextDouble();
        Double rq = cc.raizQuadrada(numRq);
        
        System.out.println("Raiz quadrada de " + numRq + " é: " + rq );
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Informe um numero: ");
        Double num = scanner.nextDouble();
        
        System.out.println("Informe uma potência: ");
        
        Double numPot = scanner.nextDouble();
        Double pow = cc.potencia(num, numPot);
        
        System.out.println(num + " elevado a " + numPot + " é: " + pow);
        
    }
}
