package model;

import java.util.Scanner;

public class Calculadora {

    public void menu(Scanner scanner) {
        boolean system = true;


        while (system) {
            System.out.println(" ");
            System.out.println("Calculadora ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.valorSoma(scanner);
                    break;

                case 2:
                    this.ValorSubtraido(scanner);
                    break;
                case 3:
                    this.valorDivido(scanner);
                    break;
                case 4:
                    this.valorMultiplicado(scanner);
                    break;
                default:
                    system = false;
                    break;
            }
        }
    }


    private void valorSoma(Scanner scanner) {
        System.out.println(" ");
        System.out.println("Digite um numero: ");
        int a = scanner.nextInt();
        System.out.println("Digite o proximo valor: ");
        int b = scanner.nextInt();

        int valorSomado = a + b;

        System.out.println("Resultado = " + valorSomado);
        System.out.println();
    }

    private void ValorSubtraido(Scanner scanner) {
        System.out.println(" ");
        System.out.println("Digite um numero");
        int a = scanner.nextInt();
        System.out.println("Digite um numero");
        int b = scanner.nextInt();

        int valorSubtraido = a - b;

        System.out.println("Resultado =  " + valorSubtraido);
        System.out.println();
    }

    private void valorDivido(Scanner scanner) {
        System.out.println(" ");
        System.out.println("Digite um numero");
        int a = scanner.nextInt();
        System.out.println("Digite um numero");
        int b = scanner.nextInt();

        int valorDivido = a / b;

        System.out.println("Resultado =  " + valorDivido);
        System.out.println();
    }

    private void valorMultiplicado(Scanner scanner) {
        System.out.println(" ");
        System.out.println("Digite um numero");
        int a = scanner.nextInt();
        System.out.println("Digite um numero");
        int b = scanner.nextInt();

        int valorMultiplicado = a * b;

        System.out.println("Resultado =  " + valorMultiplicado);
        System.out.println();
    }
}
