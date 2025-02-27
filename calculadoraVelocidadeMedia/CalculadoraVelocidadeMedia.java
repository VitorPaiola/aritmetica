package calculadoraVelocidadeMedia;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule a velocidade média
    de um objeto, utilizando a fórmula v = Δs / Δt,
    onde v é a velocidade média, Δs é a variação de
    espaço e Δt é a variação de tempo
*/

public class CalculadoraVelocidadeMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double variacaoEspaco;
        do {
            variacaoEspaco = solicitarValor("Digite a variacao de espaco (maior que zero): ", entrada);
            if (variacaoEspaco <= 0) {
                System.out.println("Valor invalido. A variacao de espaco deve ser maior que zero.");
            }
        } while (variacaoEspaco <= 0);

        double variacaoTempo;
        do {
            variacaoTempo = solicitarValor("Digite a variacao de tempo (maior que zero): ", entrada);
            if (variacaoTempo <= 0) {
                System.out.println("Valor invalido. A variacao de tempo deve ser maior que zero.");
            }
        } while (variacaoTempo <= 0);

        double velocidadeMedia = calcularVelocidadeMedia(variacaoEspaco, variacaoTempo);
        imprimirResultados(velocidadeMedia);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double valor;
        while (true) {
            try {
                System.out.print(mensagem);
                valor = entrada.nextDouble();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite um numero valido.");
                entrada.next(); // Limpa a entrada invalida
            }
        }
    }

    public static double calcularVelocidadeMedia(double variacaoEspaco, double variacaoTempo) {
        return variacaoEspaco / variacaoTempo;
    }

    public static void imprimirResultados(double velocidadeMedia) {
        System.out.println("A velocidade media e: " + formatarNumero(velocidadeMedia) + " m/s");
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
