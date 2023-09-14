/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientaçãoaObj;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadoracientifica cc = new calculadoracientifica();
        CalculadoraMedia CalcM = new CalculadoraMedia();
        
        Scanner scanner = new Scanner (System.in);
        
        float soma, sub, mult, div, num1, num2, digit1, digit2, peso1, peso2;
        int opcao;
        
        int MeArSi;
        int MeArPo;
        
        
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
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Agora informe qual media aritmetica deseja fazer! : ");
        System.out.println("Se você deseja Media Aritmetica Simples - digite: 1 ");
        System.out.println("OU");
        System.out.println("Se você deseja Media Aritmetica Ponderada - digite: 2 ");
        opcao = scanner.nextInt();
        
        if (opcao == 1) {

            System.out.println("Media Simples");
            System.out.println("UM DE DOIS: Digite um numero: ");
            digit1 = scanner.nextFloat();
            System.out.println("DOIS DE DOIS: Digite um numero: ");
            digit2 = scanner.nextFloat();
            
            CalcM.mediaSimples(digit1, digit2);
            
            System.out.println("Sua media de :" + digit1 + " + " + digit2 + " deu a media de " + CalcM.mediaSimples(digit1, digit2) );
            
            System.out.println("Fim da simulação");

        }
        if (opcao == 2) {
            
            System.out.println("Media Ponderada");
            
            System.out.println("UM DE QUATRO: Digite um numero(1): ");
            digit1 = scanner.nextFloat();
            System.out.println("DOIS DE QUATRO: Digite um numero(2): ");
            digit2 = scanner.nextFloat();
            System.out.println("TRÊS DE QUATRO: Digite o peso(1): ");
            peso1 = scanner.nextFloat();
            System.out.println("QUATRO DE QUATRO: Digite o peso(2): ");
            peso2 = scanner.nextFloat();
            
            System.out.println("Sua media de : " + digit1 + " * " + peso1 + " + " + digit2 + " * " + peso2 + " / " + peso1 + " + " + peso2 + " deu a media ponderada de: " + CalcM.mediaPonderada(digit1, peso1, digit2, peso2));
            
            System.out.println("FIM DA SIMULAÇÃO");
        }
    }
}
