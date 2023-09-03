package model;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {


    public void MenuImc(Scanner scanner) {
        boolean system = true;

        while (system) {
            System.out.println("Menu IMC");
            System.out.println("1 - Calcular IMC");
            System.out.println("2 - Sair IMC");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.calculoIMC(scanner);
                    break;
                default:
                    system = false;
                    break;
            }
        }
    }


    private void calculoIMC(Scanner scanner) {
        System.out.println(" ");
        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em cm: ");
        double altura = scanner.nextDouble() / 100;

        double valorIMC = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("##.##");
        String ValorIMCFormatado = df.format(valorIMC);


        if (valorIMC <= 18.5) {
            System.out.println("Você está abaixo do peso " + ValorIMCFormatado);
            System.out.println();

        } else if (valorIMC >= 18.6 && valorIMC <= 24.9) {
            System.out.println("Você está com o peso Ideal " + ValorIMCFormatado);
            System.out.println();

        } else if (valorIMC >= 25 && valorIMC <= 29.9) {
            System.out.println("Você está com sobrepeso " + ValorIMCFormatado);
            System.out.println();

        } else if (valorIMC >= 30 && valorIMC <= 34.9) {
            System.out.println("Você está com Obesidade 1 " + ValorIMCFormatado);
            System.out.println();

        } else if (valorIMC >= 35 && valorIMC <= 39.9) {
            System.out.println("Obsedidade 2 " + ValorIMCFormatado);
            System.out.println();

        } else if (valorIMC >= 40) {
            System.out.println("Obsedidade 3 " + ValorIMCFormatado);
            System.out.println();
        }
    }
}
