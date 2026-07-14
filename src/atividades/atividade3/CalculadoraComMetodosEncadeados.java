package atividades.atividade3;

import java.util.Scanner;

public class CalculadoraComMetodosEncadeados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();

        imprimirResultado (subtrairNumeros(x, y));

    }
    public static int subtrairNumeros(int x, int y) {
        return x - y;
    }

    public static void imprimirResultado(int resultado) {
        System.out.println("O resultado da operação é: " + resultado);
    }


}