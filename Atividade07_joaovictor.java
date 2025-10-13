/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;
//package com.mycompany.atividade07_joaovictor

/**
 *
 * @author Aluno
 */
public class Atividada07_joaovictor {
    public static void main(String[] args) {
        // Atividade 01:
        Scanner entrada=new Scanner(System.in);
//        Atividade 01:
//        int[][] b = new int[4][4];
//       int valor;
//        for (int i = 0;i<b.length;i++){
//            for(int j=0;j<b[i].length;j++){
//                System.out.print("Digite um valor: ");
//                valor = entrada.nextInt();
//                System.out.println(b[i][j]);
//            }
//        }

          // Atividade 02:
//          int[] vetor = new int[8];
//          for (int i = 0; i <vetor.length; i++) {
//             System.out.print("Insira o " + (i+1) + "° valor:");
//             vetor[i] = entrada.nextInt;
//          }
//             
//          System.out.print("\nValores digitados: ");
//          for (int i = 0; i <vetor.length; i++) {
//              System.out.print(vetor[i] + "");      
//          }   
//       } 

//          Atividade 03:
//        int[] vet1 = new int[5];
//        int[] vet2 = new int[5];
//        System.out.println("Digite 5 valores inteiros:");
//         for (int i = 0; i <5; i++) {
//              System.out.print("Digite o valor " + (i+1) + ": ");
//              vet1[i] = entrada.nextInt();
//         }
//         for(int i = 0; i <5; i++){
//             vet2[i] = vet1[i];
//         }
//         for(int i = 0; i <5; i++){
//                System.out.print(vet2[i] + " ");
//            }

//          Atividade 04:
//         int[] vet1 = new int[20];
//         for (int contador = 0; contador <a.lenght;contador++){
//                System.out.print("Insira o "+contador+" ° valor");
//                a[contador]= entrada.nextInt();}
//         for (int contador = 0;contador <a.lenght;contador++){
//                System.out.println(a[contador]);
//         }

//            Atividade 05: 
//            String senha;
//            boolean valida;
//            do{
//                System.out.print("Digite a senha: ");
//                senha = entrada.nextLine();
//                valida = true;
//                if(senha.length()<8){
//                    System.out.println("Senha inválida!");
//                    valida = false;
//                }
//                boolean digito = false;
//                for(int i =0 ; i<senha.length(); i++){
//                 char c = senha.charAt(i);
//                 if (c>='0'&& c<='9'){
//                        digito=true;
//                        break;}
//                }
//                if (digito){
//                System.out.println("Senha inválida!");
//                valida = false;
//                }
//            } while (!valida);
//            System.out.println("Senha válida!");

//          Atividade 06:
//        String frase;
//        System.out.print("Digite uma frase: ");
//        frase = entrada.nextLine();
//        int vogais =0, consoantes = 0, espaco = 0 , resto = 0;
//        for (int i = 0; i < frase.length();i++){
//                char c = Character.toLowerCase(frase.charAt(i));
//                if (c>='a'&& c<='z'){
//                    if("aeiou".indexOf(c)!= -1){
//                    vogais++;
//                }else if (c==''){
//                    espaco++;}
//                else{
//                        outros++;
//                        }
//                }
//        }
//        System.out.println("Vogais: "+vogais);
//        System.out.println("Consoantes: "+consoantes);
//        System.out.println("Espaços: "+espaco);
//        System.out.println("outros: "+resto);

//         Atividade 07:
//    System.out.print("Digite um texto: ");
//        String texto = sc.nextLine();
//
//        System.out.print("Digite a palavra a procurar: ");
//        String palavra = sc.nextLine();
//
//        int contador = 0;
//        int inicio = 0;
//        int pos;
//
//        while ((pos = texto.indexOf(palavra, inicio)) != -1) {
//            contador++;
//            inicio = pos + 1; // continua procurando depois da última posição
//        }
//
//        if (contador > 0) {
//            System.out.println("A palavra \"" + palavra + "\" aparece " + contador + " vez(es).");
//        } else {
//            System.out.println("A palavra \"" + palavra + "\" não aparece no texto.");
//        }

//      Atividad 08:
//    System.out.print("Cadastre um nome de usuário: ");
//        String usuarioCadastrado = sc.nextLine();
//
//        int tentativas = 3;
//        boolean acesso = false;
//
//        do {
//            System.out.print("Digite o usuário para login: ");
//            String usuarioDigitado = sc.nextLine();
//
//            if (usuarioDigitado.equals(usuarioCadastrado)) {
//                System.out.println("Acesso concedido!");
//                acesso = true;
//                break;
//            } else {
//                tentativas--;
//                if (tentativas > 0) {
//                    System.out.println("Acesso negado – tentativas restantes: " + tentativas);
//                } else {
//                    System.out.println("Conta bloqueada!");
//                }
//            }
//        } while (tentativas > 0 && !acesso);
//    }
//}
