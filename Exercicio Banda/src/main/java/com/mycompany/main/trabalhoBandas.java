/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Victor Fagundes Ramos; RA:00239823
 */
public class trabalhoBandas {
    ArrayList<String> bandas = new ArrayList<>();
    Scanner ler = new Scanner(System.in);
    
    public void adcionarBanda(){
        System.out.println("Insira uma banda: ");
        String banda = ler.next();
        bandas.add(banda);
    }
    
    public void excluirBanda(){
        System.out.println("Insira o índice que deseja excluir: ");
        int excluir = ler.nextInt();
        if (excluir >= 0 && excluir < bandas.size()){
            bandas.remove(excluir);
        }else{
            System.out.println("Não existe esse índice!");
        }
    }
        
    public void mostrarLista(){
        System.out.println("Bandas cadastradas: ");
        for (int i = 0; i < bandas.size(); i++){
            System.out.println(i + " - " + bandas.get(i));
          }
    } 
    
    public void novaBanda(){
        System.out.println("Insira uma nova banda: ");
        String novaBanda = ler.next();
        bandas.add(novaBanda);        
    }
    
    public void apagarBandas(){
        bandas.clear();
        System.out.println("Bandas exlcuidas com sucesso!");
    }
    
    public void inverterBanda(){
        System.out.println("Insira o índice da banda que deeja mudar de lugar: ");
        int banda1 = ler.nextInt();
        System.out.println("Insira o indice da banda que vai mudar de lugar com a outra: ");
        int banda2 = ler.nextInt();
        if (banda1 >= 0 && banda2 >=0 && banda1 < bandas.size() && banda2 < bandas.size()){
            String invertendo = bandas.get(banda1);
            bandas.set(banda1, bandas.get(banda2));
            bandas.set(banda2, invertendo);
            System.out.println("Invertidas com sucesso!");           
        }else{
            System.out.println("Não existe esse indice!");
        }
    }     
    }

