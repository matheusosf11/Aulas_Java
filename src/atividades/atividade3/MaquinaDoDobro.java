package atividades.atividade3;

import java.util.Scanner;

public class MaquinaDoDobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = scanner.nextInt();
        int dobro = calcularDobro(valor);

        System.out.println("O dobro do número é: " + dobro);
    }

    public static int calcularDobro(int valor) {

        int resultado = valor * 2;
        return resultado;

    }
}