package calculadoraDistanciaPontos;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que leia a posição x e y
    de dois pontos no plano cartesiano, e calcule
    a distância entre ambos.
*/

public class CalculadoraDistanciaPontos {
    private static final int TAM_LISTA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] coordenadaX = new double[TAM_LISTA];
        double[] coordenadaY = new double[TAM_LISTA];

        for (int i = 0; i < TAM_LISTA; i++) {
            System.out.println("Digite as coordenadas do ponto " + (i + 1) + ":");
            coordenadaX[i] = solicitarValor("Coordenada x: ", entrada);
            coordenadaY[i] = solicitarValor("Coordenada y: ", entrada);
        }

        double distancia = calcularDistancia(coordenadaX[0], coordenadaY[0], coordenadaX[1], coordenadaY[1]);

        imprimirResultados(distancia);

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

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }

    public static void imprimirResultados(double distancia) {
        System.out.println("\nA distancia entre os dois pontos e: " + formatarNumero(distancia) + " unidades.\n");
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
