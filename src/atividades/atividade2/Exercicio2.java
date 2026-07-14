package atividades.atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        System.out.println("Calculadora de Média escolar.\n\nPara saber suas notas e se você passou de ano. Coloque suas notas de cada prova abaixo:\n\n");

        System.out.println("Prova 1:");
        Scanner entrada1 = new Scanner(System.in);
        double nota1 = entrada1.nextInt();

        System.out.println("Prova 2:");
        Scanner entrada2 = new Scanner(System.in);
        double nota2 = entrada2.nextInt();

        System.out.println("Prova 3:");
        Scanner entrada3 = new Scanner(System.in);
        double nota3 = entrada3.nextInt();

        double media = (nota1+nota2+nota3)/3;
        if(media>=7){
        System.out.println("Sua média foi "+media+" voce passou!");
            }else if(media>=5 && media<=6.9){
            System.out.println("Sua media foi "+media+". Voce ficou em recuperação.");
        }else if(media<7){
            System.out.println("Sua média foi "+media+". Voce esta reprovado!");
        }
    }

}
