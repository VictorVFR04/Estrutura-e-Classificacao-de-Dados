/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio;

import java.util.ArrayList;

/**
 *
 * @author victor.ramos1
 */
public class ExercicioArrayList {       
    ArrayList<String> lista = new ArrayList<>(); // Criando um Arraylist
    
    public ExercicioArrayList(){ 
        lista.add("Elemento1"); // Adicionando elementos ao ArrayList
        lista.add("Elemento2");
        lista.add("Elemento3");             
        }
    
    public void ImprimirArrayList(){
        System.out.println("Exemplo ArrayList:\n"+ lista); 
}
}

/*
ArrayList é uma estrutura de dados que consegue armazenar e manipular 
elementos, podendo aumentar ou diminuir o tamanho caso necessario, ou 
seja, ao contrário do Array que possui um tamanho fixo, o ArrayList é 
dinamico. Sendo essa a sua principal vantagem, sua utilização é bastante
útil em casos que é necessário versátilidade, por exemplo em situações 
que precisa armazenar uma coleção de elementos dinamicamente. Criei como
exemplo uma lista string e adicionei 3 elementos.
*/

