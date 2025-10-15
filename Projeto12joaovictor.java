/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto1.pkg2joaovictor;

   import java.util.Scanner;
   import java.util.Random;
/**
 *
 * @author Aluno
 */
public class Projeto12joaovictor {

    /*** @param args the command line arguments
     */
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    package com.mycompany.Projeto12joaovictor;


    
  
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        ContaBancaria conta = new ContaBancaria(100.00, 0.00);
        ServicoCambio cambio = new ServicoCambio(5.32);
        ExtratoBancario extrato = new ExtratoBancario(10);
        SimuladorEmprestimo simulador = new SimuladorEmprestimo();

        int opcao = 1;

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
                    System.out.printf("Saldo em reais: R$ %.2f%n", conta.saldoReais);
                    System.out.printf("Saldo em dólares: US$ %.2f%n", conta.saldoDolares);
                    opcao = retornoMenu(entrada);
                    break;

                case 2:
                    System.out.print("Informe o valor do depósito (R$): ");
                    double dep = entrada.nextDouble();
                    entrada.nextLine();

                    if (dep < 0.00 || dep > 5000.00) {
                        System.out.println("!!! Valor inválido !!!");
                    } else {
                        conta.depositar(dep);
                        extrato.registrar(new Movimentacao("Depósito (+)", dep));
                        System.out.printf("Depósito realizado com sucesso!\nNovo saldo: R$ %.2f%n", conta.saldoReais);
                    }
                    opcao = retornoMenu(entrada);
                    break;

                case 3:
                    System.out.println("Últimas movimentações:");
                    if (extrato.vazio()) {
                        System.out.println("Nenhuma movimentação registrada.");
                    } else {
                        extrato.imprimir();
                    }
                    opcao = retornoMenu(entrada);
                    break;

                case 4:
                    System.out.print("Informe o valor desejado (mínimo R$200,00 e máximo R$100.000,00): ");
                    double valorDesejado = entrada.nextDouble();
                    entrada.nextLine();

                    if (valorDesejado < 200 || valorDesejado > 100000) {
                        System.out.println("Valor inválido para empréstimo.");
                        break;
                    }

                    System.out.print("Informe seu salário bruto: R$ ");
                    double salarioBruto = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.print("Informe a quantidade de parcelas (6,12,18,24,30,36,40,48,56,60 ou 72): ");
                    int parcelas = entrada.nextInt();
                    entrada.nextLine();

                    if (!simulador.parcelaValida(parcelas)) {
                        System.out.println("Quantidade de parcelas inválida.");
                        break;
                    }

                    double totalComJuros = simulador.totalComJuros(valorDesejado, parcelas);
                    double valorParcela = simulador.parcelaFinal(valorDesejado, parcelas);
                    double limiteParcela = salarioBruto * 0.3;

                    System.out.printf("Valor solicitado: R$ %.2f%n", valorDesejado);
                    System.out.printf("Valor total com juros (2%%): R$ %.2f%n", totalComJuros);
                    System.out.printf("Valor de cada parcela (%d): R$ %.2f%n", parcelas, valorParcela);

                    if (valorParcela <= limiteParcela) {
                        int protocolo = gerador.nextInt(90000) + 10000;
                        System.out.println("Empréstimo disponível. Informe o número de protocolo EM" + protocolo);
                    } else {
                        System.out.println("Empréstimo indisponível!");
                    }
                    opcao = retornoMenu(entrada);
                    break;

                case 5:
                    System.out.printf("Saldo atual: R$ %.2f%n", conta.saldoReais);
                    System.out.print("Informe o valor em R$ que deseja converter: ");
                    double valorReal = entrada.nextDouble();
                    entrada.nextLine();

                    if (valorReal > conta.saldoReais) {
                        System.out.println("Saldo insuficiente para conversão.");
                    } else {
                        double valorConvertido = valorReal / cambio.cotacao;
                        conta.comprarDolar(valorConvertido, valorReal);
                        extrato.registrar(new Movimentacao("Compra de dólar (-R$)", -valorReal));
                        extrato.registrar(new Movimentacao("Depósito em dólar (+US$)", valorConvertido));
                        System.out.printf("Conversão realizada com sucesso! Valor em dólar: US$ %.2f%n", valorConvertido);
                    }
                    opcao = retornoMenu(entrada);
                    break;

                case 0:
                    System.out.println("Programa encerrado. Obrigada!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static int retornoMenu(Scanner entrada) {
        System.out.println("Deseja voltar ao menu inicial(V) ou encerrar o programa(E): ");
        String op1 = entrada.nextLine();
        if (op1.equalsIgnoreCase("V")) {
            return 1;
        } else if (op1.equalsIgnoreCase("E")) {
            System.out.println("Programa encerrado!");
            return 0;
        } else {
            System.out.println("Opção inválida!");
            return 1;
        }
    }
}

// ==================== CLASSES AUXILIARES ====================

class ContaBancaria {
    public double saldoReais;
    public double saldoDolares;

    public ContaBancaria(double saldoReais, double saldoDolares) {
        this.saldoReais = saldoReais;
        this.saldoDolares = saldoDolares;
    }

    public void depositar(double valor) {
        saldoReais += valor;
    }

    public void comprarDolar(double qtdUsd, double custoEmReais) {
        saldoReais -= custoEmReais;
        saldoDolares += qtdUsd;
    }
}

class ServicoCambio {
    public double cotacao;

    public ServicoCambio(double cotacao) {
        this.cotacao = cotacao;
    }

    public double custoEmReais(double qtdUsd) {
        return qtdUsd * cotacao;
    }
}

class Movimentacao {
    public String texto;
    public double valor;

    public Movimentacao(String texto, double valor) {
        this.texto = texto;
        this.valor = valor;
    }

    @Override
    public String toString() {
        if (texto.contains("US$")) {
            return texto + " " + String.format("%.2f", valor);
        } else {
            return texto + " R$ " + String.format("%.2f", valor);
        }
    }
}

class ExtratoBancario {
    private int capacidade;
    private int prox;
    private int count;
    private Movimentacao[] itens;

    public ExtratoBancario(int capacidade) {
        this.capacidade = capacidade;
        this.prox = 0;
        this.count = 0;
        this.itens = new Movimentacao[capacidade];
    }

    public void registrar(Movimentacao m) {
        itens[prox] = m;
        prox = (prox + 1) % capacidade;
        if (count < capacidade) {
            count++;
        }
    }

    public boolean vazio() {
        return count == 0;
    }

    public void imprimir() {
        int idx = (prox - 1 + capacidade) % capacidade;
        for (int i = 0; i < count; i++) {
            System.out.println(itens[idx]);
            idx = (idx - 1 + capacidade) % capacidade;
        }
    }
}

class SimularEmprestimo {
    private double jurosPorParcela = 0.02;
    private int[] permitidas = {6,12,18,24,30,36,40,48,56,60,72};

    public boolean parcelaValida(int p) {
        for (int valor : permitidas) {
            if (valor == p) return true;
        }
        return false;
    }

    public double parcelaFinal(double emprestimo, int qtd) {
        return (emprestimo / qtd) + (emprestimo / qtd * jurosPorParcela);
    }

    public double totalComJuros(double emprestimo, int qtd) {
        return emprestimo * (1 + jurosPorParcela);
    }
}
    }
    
}
