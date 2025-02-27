package calculadoraRetangulo;

import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule o perímetro e a
    área de um retângulo, utilizando as fórmulas 
    P = 2(l + c) e A = l * c, onde l é a largura e c é o comprimento
*/

public class CalculadoraRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double largura = informarLargura(entrada);
        double comprimento = informarComprimento(entrada);

        double perimetro = calcularPerimetro(largura, comprimento);
        double area = calcularArea(largura, comprimento);

        imprimirResultados(perimetro, area);

        entrada.close();
    }

    public static double informarLargura(Scanner largura) {
        System.out.print("Digite a largura do retangulo: ");
        return largura.nextDouble();
    }

    public static double informarComprimento(Scanner comprimento) {
        System.out.print("Digite o comprimento do retangulo: ");
        return comprimento.nextDouble();
    }

    public static double calcularPerimetro(double largura, double comprimento) {
        return 2 * (largura + comprimento);
    }

    public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }

    public static void imprimirResultados(double perimetro, double area) {
        System.out.println("O perimetro do retangulo e: " + formatarNumero(perimetro));
        System.out.println("A area do retangulo e: " + formatarNumero(area));
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
