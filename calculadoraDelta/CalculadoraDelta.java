package calculadoraDelta;

import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule o delta de uma
    equação do segundo grau (delta = Math.pow(b, 2) - 4 * a * c).
*/

public class CalculadoraDelta {
    private static final int TAM_LISTA = 3;
    private static final int  FATOR_BHASKARA = 4;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] bhaskara = new double[TAM_LISTA];

        String[] variaveis = {"a", "b", "c"};

        do {
            System.out.printf("Digite o valor de a (deve ser maior que zero): ");
            bhaskara[0] = entrada.nextDouble();
            if (bhaskara[0] <= 0) {
                System.out.println("Valor invalido! O coeficiente 'a' dever ser maior que zero.");
            }
        } while (bhaskara[0] <= 0);

        for (int i = 1; i < bhaskara.length; i++) {
            System.out.printf("Digite o valor de " + variaveis[i] + ": ");
            bhaskara[i] = entrada.nextDouble();
        }

        double delta = calcularDelta(bhaskara[0], bhaskara[1], bhaskara[2]);

        imprimirDelta(delta);

        entrada.close();
    }

    public static double calcularDelta(double a, double b, double c) {
        return Math.pow(b, 2) - FATOR_BHASKARA * a * c;
    }

    public static void imprimirDelta(double delta) {
        System.out.println("O delta da equacao e: " + formatarNumero(delta));
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
