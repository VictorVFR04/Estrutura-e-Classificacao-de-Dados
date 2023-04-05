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
public class Ex1 {
   List<String> lista = new ArrayList<>();
    
    public Ex1(){
        lista.add("Elemento1"); 
        lista.add("Elemento2");
        lista.add("Elemento3");    
        lista.add("Elemento4"); 
        lista.add("Elemento5");
        lista.add("Elemento6");
    }
    
    public void imprimirList1(){
        System.out.println("Ex1"+lista);
    }    
}

