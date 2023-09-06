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
public class sistemabasicodevendadeprodutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codProduto, quantidadeProduto;
        float valortotalProd;
        
        float valorprod1 = (float) 300.00;
        float valorprod2 = (float) 250.00;
        float valorprod3 = (float) 120.00;
        float valorprod4 = (float) 79.99;
        float valorprod5 = (float) 175.00;
        
        
        
        String prod1 = "Persona 3 Reload";
        String prod2 = "Red Dead Redemption 2";
        String prod3 = "Star Wars Jedi Fallen Order";
        String prod4 = "Persona 5";
        String prod5 = "Need For Speed Carbon Remake";
        
        
        System.out.println("------------PRODUTOS------------");
        System.out.println("1 | "+ prod1 + " | Valor: R$ 300,00");
        System.out.println("2 | "+ prod2 + " | Valor: R$ 250,00");
        System.out.println("3 | "+ prod3 + " | Valor: R$ 120,00");
        System.out.println("4 | "+ prod4 + " | Valor: R$ 79,00");
        System.out.println("5 | "+ prod5 + " | Valor: R$ 175,00");
        
        System.out.println("----------------ESCOLHA-SEU-PRODUTO----------------");
        System.out.println("Escolha um produto informando o seu codigo");
        codProduto = scanner.nextInt();
        
        if(codProduto == 1) {
            System.out.println("Informe a quantidade desejada para Persona 3 Reload");
            quantidadeProduto = scanner.nextInt();
        } else if (codProduto == 2) {
            System.out.println("Informe a quantidade desejada para Red Dead Redemption 2");
            quantidadeProduto = scanner.nextInt();
        } else if (codProduto == 3) {
            System.out.println("Informe a quantidade desejada para Star Wars Jedi Fallen Order");
            quantidadeProduto = scanner.nextInt();
        } else if (codProduto == 4) {
            System.out.println("Informe a quantidade desejada para Persona 5");
            quantidadeProduto = scanner.nextInt();
        } else if (codProduto == 5) {
            System.out.println("Informe a quantidade desejada para Need For Speed Carbon Remake");
            quantidadeProduto = scanner.nextInt();
        } 
         System.out.println(" Carrinho: ");
         System.out.println("");
        
        
    }
    
}
