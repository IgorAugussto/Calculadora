/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author 012205631
 */
public class Operacoes {
    
    int num1, num2, res;
    
    public int soma(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n===========================");
        System.out.println("          SOMA");
        System.out.println("===========================");
        System.out.println("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = input.nextInt();
        res = num1 + num2;
        System.out.println("O resultado é: " + res);
        return res;
    }
    
    public int subtracao(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n===========================");
        System.out.println("         SUBTRAÇÃO");
        System.out.println("===========================");
        System.out.println("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = input.nextInt();
        res = num1 - num2;
        System.out.println("O resultado é: " + res);
        return res;
    }
    
    public int multiplicacao(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n===========================");
        System.out.println("       MULTIPLICAÇÃO");
        System.out.println("===========================");
        System.out.println("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = input.nextInt();
        res = num1 * num2;
        System.out.println("O resultado é: " + res);
        return res;
    }
    
    public int divisao(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n===========================");
        System.out.println("          DIVISÃO");
        System.out.println("===========================");
        System.out.println("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = input.nextInt();
        res = num1 / num2;
        System.out.println("O resultado é: " + res);
        return res;
    }
    
    public int quadrado(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n===========================");
        System.out.println("        AO QUADRADO");
        System.out.println("===========================");
        System.out.println("Informe um número: ");
        num1 = input.nextInt();
        res = num1 * num1;
        System.out.println("O resultado é: " + res);
        return res;
    }
    
   
}
