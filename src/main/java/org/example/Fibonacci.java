package org.example;

import java.util.Scanner;

/*
//// Desafio /////
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

-- Entrada --
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

-- Saída --
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.


 */
public class Fibonacci {
    static long fibo(int n) {
        int F = 0;     // atual
        int ant = 0;   // anterior

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }
        return F;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i < N; i++) {
            System.out.print(Fibonacci.fibo(i) + " ");
            if (i == N) System.out.print(Fibonacci.fibo(i));
        }
    }
}

