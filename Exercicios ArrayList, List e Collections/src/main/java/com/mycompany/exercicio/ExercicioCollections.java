/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author victor.ramos1
 */
public class ExercicioCollections {
     ArrayList<String> nomes = new ArrayList<>();
     
     public ExercicioCollections(){
     nomes.add("Klebisson");
     nomes.add("Juriscleide");
     nomes.add("Jucimara");
     nomes.add("Omar");
     nomes.add("Lucilda");
     nomes.add("Anaide");
     Collections.sort(nomes); // Organiza os elementos em ordem alfabética 
     }
     
     public void ImprimirExercicioCollections(){
         System.out.println("\nExemplo Colleciton:\n"+nomes);
     }
}
/*
Collections é uma classe utilitária no Java que oferece uma série
de métodos e algoritmos que permite a manipulação de coleções, fazendo
assim ser possivel fazer ordenações, filtragem e buscas de uma forma 
prática. Organizei como exemplo, nomes presente em um ArrayList em 
ordem alfabética, utilizando Collections.sort()
 */

