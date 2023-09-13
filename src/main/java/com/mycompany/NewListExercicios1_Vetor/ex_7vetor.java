/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.NewListExercicios1_Vetor;

/**
 *
 * @author arthur.7923
=======
package exerciciosdevetor;
//listas mescladas
/**
 *
 * @author Usuario
>>>>>>> 55a2514938aeb3fc6e8dfa3886d5dc4b1b50f637
 */
public class ex_7vetor {
    public static void main (String[] args) {
        
        int [] lista1 = {0, 5, 10, 15, 20};
        int [] lista2 = {0, 2, 4, 6, 8};
        
        int tamanholista1 = 5; //ou lista1.length;
        int tamanholista2 = 5; //ou lista2.length;
        int tamanholistatotal = tamanholista1 + tamanholista2;
        
        int[] ListMesc = new int[tamanholistatotal];
        
        for(int i = 0; i < lista1.length; i++) {
            ListMesc[i] = lista1[i];
        }
        for(int i = 0; i < lista2.length; i++) {
            ListMesc[lista1.length + i] = lista2[i];
        }
        
        System.out.println("ListMesc");
        for(int i = 0; i < tamanholistatotal; i++) {
            System.out.println(ListMesc[i]);
        }

    }
}

        
    //}
//}

