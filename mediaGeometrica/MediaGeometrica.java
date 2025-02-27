package mediaGeometrica;

import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um progrrama que calcule a média geométrica
    entre três números informados pelo usuário
    
    TODO: java mediaGeometrica.MediaGeometrica
*/

public class MediaGeometrica {
    private static final int QTD_NOTAS = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] notas = new double[QTD_NOTAS];

        for (int i = 0; i < QTD_NOTAS; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        double media = mediaGeometrica(notas);

        System.out.println("Média geométrica: " + formatarNumero(media));

        entrada.close();
    }

    public static double mediaGeometrica(double[] notas) {
        double produto = 1;
        for (double nota : notas) {
            produto *=nota;
        }
        return Math.pow(produto, 1.0 / notas.length);
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
