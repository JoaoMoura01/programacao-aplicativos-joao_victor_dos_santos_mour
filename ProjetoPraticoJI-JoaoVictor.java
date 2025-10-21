package com.mycompany.projetopratico.ji;

import java.util.Scanner;

public class ProjetoPraticoJI {

    // ======== CLASSE VEICULO ========
    public static class Veiculo {
        private String placa;
        private int codigo;
        private int horaEntrada;
        private int minutoEntrada;
        private String condutor;
        private String marca;
        private String modelo;
        private String cor;
        private int tipo;

        public Veiculo(String placa, int codigo, int horaEntrada, int minutoEntrada,
                       String condutor, String marca, String modelo, String cor, int tipo) {
            this.placa = placa;
            this.codigo = codigo;
            this.horaEntrada = horaEntrada;
            this.minutoEntrada = minutoEntrada;
            this.condutor = condutor;
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
            this.tipo = tipo;
        }

        public String getPlaca() {
            return placa;
        }

        public int getCodigo() {
            return codigo;
        }

        public int getHoraEntrada() {
            return horaEntrada;
        }

        public int getMinutoEntrada() {
            return minutoEntrada;
        }

        public String getCondutor() {
            return condutor;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public String getCor() {
            return cor;
        }

        public int getTipo() {
            return tipo;
        }
    }

    // ======== CLASSE CALCULADORA TARIFA ========
    public static class CalculadoraTarifa {

        public double calcularTarifa(int minutos, int tipo) {
            double valor = 0;

            if (tipo == 1) { // Carros
                if (minutos <= 15) {
                    valor = 6.00;
                } else if (minutos <= 30) {
                    valor = 17.00;
                } else if (minutos <= 60) {
                    valor = 20.00;
                } else {
                    valor = 20.00 + (minutos - 60) * 1.35;
                }

            } else if (tipo == 2) { // Motos
                if (minutos <= 15) {
                    valor = 3.00;
                } else if (minutos <= 30) {
                    valor = 7.00;
                } else if (minutos <= 60) {
                    valor = 10.00;
                } else {
                    valor = 10.00 + (minutos - 60) * 1.00;
                }

            } else if (tipo == 3) { // Caminhões
                if (minutos <= 15) {
                    valor = 16.00;
                } else if (minutos <= 30) {
                    valor = 27.00;
                } else if (minutos <= 60) {
                    valor = 30.00;
                } else {
                    valor = 30.00 + (minutos - 60) * 2.35;
                }
            }
            return valor;
        }
    }

    // ======== CLASSE PAGAMENTO ========
    public static class Pagamento {
        int codigoVeiculo;
        double valorPago;
        int formaPagamento;

        public Pagamento(int codigoVeiculo, double valorPago, int formaPagamento) {
            this.codigoVeiculo = codigoVeiculo;
            this.valorPago = valorPago;
            this.formaPagamento = formaPagamento;
        }
    }

    // ======== VARIÁVEIS GLOBAIS ========
    private static final int TOTAL_VAGAS = 10;
    private static final int[] tiposVagas = {2, 2, 2, 3, 3, 1, 1, 1, 1, 1};
    private static Veiculo[] vagas = new Veiculo[TOTAL_VAGAS];
    private static Pagamento[] historicoPagamento = new Pagamento[100];
    private static int historicoIndex = 0;
    private static int proximoCodigo = 1;
    private static CalculadoraTarifa calc = new CalculadoraTarifa();

    // ======== MAIN ========
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU INICIAL DO ESTACIONAMENTO");
            System.out.println("1 - REGISTRAR VEÍCULO");
            System.out.println("2 - FINALIZAR O USO DO VEÍCULO NA VAGA");
            System.out.println("3 - CONSULTAR DISPONIBILIDADE DE VAGAS");
            System.out.println("4 - CONSULTAR SALDO E HISTÓRICO DE PAGAMENTOS");
            System.out.println("0 - SAIR");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");

            opcao = lerInteiroValido(scanner);

