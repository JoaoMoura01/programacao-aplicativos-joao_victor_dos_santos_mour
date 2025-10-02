/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1joaovictor;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Projeto1JoaoVictor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Random gerador = new Random();
        int opcao = 1;
        String op1;
        double saldo = 100.00, saldomudado, saldodolar = 0.00, dep, valorDesejado, salarioBruto, totalComJuros, emptotal;
        int parcelas;
        ArrayList<String> extrato = new ArrayList<>();

        while (opcao != 0) {
            System.out.println("\n  MENU     ");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Extrato");
            System.out.println("4 - Simular empréstimo");
            System.out.println("5 - Comprar dólar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo em reais: R$ %.2f%n", saldo);
                    System.out.printf("Saldo em dólares: US$ %.2f%n", saldodolar);
                    System.out.println("Deseja voltar ao menu inicial(V) ou encerrar o programa(E): ");
                    op1= entrada.nextLine();
                    if (op1.equalsIgnoreCase ("V")){
                    break;}
                    else if (op1.equalsIgnoreCase ("E")){
                        System.out.println("Programa encerrado!");
                        return;}
                    else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    System.out.print("Informe o valor do depósito (R$): ");
                    dep = entrada.nextDouble();
                    entrada.nextLine();

                    if (dep < 0.00 || dep > 5000.00) {
                        System.out.println("!!! Valor inválido !!!");
                    } else {
                        saldo += dep;
                        extrato.add("Depósito: +R$ " + String.format("%.2f", dep));
                        System.out.printf("Depósito realizado com sucesso!\n Novo saldo: R$ %.2f%n", saldo);
                    }
                    System.out.println("Deseja voltar ao menu inicial(V) ou encerrar o programa(E): ");
                    op1= entrada.nextLine();
                    if (op1.equalsIgnoreCase ("V")){
                    break;}
                    else if (op1.equalsIgnoreCase ("E")){
                        System.out.println("Programa encerrado!");
                        return;}
                    else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.println("Últimas movimentações:");
                    if (extrato.isEmpty()) {
                        System.out.println("Nenhuma movimentação registrada.");
                    } else {
                        int count = 0;
                        for (int i = extrato.size() - 1; i >= 0 && count < 10; i--, count++) {
                            System.out.println(extrato.get(i));
                        }
                    }
                    System.out.println("Deseja voltar ao menu inicial(V) ou encerrar o programa(E): ");
                    op1= entrada.nextLine();
                    if (op1.equalsIgnoreCase ("V")){
                    break;}
                    else if (op1.equalsIgnoreCase ("E")){
                        System.out.println("Programa encerrado!");
                        return;}
                    else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 4:
                    System.out.print("Informe o valor desejado (mínimo R$200,00 e máximo R$100.000,00): ");
                    valorDesejado = entrada.nextDouble();
                    entrada.nextLine();

                    if (valorDesejado < 200 || valorDesejado > 100000) {
                        System.out.println("Valor inválido para empréstimo.");
                        break;
                    }

                    System.out.print("Informe seu salário bruto: R$ ");
                    salarioBruto = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.print("Informe a quantidade de parcelas (6,12,18,24,30,36,40,48,56,60 ou 72): ");
                    parcelas = entrada.nextInt();
                    entrada.nextLine();

                    int[] opcoesValidas = {6, 12, 18, 24, 30, 36, 40, 48, 56, 60, 72};
                    boolean parcelasValidas = false;

                    for (int p : opcoesValidas) {
                        if (parcelas == p) {
                            parcelasValidas = true;
                            break;
                        }
                    }

                    if (!parcelasValidas) {
                        System.out.println("Quantidade de parcelas inválida.");
                        break;
                    }

                    totalComJuros = valorDesejado * 1.02;
                    double valorParcela = totalComJuros / parcelas;
                    double limiteParcela = salarioBruto * 0.3;

                    System.out.printf("Valor solicitado: R$ %.2f%n", valorDesejado);
                    System.out.printf("Valor total com juros (2%%): R$ %.2f%n", totalComJuros);
                    System.out.printf("Valor de cada parcela (%d ): R$ %.2f%n", parcelas, valorParcela);

                    if (valorParcela <= limiteParcela) {
                        int protocolo = gerador.nextInt(90000) + 10000;
                        System.out.println("Empréstimo disponível. Entre em contato com a central e informe o número de protocolo EM" + protocolo);
                    } else {
                        System.out.println("Empréstimo indisponível!");
                    }
                    System.out.println("Deseja voltar ao menu inicial(V) ou encerrar o programa(E): ");
                    op1= entrada.nextLine();
                    if (op1.equalsIgnoreCase ("V")){
                    break;}
                    else if (op1.equalsIgnoreCase ("E")){
                        System.out.println("Programa encerrado!");
                        return;}
                    else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 5:
                    
                    double cotacao = 5.32;
                    System.out.print("Informe o valor em R$ que deseja converter: ");
                    double valorReal = entrada.nextDouble();
                    entrada.nextLine();

                    if (valorReal > saldo) {
                        System.out.println("Saldo insuficiente para conversão.");
                    } else {
                        double valorConvertido = valorReal / cotacao;
                        saldo -= valorReal;
                        saldodolar += valorConvertido;
                        extrato.add("Compra de dólar: -R$ " + String.format("%.2f", valorReal)+" || +US$ "+valorConvertido);
                        System.out.printf("Conversão realizada com sucesso! Valor em dólar: US$ %.2f%n", valorConvertido);
                    }
                    System.out.println("Deseja voltar ao menu inicial(V) ou encerrar o programa(E): ");
                    op1= entrada.nextLine();
                    if (op1.equalsIgnoreCase ("V")){
                    break;}
                    
                    else if (op1.equalsIgnoreCase ("E")){
                        System.out.println("Programa encerrado!");
                        return;}
                    else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado. Obrigada!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
