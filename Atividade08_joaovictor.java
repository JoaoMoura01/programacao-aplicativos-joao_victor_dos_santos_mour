/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade08_joaovictor;

/**
 *
 * @author Aluno
 */
public class Atividade08_joaovictor {
//// Atividade01:
//    public static double calcularDelta(double a, double b, double c) {
//        return b * b - 4 * a * c;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Dada a equação de 2º grau ax² + bx + c = 0");
//        System.out.print("Digite A: ");
//        double a = sc.nextDouble();
//        System.out.print("Digite B: ");
//        double b = sc.nextDouble();
//        System.out.print("Digite C: ");
//        double c = sc.nextDouble();
//
//        double delta = calcularDelta(a, b, c);
//        System.out.println("Delta = " + delta);
//
//        if (delta >= 0) {
//            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
//            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
//            System.out.println("x1 = " + x1 + " | x2 = " + x2);
//        } else {
//            System.out.println("Não há raízes reais!");
//        }
//    }
////Atividade02:
// public static int soma(int a, int b) { return a + b; }
//    public static int subtracao(int a, int b) { return a - b; }
//    public static int multiplicacao(int a, int b) { return a * b; }
//    public static double divisao(int a, int b) { return (double)a / b; }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("=== Menu ===");
//        System.out.println("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão");
//        System.out.print("Escolha: ");
//        int opcao = sc.nextInt();
//
//        System.out.print("Digite o primeiro número: ");
//        int n1 = sc.nextInt();
//        System.out.print("Digite o segundo número: ");
//        int n2 = sc.nextInt();
//
//        double resultado = 0;
//
//        switch(opcao) {
//            case 1: resultado = soma(n1, n2); break;
//            case 2: resultado = subtracao(n1, n2); break;
//            case 3: resultado = multiplicacao(n1, n2); break;
//            case 4: resultado = divisao(n1, n2); break;
//            default: System.out.println("Opção inválida!"); return;
//        }
//
//        System.out.println("Resultado = " + resultado);
//    }
//// Atividade 03: 
// public static int soma(int a, int b) { return a + b; }
//    public static int subtracao(int a, int b) { return a - b; }
//    public static int multiplicacao(int a, int b) { return a * b; }
//    public static double divisao(int a, int b) { return (double)a / b; }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("=== Menu ===");
//        System.out.println("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão");
//        System.out.print("Escolha: ");
//        int opcao = sc.nextInt();
//
//        System.out.print("Digite o primeiro número: ");
//        int n1 = sc.nextInt();
//        System.out.print("Digite o segundo número: ");
//        int n2 = sc.nextInt();
//
//        double resultado = 0;
//
//        switch(opcao) {
//            case 1: resultado = soma(n1, n2); break;
//            case 2: resultado = subtracao(n1, n2); break;
//            case 3: resultado = multiplicacao(n1, n2); break;
//            case 4: resultado = divisao(n1, n2); break;
//            default: System.out.println("Opção inválida!"); return;
//        }
//
//        System.out.println("Resultado = " + resultado);
//    }
//// b:
// String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
//                          "Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
//        if (mes < 1 || mes > 12) return "Mês inválido";
//        return meses[mes - 1];
//    }
//// atividade04:
// public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Quantos funcionários? ");
//        int n = sc.nextInt();
//        double[] salarios = new double[n];
//
//        double soma = 0;
//        for (int i = 0; i < n; i++) {
//            System.out.print("Salário do funcionário " + (i+1) + ": ");
//            salarios[i] = sc.nextDouble();
//            soma += salarios[i];
//        }
//
//        double media = soma / n;
//        int acima = 0;
//        for (double s : salarios)
//            if (s > media) acima++;
//
//        System.out.println("Média salarial: " + media);
//        System.out.println(acima + " funcionários ganham acima da média.");
//    }
////atividade05:
//  public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double[] pesos = new double[10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Peso " + (i+1) + ": ");
//            pesos[i] = sc.nextDouble();
//        }
//
//        int pos = 0;
//        for (int i = 1; i < 10; i++)
//            if (pesos[i] < pesos[pos]) pos = i;
//
//        System.out.println("Menor peso está na posição: " + pos);
//    }
////atividade06:
//  public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite N: ");
//        int n = sc.nextInt();
//
//        int a = 0, b = 1;
//        System.out.print("Sequência: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " ");
//            int temp = a + b;
//            a = b;
//            b = temp;
//        }
//    }
////atividade07:
//public static int buscarNome(String[] nomes, String nome) {
//        for (int i = 0; i < nomes.length; i++) {
//            if (nomes[i].equalsIgnoreCase(nome))
//                return i;
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] nomes = new String[10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Nome " + (i+1) + ": ");
//            nomes[i] = sc.nextLine();
//        }
//
//        System.out.print("Digite um nome para buscar: ");
//        String busca = sc.nextLine();
//
//        int pos = buscarNome(nomes, busca);
//        if (pos == -1)
//            System.out.println("Nome não encontrado!");
//        else
//            System.out.println("Nome encontrado na posição " + pos);
//    }
////Atividade08
// String nome_pet;
//    String raca;
//    int idade;
//    String nome_dono;
//    String contato_dono;
//
//    public Cachorro(String nome_pet, String raca, int idade, String nome_dono, String contato_dono) {
//        this.nome_pet = nome_pet;
//        this.raca = raca;
//        this.idade = idade;
//        this.nome_dono = nome_dono;
//        this.contato_dono = contato_dono;
//    }
//
//    public void exibir_dados() {
//        System.out.println("Nome do Pet: " + nome_pet);
//        System.out.println("Raça: " + raca);
//        System.out.println("Idade: " + idade + " anos");
//        System.out.println("Dono: " + nome_dono);
//        System.out.println("Contato: " + contato_dono);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("=== Cadastro Pet Shop Amigo Fiel ===");
//        System.out.print("Nome do pet: ");
//        String nome = sc.nextLine();
//        System.out.print("Raça: ");
//        String raca = sc.nextLine();
//        System.out.print("Idade: ");
//        int idade = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Nome do dono: ");
//        String dono = sc.nextLine();
//        System.out.print("Contato: ");
//        String contato = sc.nextLine();
//
//        Cachorro c = new Cachorro(nome, raca, idade, dono, contato);
//
//        System.out.println("=== Menu de Serviços ===");
//        System.out.println("1. Banho\n2. Tosa\n3. Banho e Tosa\n4. Consulta Veterinária");
//        System.out.print("Escolha: ");
//        int serv = sc.nextInt();
//
//        String servico = switch (serv) {
//            case 1 -> "Banho";
//            case 2 -> "Tosa";
//            case 3 -> "Banho e Tosa";
//            case 4 -> "Consulta Veterinária";
//            default -> "Serviço inválido";
//        };
//
//        System.out.println("\n=======================================");
//        System.out.println("   FICHA DE ATENDIMENTO - AMIGO FIEL");
//        System.out.println("=======================================");
//        c.exibir_dados();
//        System.out.println("---------------------------------------");
//        System.out.println("Procedimento: " + servico);
//
//    }
//// Atividade09:
//   String matricula;
//    String nome;
//    double nota1, nota2, trabalho;
//
//    public Aluno(String matricula, String nome, double nota1, double nota2, double trabalho) {
//        this.matricula = matricula;
//        this.nome = nome;
//        this.nota1 = nota1;
//        this.nota2 = nota2;
//        this.trabalho = trabalho;
//    }
//
//    public double media() {
//        return (nota1 * 2.5 + nota2 * 2.5 + trabalho * 2) / 7;
//    }
//
//    public double finalNecessaria() {
//        double m = media();
//        if (m >= 7) return 0;
//        return 10 - m; // quanto falta para 10
//    }
////Atividade10:
// public char respostaQuestao(int numeroQuestao) {
//        char[] respostas = {'A','C','B','D','A','B','C','E','A','D','C','A','E','B','D'};
//        return respostas[numeroQuestao - 1];
//    }
//}
//
//public class Prova {
//    private Gabarito gabarito;
//    private char[] respostasAluno = new char[15];
//    private int contador = 0;
//
//    public Prova(Gabarito gabarito) {
//        this.gabarito = gabarito;
//    }
//
//    public void respostaAluno(char resposta) {
//        if (contador < 15) respostasAluno[contador++] = resposta;
//    }
//
//    public int acertos() {
//        int acertos = 0;
//        for (int i = 0; i < 15; i++)
//            if (respostasAluno[i] == gabarito.respostaQuestao(i + 1))
//                acertos++;
//        return acertos;
//    }
//
//    public double nota() {
//        double nota = 0;
//        for (int i = 0; i < 15; i++) {
//            if (respostasAluno[i] == gabarito.respostaQuestao(i + 1))
//                nota += (i < 10 ? 0.5 : 1.0);
//        }
//        return nota;
//    }
//
//    public double maior(Prova outra) {
//        int acertos1 = this.acertos();
//        int acertos2 = outra.acertos();
//
//        if (acertos1 > acertos2) return this.nota();
//        else if (acertos2 > acertos1) return outra.nota();
//        else return Math.max(this.nota(), outra.nota());
//    }
//}
//}