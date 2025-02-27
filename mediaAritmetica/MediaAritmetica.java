import java.util.Locale;
import java.util.Scanner;

/*
    Escreva um programa que calcule a média
    aritmética de dois números.
*/

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        double media = media(n1, n2);

        System.out.println("Média aritmética: " + formatarNumero(media));

        entrada.close();
    }

    public static double media(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static String formatarNumero(double numero) {
        return String.format(Locale.US, "%.2f", numero);
    }
}
