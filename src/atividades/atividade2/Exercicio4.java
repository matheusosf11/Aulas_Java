package atividades.atividade2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {


        System.out.println("Calculadora de IMC (Índice de massa corporal)\nColoque seu peso e altura logo abaixo para calcular seu IMC e saber se esta dentro do peso.");

        System.out.println("Digite seu peso em kg: ");
        Scanner peso1 = new Scanner(System.in);
        double peso = peso1.nextDouble();

        System.out.println("Digite sua altura em metro: ");
        Scanner altura1 = new Scanner(System.in);
        double altura = altura1.nextDouble();

        double imc = peso/(altura*altura);

        if(imc<18.5){
            System.out.println("Seu IMC deu "+imc+" .Abaixo do peso");
        }else if(imc>=18.5 && imc<= 24.9){
            System.out.println("Seu IMC deu "+imc+" .Peso normal");
        }else if(imc>=25.0 && imc<=29.9){
            System.out.println("Seu IMC deu "+imc+" .Sobrepeso");
        }else if(imc>=30){
            System.out.println("Seu IMC deu "+imc+" .Obeso, cria vergonha.");
        }


    }
}
