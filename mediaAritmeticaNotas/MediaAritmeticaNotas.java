package mediaAritmeticaNotas;

import java.util.Locale;
import java.util.Scanner;

/*
    Crie um programa que calcule e exiba a
    média aritmética de três notas informadas pelo usuário

    TODO: java mediaAritmeticaNotas.MediaAritmeticaNotas
*/

public class MediaAritmeticaNotas {
    // Declarando a constante estática
    private static final int QTD_NOTAS = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Usando um array para armazenar as notas
        double[] notas = new double[QTD_NOTAS];

        // Loop para receber as três notas
        for (int i = 0; i < QTD_NOTAS; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        // Calculando a média
        double media = media(notas);

        // Exibindo o resultado formatado
        System.out.println("Média aritmética: " + formatarNumero(media));

        entrada.close();
    }

    // Método para calcular a média das notas
    public static double media(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length; // Calcula a média
    }

    // Método para formatar o número para duas casas decimais
    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero); // Formata o número
    }
}
