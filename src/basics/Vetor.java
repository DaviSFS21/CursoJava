package basics;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas alturas serão registradas?");
        int n = sc.nextInt();

        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%nDigite a altura da pessoa %d: ", i + 1);
            alturas[i] = sc.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            total = alturas[i];
        }
        double avg = total / n;

        System.out.printf("A média de altura é: %.2f%n", avg);
    }
}
