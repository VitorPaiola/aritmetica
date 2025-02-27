package calculadoraEnergiaCinetica;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule a energia cinética
    de um objeto em movimento, utilizando a fórmula
    E = (m * v ^ 2) / 2, onde E é a energia cinética,
    m é a massa do objeto e v é a velocidade.
*/

public class CalculadoraEnergiaCinetica {
    private static final int FATOR_ENERGIA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double massaObjeto;
        do {
            massaObjeto = solicitarValor("Digite a massa do objeto: ", entrada);
            if (massaObjeto < 0) {
                System.out.println("Valor invalido. A massa do objeto dever ser positiva.");
            }
        } while (massaObjeto < 0);

        double velocidade;
        do {
            velocidade = solicitarValor("Digite a velocidade do objeto: ", entrada);
            if (velocidade < 0) {
                System.out.println("Valor invalido. A velocidade do objeto dever ser positiva.");
            }
        } while (velocidade < 0);

        double energiaCinetica = calcularEnergiaCinetica(massaObjeto, velocidade);
        imprimirResultados(energiaCinetica);

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
                entrada.next();
            }
        }
    }

    public static double calcularEnergiaCinetica(double massaObjeto, double velocidade) {
        return massaObjeto * Math.pow(velocidade, 2) / FATOR_ENERGIA;
    }

    public static void imprimirResultados(double energiaCinetica) {
        System.out.println("A energia cinetica do objeto e: " + formatarNumero(energiaCinetica));
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
