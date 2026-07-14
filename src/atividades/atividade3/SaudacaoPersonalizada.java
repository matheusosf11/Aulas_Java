package atividades.atividade3;

import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void main(String[]args){
        imprimirSaudacao("");
    }
    public static void imprimirSaudacao(String nome){
        System.out.println("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        System.out.println("Olá "+entrada+"! Bem-vindo(a) à nossa aula de métodos.");
    }


}