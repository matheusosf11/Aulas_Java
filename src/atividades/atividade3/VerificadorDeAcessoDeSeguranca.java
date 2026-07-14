package atividades.atividade3;

import java.util.Scanner;

public class VerificadorDeAcessoDeSeguranca {

    public static boolean verificarMaioridade(int idade) {
        return idade >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (verificarMaioridade(idade)) {
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }

    }
}