/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios;

/**
 *
 * @author arthur.7923
 */
public class contdeCaracter {
    public static void main(String args[]) {
        String nome;
        
        nome = "Arthur Antonio";
        int totalcarac = 0;
        
        
        for(int cont = 0 ; cont < nome.length(); cont++) {
            if(nome.charAt(cont) != ' '){
                totalcarac++;   
            } 
        }
        
        System.out.println(totalcarac);
    }
    
}
