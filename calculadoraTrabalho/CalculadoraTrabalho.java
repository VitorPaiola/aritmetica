package calculadoraTrabalho;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule o trabalho realizado
    por uma força que atua sobre um objeto, utilizando
    a fórmula T = F * d, onde T é o trabalho, F é a força
    aplicada e d é a distância percorrida pelo objeto.
*/

public class CalculadoraTrabalho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double forcaAplicada;
        do {
            forcaAplicada = solicitarValor("Digite a forca aplicada: ", entrada);
            if (forcaAplicada < 0) {
                System.out.println("Valor invalido. A forca aplicada deve ser positiva.");
            }
        } while (forcaAplicada < 0);

        double distanciaPercorrida;
        do {
            distanciaPercorrida = solicitarValor("Digite a distancia percorrida: ", entrada);
            if (distanciaPercorrida < 0) {
                System.out.println("Valor invalido. A distancia percorrida deve ser positiva.");
            }
        } while (distanciaPercorrida < 0);

        double trabalhoRealizado = calcularTrabalhoRealizado(forcaAplicada, distanciaPercorrida);
        imprimirResultados(trabalhoRealizado);

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

    public static double calcularTrabalhoRealizado(double forcaAplicada, double distanciaPercorrida) {
        return forcaAplicada * distanciaPercorrida;
    }

    public static void imprimirResultados(double trabalhoRealizado) {
        System.out.println("O trabalho realizado e: " + formatarNumero(trabalhoRealizado) + " joule");
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
