package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double distribuidor = 0.28;
        double imposto = 0.45;
        double custoFabrica = 0;
        double total = custoFabrica + distribuidor * imposto;

        System.out.println("Bem vindo ao programa Calculadora de Custo Final de Veículo!");
        System.out.println("Digite o valor do carro:  ");
        custoFabrica = scan.nextDouble();
        total = custoFabrica + distribuidor * imposto;

        System.out.println("O custo total do carro é de: " + total);




    }
}

