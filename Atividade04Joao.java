/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividade04.isabelaw;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Aluno
 */
public class Atividade04joao {

    public static void main(String[] args) {
//     Atividade 01:
//     Scanner entrada = new Scanner (System.in);
//     int n;  
//     System.out.print("Digite um número: ");
//     n = entrada.nextInt();
//     if (n>=0){
//         System.out.println("O número digitado é positivo!");
//     }
//     else{
//     System.out.println("O número digitado é negativo");
//     }

//      Atividade 02:
//    Scanner entrada = new Scanner (System.in);
//    int num;
//    System.out.print("Digite um número: ");
//    num = entrada.nextInt();
//    if (num>0){
//    System.out.println("O número digitado é positivo!");
//    }
//    else if (num<0){
//    System.out.println("O número digitado é negativo!");
//    }
//    else {
//    System.out.println("O número digitado é zero!");
//    }

//      Atividade 03:
//      Scanner entrada = new Scanner (System.in);
//      double n1,n2,n3,media;
//      System.out.print("Digite a primeira nota: ");
//      n1 = entrada.nextDouble();
//      System.out.print("Digite a segunda nota: ");
//      n2 = entrada.nextDouble();
//      System.out.print("Digite a terceira nota: ");
//      n3 = entrada.nextDouble();
//      media = (n1+n2+n3)/3;
//      if (media >= 7){
//          System.out.println("O aluno foi aprovado!");
//      }
//      else{
//         System.out.println("O aluno foi reprovado!");
//    }

//      Atividade 04:
//    Scanner entrada = new Scanner (System.in);
//    double n1,n2,n3,media;
//    System.out.print("Digite a primeira nota: ");
//    n1 = entrada.nextDouble();
//    System.out.print("Digite a segunda nota: ");
//    n2 = entrada.nextDouble();
//    System.out.print("Digite a terceira nota: ");
//    n3 = entrada.nextDouble();
//    media = (n1+n2+n3)/3;
//    if (media>=7){
//    System.out.println("Aluno aprovado!");
//    }
//    else if (media<5){
//    System.out.println("Aluno reprovado!");
//    }
//    else{
//    System.out.println("Aluno em recuperação!");
//    }

//   Atividade 05:
//    Scanner entrada = new Scanner (System.in);
//    int n1;
//    System.out.print("Digite um número: ");
//    n1 = entrada.nextInt();
//    if (n1%2==0){
//        System.out.println("O número digitado é par!");}
//    
//    else{
//        System.out.println("O número digitado é ímpar!");
//    }

//  Atividade 06:
//    Scanner entrada = new Scanner (System.in);
//    int n1,n2,n3;
//    System.out.print("Digite um número: ");
//    n1 = entrada.nextInt();
//    System.out.print("Digite outro número: ");
//    n2 = entrada.nextInt();
//    System.out.print("Digite outro número: ");
//    n3 = entrada.nextInt();
//    if (n1>n2 && n1>n3){
//    System.out.println("O maior número é: "+n1);
//    }
//    else if (n2>n1 && n2>n3){
//     System.out.println("O maior número é: "+n2);
//    }
//    else{
//     System.out.println("O maior número é: "+n3);}

//     Atividade 07:
//        Scanner entrada = new Scanner (System.in);
//        int idade;
//         System.out.print("Digite a idade do nadador: ");
//        idade = entrada.nextInt();
//        if (idade>=18){
//            System.out.println("O nadador é da catégoria adulto!");
//        }
//        else if (idade>=14){
//         System.out.println("O nadador é  da catégoria juvenil!");
//        }
//        else if (idade>=9){
//          System.out.println("O nadador é da catégoria infantil! ");
//        }
//        else {
//         System.out.println("O nadador é da catégoria mirim");
//        }

//      Atividade 08:
//       Scanner entrada = new Scanner (System.in);
//       int n1,n2,ad,ad1,sub;
//       System.out.print("Digite o primeiro número: ");
//       n1 = entrada.nextInt();
//       System.out.print("Digite o segundo número: ");
//       n2 = entrada.nextInt();
//       ad = n1+n2;
//       ad1 = ad+8;
//       sub = ad-5;
//      if (ad >20){
//      System.out.println("O resultado é"+ad1);
//      }
//      else{
//      System.out.println("O resultado é"+sub);
//      }  

//      Atividade 09: 
//        Scanner entrada = new Scanner (System.in);
//        double vp,lucro,lucro1;
//        System.out.print("Digite o valor do produto: ");
//        vp = entrada.nextDouble();
//        lucro = vp + (vp/100)*45;
//        lucro1= vp + (vp/100)*30;
//        if (vp<20){
//        System.out.println("O valor da venda será: "+lucro);
//        }
//        else{
//        System.out.println("O valor da venda será: "+lucro1);
//        }

//      Atividade 10:
//        Scanner entrada = new Scanner (System.in);
//        double preco,preco1,qntd;
//        System.out.print("Digite a quantidade de maças: ");
//        qntd = entrada.nextDouble();
//        preco = 0.30*qntd;
//        preco1 = 0.25*qntd;
//        if (qntd<12){
//        System.out.println("O total da compra será: "+preco);
//        }
//        else {
//        System.out.println("O total da compra será: "+preco1);
//        }

//      Atividade 11:
//        Scanner entrada = new Scanner (System.in);
//        double altura,calc,calc1;
//        int resposta;
//        
//        System.out.print("Escolha seu sexo: Feminino(1) ou Masculino(2): ");
//        resposta = entrada.nextInt();
//        if (resposta ==1){
//            System.out.print("Digite sua altura: ");
//            altura = entrada.nextDouble();
//            calc = (62.1*altura)-44.7;
//            System.out.println("Seu peso ideal é: "+calc);
//        }
//        else if (resposta==2){
//            System.out.print("Digite sua altura: ");
//            altura = entrada.nextDouble();
//            calc1 = (72.7*altura)-58;
//            System.out.println("Seu peso ideal é: "+calc1);
//        }
//        else{
//        System.out.println("Opção inválida!");}

//   Atividade 12:
//    Scanner entrada = new Scanner (System.in);
//    int dia;
//    System.out.print("Digite o dia da semana, exemplo: Segunda(1), Terça(2), ...: ");
//    dia = entrada.nextInt();
//        switch (dia){
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:  
//                System.out.println("Segunda");
//                break;
//            case 3:  
//                System.out.println("Terça");
//                break;
//            case 4:  
//                System.out.println("Quarta");
//                break;
//            case 5:  
//                System.out.println("Quinta");
//                break;
//            case 6:  
//                System.out.println("Sexta");
//                break;
//            case 7:  
//                System.out.println("Sábado");
//                break;
//            default:
//                System.out.println("Número inválido!");
//        } 
    
//      Atividade 13:
//        Scanner entrada = new Scanner (System.in);
//        int codigo;
//        double valor;
//        valor=0.0;
//        System.out.print("Digite o código do trabalho: ");
//        codigo = entrada.nextInt();
//        switch (codigo){
//            case 100: 
//              System.out.print("Detergente - R$ 1,59");
//               valor = valor+1.59;
//                break;
//            case 101:
//                System.out.print("Esponja - R$ 4,59");
//                valor = valor+4.59;
//                break;
//            case 102:
//                System.out.print("Lã de aço - R$ 1,79");
//                valor = valor+1.79;
//                break;
//        }
 
//      Atividade 14:
//            Scanner entrada = new Scanner (System.in);
//            int operadores,op1,op2,resultado;
//            System.out.print("Digite um operando: ");
//            op1 = entrada.nextInt();
//            System.out.print("Digite outro operando: ");
//            op2 = entrada.nextInt();
//            System.out.print("Digite o operador desejado, ex: 1 - Soma, 2 - Subtração,3 - Multiplicação,4 - Divisão: ");
//            operadores = entrada.nextInt();
//            switch (operadores){
//                case 1:
//                    System.out.println("Operador é a soma!");
//                    resultado = op1 + op2;
//                    System.out.print("O resultado é: "+resultado);
//                    break;
//                case 2:
//                    System.out.println("Operador é a subtração!");
//                    resultado = op1 - op2;
//                    System.out.print("O resultado é: "+resultado);
//                    break;
//                case 3:
//                    System.out.println("Operador é a multiplicação!");
//                    resultado = op1 * op2;
//                    System.out.print("O resultado é: "+resultado);
//                    break;
//                case 4:
//                    System.out.println("Operador é a divisão!");
//                    resultado = op1 / op2;
//                    System.out.print("O resultado é: "+resultado);
//                    break;
//            }
            
    
    }
  }

