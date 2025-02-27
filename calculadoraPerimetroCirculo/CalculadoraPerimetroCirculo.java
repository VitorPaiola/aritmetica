package calculadoraPerimetroCirculo;

import java.util.Locale;
import java.util.Scanner;

/*
    Crie um programa que calcule e exiba o perímetro
    de um círculo, solicitando o raio ao usuário.
*/

public class CalculadoraPerimetroCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double raio;

        do {
            System.out.print("Digite o valor do raio: ");
            raio = entrada.nextDouble();
            if (raio <= 0) {
                System.out.println("Valor invalido! O raio deve ser maior que zero.");
            }
        } while (raio <= 0);

        double perimetro = calcularPerimetroCirculo(raio);

        System.out.println("O perimetro do circulo e: " + formatarNumero(perimetro));

        entrada.close();
    }

    public static double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
