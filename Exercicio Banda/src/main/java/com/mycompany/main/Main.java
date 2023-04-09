/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Victor Fagundes Ramos; RA:00239823
 */
public class Main {
    public static void main(String[] args) {
        trabalhoBandas TrabalhoBandas = new trabalhoBandas();
        
        while (true){

        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma das opções!");
        System.out.println("-------------------------------------------------");
        System.out.println("1 - Adicionar bandas");
        System.out.println("2 - Excluir um elemento qualquer da lista por seu índice ");
        System.out.println("3 - Mostrar Lista");
        System.out.println("4 - Fazer uma nova inclusão");
        System.out.println("5 - Excluir todos os elementos da lista");
        System.out.println("6 - Trocar uma banda de local(índice)");
        System.out.println("0 - Sair");
        System.out.println("-------------------------------------------------");
        int opcao = ler.nextInt();
        
        switch (opcao) {
            case 1: 
                System.out.println("Você escolheu Adicionar Bandas");
                TrabalhoBandas.adcionarBanda();
                break;
            case 2:
                System.out.println("Você escolheu Excluir um elemento qualquer da lista por seu índice");
                TrabalhoBandas.excluirBanda();
                break;
            case 3:
                System.out.println("Você escolheu Mostrar Lista");
                TrabalhoBandas.mostrarLista();
                break;
            case 4:
                System.out.println("Você escolheu Fazer uma nova inclusão");
                TrabalhoBandas.novaBanda();
                break;
            case 5:
                System.out.println("Você escolheu Excluir todos os elementos da lista");
                TrabalhoBandas.apagarBandas();
                break;
            case 6:
                System.out.println("Você escolheu Trocar uma banda de local(índice)");
                TrabalhoBandas.inverterBanda();
                break;
            case 0:
                System.out.println("Você escolheu sair!");
                System.exit(0);
            default:
                System.out.println("Não existe essa opção!");
        }
        }
    }
}