            switch (opcao) {
                case 1 -> registrarVeiculo(scanner);
                case 2 -> finalizarUso(scanner);
                case 3 -> consultarVagas();
                case 4 -> consultarHistorico();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // ======== MÉTODOS AUXILIARES ========
    private static int lerInteiroValido(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite apenas números.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static Veiculo buscarVeiculoPorCodigo(int codigo) {
        for (Veiculo v : vagas) {
            if (v != null && v.getCodigo() == codigo) {
                return v;
            }
        }
        return null;
    }

    private static int alocarVaga(int tipo) {
        for (int i = 0; i < TOTAL_VAGAS; i++) {
            if (tiposVagas[i] == tipo && vagas[i] == null) {
                return i;
            }
        }
        return -1;
    }

    // ======== FUNÇÕES DO MENU ========
    private static void registrarVeiculo(Scanner scanner) {
        System.out.print("Digite o tipo do veículo (1-Carro, 2-Moto, 3-Caminhão): ");
        int tipo = lerInteiroValido(scanner);

        int vaga = alocarVaga(tipo);
        if (vaga == -1) {
            System.out.println("Não há vagas disponíveis para este tipo de veículo.");
            return;
        }

        System.out.print("Placa: ");
        String placa = scanner.next();

        System.out.print("Nome do condutor: ");
        String condutor = scanner.next();

        System.out.print("Marca: ");
        String marca = scanner.next();

        System.out.print("Modelo: ");
        String modelo = scanner.next();

        System.out.print("Cor: ");
        String cor = scanner.next();

        System.out.print("Hora de entrada (0-23): ");
        int horaEntrada = lerInteiroValido(scanner);

        System.out.print("Minuto de entrada (0-59): ");
        int minutoEntrada = lerInteiroValido(scanner);

        Veiculo v = new Veiculo(placa, proximoCodigo++, horaEntrada, minutoEntrada, condutor, marca, modelo, cor, tipo);
        vagas[vaga] = v;

        System.out.println("Veículo registrado com sucesso na vaga " + (vaga + 1));
        System.out.println("Código do veículo: " + v.getCodigo());
    }

    private static void finalizarUso(Scanner scanner) {
        boolean temVeiculo = false;
        for (int i = 0; i < TOTAL_VAGAS; i++) {
            if (vagas[i] != null) {
                System.out.printf("Código: %d | Placa: %s | Vaga: %d%n",
                        vagas[i].getCodigo(), vagas[i].getPlaca(), i + 1);
                temVeiculo = true;
            }
        }

        if (!temVeiculo) {
            System.out.println("Não há veículos estacionados.");
            return;
        }

        System.out.print("Digite o código do veículo: ");
        int codigo = lerInteiroValido(scanner);
        Veiculo v = buscarVeiculoPorCodigo(codigo);

        if (v == null) {
            System.out.println("Código não encontrado.");
            return;
        }

        System.out.print("Hora de saída (0-23): ");
        int horaSaida = lerInteiroValido(scanner);

        System.out.print("Minuto de saída (0-59): ");
        int minutoSaida = lerInteiroValido(scanner);

        int minutosEntrada = v.getHoraEntrada() * 60 + v.getMinutoEntrada();
        int minutosSaida = horaSaida * 60 + minutoSaida;

        if (minutosSaida < minutosEntrada) {
            System.out.println("Hora de saída não pode ser menor que a de entrada.");
            return;
        }

        int minutos = minutosSaida - minutosEntrada;
        double valor = calc.calcularTarifa(minutos, v.getTipo());

        System.out.printf("Tempo total: %d minutos%n", minutos);
        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

        System.out.print("Forma de pagamento (1-Dinheiro, 2-PIX, 3-Cartão): ");
        int forma = lerInteiroValido(scanner);

        historicoPagamento[historicoIndex++] = new Pagamento(v.getCodigo(), valor, forma);

        // Liberar vaga
        for (int i = 0; i < TOTAL_VAGAS; i++) {
            if (vagas[i] != null && vagas[i].getCodigo() == v.getCodigo()) {
                vagas[i] = null;
                break;
            }
        }

        System.out.println("Uso finalizado e vaga liberada!");
    }

    private static void consultarVagas() {
        int livres = 0, ocupadas = 0;

        for (int i = 0; i < TOTAL_VAGAS; i++) {
            if (vagas[i] == null) {
                System.out.printf("Vaga %d (Tipo: %d) - LIVRE%n", i + 1, tiposVagas[i]);
                livres++;
            } else {
                System.out.printf("Vaga %d (Tipo: %d) - OCUPADA (%s)%n",
                        i + 1, tiposVagas[i], vagas[i].getPlaca());
                ocupadas++;
            }
        }

        System.out.printf("Total ocupadas: %d | Total livres: %d%n", ocupadas, livres);
    }

    private static void consultarHistorico() {
        double total = 0;
        System.out.println("\nHISTÓRICO DE PAGAMENTOS:");
        for (int i = 0; i < historicoIndex; i++) {
            Pagamento p = historicoPagamento[i];
            System.out.printf("Código: %d | Valor: R$ %.2f | Forma: %d%n",
                    p.codigoVeiculo, p.valorPago, p.formaPagamento);
            total += p.valorPago;
        }
        System.out.printf("SALDO TOTAL ARRECADADO: R$ %.2f%n", total);
    }
}
