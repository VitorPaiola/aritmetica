package areaCirculo;

import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule a área de um círculo
    a partir do raio, utilizando a fórmula A = Math.PI * Math.pow(raio, 2)
*/

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double raio;

        do {
            System.out.print("Digite o raio do circulo: ");
            raio = entrada.nextDouble();
            if (raio <= 0) {
                System.out.println("Valor invalido! O raio deve ser maior que zero.");
            }
        } while (raio <= 0);

        double area = calcularAreaCirculo(raio);
        imprimirArea(area);

        entrada.close();
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static void imprimirArea(double area) {
        System.out.println("A area do circulo e: " + formatarNumero(area));
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
