package principal;

import model.Calculadora;
import model.IMC;

import java.util.Scanner;

public class Console {


    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        IMC imc = new IMC();

        boolean system = true;
        Scanner sc = new Scanner(System.in);

        while (system) {
            System.out.println("0 - Sair");
            System.out.println("1 - Calculadora");
            System.out.println("2 - Calculo IMC");
            System.out.println("Qual opcao deseja: ");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    calculadora.menu(sc);
                    break;
                case 2:
                    imc.MenuImc(sc);
                default:
                    system = false;
            }
        }
    }
}
