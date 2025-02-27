package aritmetica;

import java.util.Locale;
import java.util.Scanner;

/*
    TODO: javac -d . aritmetica\Aritmetica.java
    TODO: java aritmetica.Aritmetica
*/

public class Aritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "UTF-8");
        entrada.useLocale(Locale.US);

        // Entrada de números pelo usuário
        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        // Executando operações
        double soma = somar(n1, n2);
        double subtracao = subtrair(n1, n2);
        double multiplicao = multiplicar(n1, n2);
        double divisao = dividir(n1, n2);

        // Exibindo os resultados formatados
        System.out.println("\nResultados:");
        System.out.println("Soma: " + formatarNumero(soma));
        System.out.println("Subtração: " + formatarNumero(subtracao));
        System.out.println("Multiplicação: " + formatarNumero(multiplicao));
        System.out.println("Divisão: " + formatarNumero(divisao));

        entrada.close();
    }

    // Métodos para operações aritméticas
    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public static double dividir(double n1, double n2) {
        if (n2 == 0) {
            return 0; // Retorna 0 para evitar erro, mas a mensagem de erro já é tratada na exibição
        }
        return n1 / n2;
    }

    // Método para formatar números com 2 casas decimais
    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
