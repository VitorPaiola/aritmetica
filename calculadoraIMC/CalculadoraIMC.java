package calculadoraIMC;

import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule o IMC
    de um indivíduo, utilizando a fórmula IMC = peso / altura ^ 2
*/

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double peso, altura;

        // Validação do peso
        do {
            System.out.print("Digite o peso (em quilogramas): ");
            peso = entrada.nextDouble();
            if (peso <= 0) {
                System.out.println("Erro: O peso deve ser maior que zero.");
            }
        } while (peso <= 0);

        // Validação da altura
        do {
            System.out.print("Digite a altura (em metros): ");
            altura = entrada.nextDouble();
            if (altura <= 0) {
                System.out.println("Erro: O altura deve ser maior que zero.");
            }
        } while (altura <= 0);

        double imc = calcularIMC(peso, altura);

        System.out.println("\nO IMC e: " + formatarNumero(imc));
        System.out.println("Classificacao: " + classificarIMC(imc));

        entrada.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade grau 1";
        } else if (imc < 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3 (mórbida)";
        }
    }
}
