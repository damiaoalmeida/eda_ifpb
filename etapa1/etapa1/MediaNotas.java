package etapa1;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Nota inválida. Ignorando...");
                continue;
            }
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Média final: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 4) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
