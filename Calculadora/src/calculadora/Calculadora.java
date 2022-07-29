/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author 012205631
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("==============================");
        System.out.println("         CALCULADORA");
        System.out.println("==============================");
        
        System.out.println("Escolha o tipo de operação que deseja realizar:");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Quadrado de um número\n0 - Encerrar a operacão\n");
        
        Scanner input = new Scanner(System.in);
        
        Operacoes op = new Operacoes();
        
        int opcao;
        
        do{
            System.out.println("\nEcolhas uma das operacoes.");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    op.soma();
                    break;
                case 2:
                    op.subtracao();
                    break;
                case 3:
                    op.multiplicacao();
                    break;
                case 4:
                    op.divisao();
                    break;
                case 5:
                    op.quadrado();
                    break;
                default:
                    System.out.println("\n==========================");
                    System.out.println("ENCERRANDO CALCULADORA");
                    System.out.println("==========================");
                    
            }
        }while(opcao != 0);
    }
}