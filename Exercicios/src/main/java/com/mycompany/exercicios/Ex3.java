/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Ex3 {
    List<Integer> lista = new ArrayList<>(); 
    
    public Ex3(){
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
    }
    
    public void imprimirList3(){
    lista.removeIf(numero -> numero % 2 == 0);

    System.out.println("Ex3: " + lista);
    }
}

