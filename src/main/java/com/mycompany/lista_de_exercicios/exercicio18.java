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
public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ano;
        int mes;
        
        
        int um = 31;
        int dois = 28;
        int tres = 31;
        int quatro = 30;
        int cinco = 31;
        int seis = 30;
        int sete = 31;
        int oito = 31;
        int nove = 30;
        int dez = 31;
        int onze = 30;
        int doze = 31;
        
        System.out.println("insira o ano ai");
        ano = scanner.nextInt();
        
        System.out.println("insira o mes aí como numero escrito, ex: 1 = janeiro, 2 = fevereiro.");
        mes = scanner.nextInt();
        
        if (mes == 1){
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + um + " dias ");
        }
        else if (mes == 2) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + dois + " dias ");
        }
        else if (mes == 3) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + tres + " dias ");
        }
        else if (mes == 4) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + quatro + " dias ");
        }
        else if (mes == 5) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + cinco + " dias ");
        }
        else if (mes == 6) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + seis + " dias ");
        }
        else if (mes == 7) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + sete + " dias ");
        }
        else if (mes == 8) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + oito + " dias ");
            
        }
        else if (mes == 9) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + nove + " dias ");
            
        }
        else if (mes == 10) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + dez + " dias ");
        }
        else if (mes == 11) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + onze + " dias ");
        }
        else if (mes == 12) {
            System.out.println(" No ano de " + ano + " no mes " + mes + " tem " + doze + " dias ");
        }
    }
}
