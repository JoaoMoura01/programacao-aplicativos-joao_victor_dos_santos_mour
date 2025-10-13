/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade09_joaovictor;

/**
 *
 * @author Aluno
 */
public class Atividade09_joaovictor {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.regex.Pattern; 
//public class Atividade09IsabelaWissess {
//    public static void main(String[] args) {
//        AgendaEletronica agenda = new AgendaEletronica(); 
//
//        try (Scanner entrada = new Scanner(System.in)) {
//            int opcao;
//            do {
//                System.out.println("\n=== AGENDA ELETRÔNICA ===");
//                System.out.println("1) Cadastrar contato");
//                System.out.println("2) Consultar agenda");
//                System.out.println("3) Buscar por nome"); 
//                System.out.println("4) Editar contato");
//                System.out.println("5) Excluir contato");
//                System.out.println("6) Sair");
//                System.out.print("Opção: ");
//                
//                if (entrada.hasNextInt()) {
//                    opcao = entrada.nextInt();
//                } else {
//                    opcao = 0;
//                }
//                entrada.nextLine(); 
//
//                switch (opcao) {
//                    case 1 -> {
//                        System.out.println("\n[CADASTRAR CONTATO]");
//                        System.out.print("Nome: ");
//                        String nome = entrada.nextLine();
//                        System.out.print("Telefone: ");
//                        String telefone = entrada.nextLine();
//                        System.out.print("E-mail: ");
//                        String email = entrada.nextLine();
//                        
//                        try {
//                            Contato novoContato = new Contato(nome, telefone, email);
//                            if (agenda.adicionarContato(novoContato)) {
//                                System.out.println("Contato cadastrado com sucesso!");
//                            }
//                        } catch (IllegalArgumentException e) {
//                            System.out.println(e.getMessage()); 
//                        }
//                    }
//                        
//                    case 2 -> {
//                        System.out.println("\n[CONSULTAR AGENDA]");
//                        agenda.listarContatos();
//                    }
//                        
//                    case 3 -> {
//                        System.out.println("\n[BUSCAR POR NOME]");
//                        System.out.print("Digite o nome para buscar: ");
//                        String nomeBusca = entrada.nextLine();
//                        Contato encontrado = agenda.buscarPorNome(nomeBusca);
//                        if (encontrado != null) {
//                            System.out.println("Contato encontrado:" + encontrado);
//                        } else {
//                            System.out.println("Contato não encontrado.");
//                        }
//                    }
//                        
//                    case 4 -> {
//                        System.out.println("\n[EDITAR CONTATO]");
//                        System.out.print("Digite o telefone do contato a editar: "); 
//                        String telEditar = entrada.nextLine();
//                        Contato contatoAEditar = agenda.buscarPorTelefone(telEditar);
//
//                        if (contatoAEditar != null) {
//                            System.out.print("Novo nome (enter p/ manter): ");
//                            String novoNome = entrada.nextLine();
//                            System.out.print("Novo telefone (enter p/ manter): ");
//                            String novoTelefone = entrada.nextLine();
//                            System.out.print("Novo e-mail (enter p/ manter): ");
//                            String novoEmail = entrada.nextLine();
//
//                            String nomeFinal = novoNome.isEmpty() ? contatoAEditar.getNome() : novoNome;
//                            String telFinal = novoTelefone.isEmpty() ? contatoAEditar.getTel() : novoTelefone;
//                            String emailFinal = novoEmail.isEmpty() ? contatoAEditar.getEmail() : novoEmail;
//
//                            if (agenda.editarContatoPorTelefone(telEditar, nomeFinal, telFinal, emailFinal)) {
//                                System.out.println("Contato atualizado com sucesso!");
//                            } 
//                        } else {
//                            System.out.println("Contato não encontrado para edição.");
//                        }
//                    }
//                        
//                    case 5 -> {
//                        System.out.println("\n[EXCLUIR CONTATO]");
//                        System.out.print("Digite o telefone do contato a excluir: ");
//                        String telExcluir = entrada.nextLine();
//                        
//                        Contato contatoParaExcluir = agenda.buscarPorTelefone(telExcluir);
//                        
//                        if (contatoParaExcluir != null) {
//                            System.out.print("Confirmar exclusão? (S/N): ");
//                            String confirmacao = entrada.nextLine();
//                            if (confirmacao.equalsIgnoreCase("S")) {
//                                if (agenda.removerContatoPorTelefone(telExcluir)) {
//                                    System.out.println("Contato excluído com sucesso!");
//                                }
//                            } else {
//                                System.out.println("Exclusão cancelada.");
//                            }
//                        } else {
//                            System.out.println("Contato não encontrado para exclusão.");
//                        }
//                    }
//                        
//                    case 6 -> System.out.println("Saindo do programa...");
//                        
//                    default -> System.out.println("Opção inválida. Tente novamente.");
//                }
//                
//            } while (opcao != 6);
//        }
//    }
//}
//
//class Contato implements Comparable<Contato> {
//    private String nome;
//    private String tel;
//    private String email;
//    
//    public Contato (String nome, String tel, String email) {
//        setNome(nome);
//        setTel(tel);
//        setEmail(email);
//    }
//    
//    public String getNome() {
//        return nome;
//    }
//    
//    public void setNome(String nome){
//        if (nome == null || nome.trim().isEmpty()) {
//            throw new IllegalArgumentException("ERRO: Nome não pode ser vazio.");
//        }
//        this.nome = nome.trim();
//    }
//    
//    public String getTel(){
//        return tel;
//    }
//    
//    public void setTel (String tel) {
//        if (tel == null || !Pattern.matches("^\\(?\\d{2}\\)?\\s?\\d{4,5}-?\\d{4}$", tel.trim())) {
//            throw new IllegalArgumentException("ERRO: Telefone inválido. Use um formato como (XX) XXXXX-XXXX.");
//        }
//        this.tel = tel.trim();
//    }
//    
//    public String getEmail() {
//        return email;
//    }
//    
//    public void setEmail (String email) {
//        if (email == null || !email.contains("@") || !email.contains(".")) {
//            throw new IllegalArgumentException("ERRO: E-mail inválido. Deve conter '@' e '.'.");
//        }
//        this.email = email.trim();
//    }
//    
//    @Override
//    public int compareTo(Contato outro) {
//        return this.nome.compareToIgnoreCase(outro.nome);
//    }
//    
//    @Override
//    public String toString() {
//        return " | Nome: " + nome + " | Telefone: " + tel + " | E-mail: " + email;
//    }
//}
//
//class AgendaEletronica {
//    private final List<Contato> contatos;
//    
//    public AgendaEletronica () {
//        contatos = new ArrayList<>();
//    }
//    
//    public boolean adicionarContato(Contato novoContato) { 
//        for (Contato c : contatos) {
//            if (c.getTel().equals(novoContato.getTel())) {
//                System.out.println("ERRO: Um contato com este telefone já está cadastrado.");
//                return false;
//            }
//        }
//        contatos.add(novoContato);
//        return true;
//    }
//    
//    public Contato buscarPorNome(String nome){
//        for (Contato c : contatos) {
//            if (c.getNome().equalsIgnoreCase(nome.trim())) {
//                return c;
//            }
//        }
//        return null;
//    }
//
//    public Contato buscarPorTelefone(String telefone) {
//        for (Contato c : contatos) {
//            if (c.getTel().equals(telefone.trim())) {
//                return c;
//            }
//        }
//        return null;
//    }
//    
//    public boolean removerContatoPorTelefone(String telefone) {
//        Contato contato = buscarPorTelefone(telefone);
//        if (contato != null) {
//            contatos.remove(contato);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean editarContatoPorTelefone(String telefoneAntigo, String novoNome, String novoTelefone, String novoEmail) {
//        Contato contato = buscarPorTelefone(telefoneAntigo);
//        if (contato != null) {
//            try {
//                contato.setNome(novoNome);
//                contato.setTel(novoTelefone);
//                contato.setEmail(novoEmail);
//                return true;
//            } catch (IllegalArgumentException e) {
//                System.out.println("ERRO na atualização: " + e.getMessage());
//                return false;
//            }
//        }
//        return false;
//    }
//    
//    public boolean removerContato(String nome) {
//        Contato contato = buscarPorNome(nome);
//        if (contato !=null){
//            contatos.remove(contato);
//            return true;
//        }
//        return false;
//    }
//    
//    public void listarContatos() {
//        if (contatos.isEmpty()) {
//            System.out.println("Agenda vazia!");
//        } else {
//            Collections.sort(contatos); 
//            
//            int index = 1;
//            for (Contato c : contatos) {
//                System.out.println("# " + index + c); 
//                index++;
//            }
//        }
//    }
//}
//    }
//}