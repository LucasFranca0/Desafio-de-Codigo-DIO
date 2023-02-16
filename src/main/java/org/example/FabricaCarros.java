package org.example;

import java.util.Scanner;

/*
/// Desafio ///
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). O gerente de uma loja de carros gostaria de um programa para calcular o preço de um carro novo para os clientes. Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos e deverá escrever programa para ler esses valores e imprimir o valor final do carro.

-- Entrada --
Você recebera três valores inteiros que representam o custo de fábrica, as porcentagens do distribuidor e os impostos.

-- Saída --
Como saída, teremos o valor final do preço de um carro novo.*/
public class FabricaCarros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor = 0;
        int distribuidor = 0;
        int valorImpostos = 0;

        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * PercentualImpostos) / 100;
        custoConsumidor = custoFabrica + distribuidor + valorImpostos;


        System.out.println(custoConsumidor);
    }
}
