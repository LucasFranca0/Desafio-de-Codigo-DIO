package org.example;

import java.util.Scanner;
/*
//// Desafio /////
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar
a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

--- Entrada
A entrada contém 6 números que podem ser valores inteiros ( int ) ou de ponto flutuante ( float ou double ). Pelo menos
um destes números será positivo.

--- Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.*/
public class ImprimindoPositivos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;

        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if (x > 0) {
                cont++;
                media += x;
            }
        }

        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}

