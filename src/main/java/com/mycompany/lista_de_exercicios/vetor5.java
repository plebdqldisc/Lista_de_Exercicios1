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
public class vetor5 {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        
        String[] nomes = new String [5];
        
        nomes[0] = "Trico";
        nomes[1] = "Azira";
        nomes[2] = "Safire";
        nomes[3] = "Raprina";
        nomes[4] = "Ayuna";
        
        
        System.out.println("informe o nome");
        String nome = scanner.next();
        boolean naLista;
        
        naLista = false;
        for (int cont = 0; cont < nomes.length; cont++) {
            if(nomes[cont].equals(nome)) {
                naLista = true;
                System.out.println("O nome " + nome + " está na lista! na posição: " + cont );
                break;
            }
            
        } 
        if(!naLista)
                System.out.println(nome+ " tu nao ta lista malandro, some dai pilantra!!");
    }
}
