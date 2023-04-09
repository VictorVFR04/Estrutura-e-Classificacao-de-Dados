/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author aluno
 */
public class Ex5 {
     List<Integer> lista = new ArrayList<>();
        
    public Ex5(){
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(29);
        lista.add(5);
        lista.add(6);  
        }
    
    
       public void imprimirList5(){
        
        
        int numMaior = Collections.max(lista);
        System.out.println("Ex5: "+numMaior);
    }   
    
}
