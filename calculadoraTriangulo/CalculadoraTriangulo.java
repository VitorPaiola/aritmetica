package calculadoraTriangulo;

import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule o perímetro e a
    área de um triângulo, utilizando as fórmulas
    P = a + b + c e A = (b * h) / 2, onde a, b e c
    são os lados do triângulo e h é a altura
    relativa ao lado b.
*/

public class CalculadoraTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double ladoA = solicitarValor("Digite o lado A do triangulo: ", entrada);
        double ladoB = solicitarValor("Digite o lado B do triangulo: ", entrada);
        double ladoC = solicitarValor("Digite o lado C do triangulo: ", entrada);
        double altura = solicitarValor("Digite a altura h relativa ao lado B do triangulo: ", entrada);

        if (!trianguloValido(ladoA, ladoB, ladoC)) {
            System.out.println("\nOs valores informados nao forman um triangulo valido.\n");
        } else {
            double perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            double area = calcularArea(ladoB, altura);
            imprimirResultados(perimetro, area);
        }

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        System.out.print(mensagem);
        return entrada.nextDouble();
    }

    public static boolean trianguloValido(double ladoA, double ladoB, double ladoC) {
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }

    public static double calcularPerimetro(double ladoA, double ladoB, double ladoC) {
        return ladoA + ladoB + ladoC;
    }

    public static double calcularArea(double ladoB, double altura) {
        return (ladoB * altura) / 2;
    }

    public static void imprimirResultados(double perimetro, double area) {
        System.out.println("\nO perimetro do triangulo e: " + formatarNumero(perimetro));
        System.out.println("A area do triangulo e: " + formatarNumero(area) + "\n");
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
