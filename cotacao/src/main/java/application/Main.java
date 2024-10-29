/*
    * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
    * Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que
    * pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos
    --
    *     aPagarEmReais -> amountToPayInReais
*/

package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarRate = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dollarAmount = sc.nextDouble();

        CurrencyConverter converter = new CurrencyConverter(dollarRate, dollarAmount);
        double amountToPayInReais = converter.calculateAmountInReais();

        System.out.printf("Amount to be paid in reais = %.2f%n " , amountToPayInReais);

        sc.close();
    }
}