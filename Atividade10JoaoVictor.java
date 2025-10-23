/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade10JoaoVictor.java;

import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConexaoDAO dao = new ConexaoDAO();
        while (true) {
            System.out.println("\n   Sistema de Gerenciamento de Usuários  ");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Atualizar usuário");
            System.out.println("4 - Deletar usuário");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome do usuário: ");
                    String nome = entrada.nextLine();
                    Aluno novoUsuario = new Aluno();
                    novoUsuario.setNome(nome);
                    dao.cadastrarAluno(novoUsuario);
                    break;
                case 2:
                    List<Aluno> lista = dao.listarAlunos();
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum usuário encontrado.");
                    } else {
                        for (Aluno u : lista) {
                            System.out.println(u);
                        }
                    }
                    break;
                case 3:
                    System.out.print("ID do usuário que deseja atualizar: ");
                    int idAtualizar = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = entrada.nextLine();
                    Aluno usuarioAtualizado = new Aluno(idAtualizar, novoNome);
                    dao.atualizarAluno(usuarioAtualizado);
                    break;
                case 4:
                    System.out.print("ID do usuário que deseja deletar: ");
                    int idDeletar = entrada.nextInt();
                    dao.deletarAluno(idDeletar);
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    entrada.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
class Aluno {
    private int id;
    private String nome;

    public Aluno() {}

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome;
    }
}
class ConexaoDAO {
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/usuarios"; // Nome do banco
        String usuario = "root";
        String senha = "1234"; // Altere se necessário
        return DriverManager.getConnection(url, usuario, senha);
    }
    public void cadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO usuario (nome) VALUES (?)"; // Nome da tabela
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }
    public List<Aluno> listarAlunos() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                lista.add(aluno);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuários: " + e.getMessage());
        }
        return lista;
    }
    public void atualizarAluno(Aluno aluno) {
        String sql = "UPDATE usuario SET nome = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getId());
            stmt.executeUpdate();
            System.out.println("Usuário atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }
    }
    public void deletarAluno(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Usuário deletado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar usuário: " + e.getMessage());
        }
    }
}
