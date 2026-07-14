package atividades.atividade2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Detetive de Números.\n\n Digite um número para saber sua classificação:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero % 2 == 0 && numero > 0) {
            System.out.println("O número é Par.\nO número é positivo");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("O numéro é par.\nO número é negativo");
        } else if (numero % 2 == 1 && numero > 0) {
            System.out.println("O número é ímpar.\nO numero é positivo.");
        } else if (numero % 2 == -1 && numero < 0) {
            System.out.println("O numéro é ímpar.\nO número é negativo");
        }

    }
}
