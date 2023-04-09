/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor.ramos1
 */
public class ExerciciosList {
    List<String> lista = new ArrayList<>(); //Criando a List
    
    public ExerciciosList(){
        lista.add("Elemento1"); //Adicionando elementos a List
        lista.add("Elemento2");
        lista.add("Elemento3");        
    }
    
    public void imprimirList(){
        System.out.print("\nExemplo List:\n"+lista);
    }    
}
/*
List é uma interface que possibilita a criação de uma coleção de 
elementos ordenados, podendo aceitar elementos de qualquer tipo e 
duplicados, sendo um framework de coleções do Java, é implementada 
por outra classes, como: ArrayList, Vector e LinkedList. Como Exemplo, 
criei uma list string com o implemento de um ArrayList e atribui 3 elementos. 
*/
