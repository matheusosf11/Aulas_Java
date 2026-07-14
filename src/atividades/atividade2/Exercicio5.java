package atividades.atividade2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Digite o valor total da sua compra para saber quantos porcento de desconto vc ira ganhar.");
        Scanner compra = new Scanner(System.in);
        double valorCompra = compra.nextDouble();
        double deconto10 = valorCompra-valorCompra*0.1;
        double valorDesconto=valorCompra*0.1;
        double deconto20 = valorCompra-valorCompra*0.2;
        double valorDesconto20 = valorCompra*0.2;
        if(valorCompra<100){
            System.out.println("Sem desconto. Sua compra ficou no valor de R$"+valorCompra);
        }else if(valorCompra>=100 && valorCompra<=299.99){
            System.out.println("Sua compra ficou no valor de R$"+valorCompra+". Voce ganhou 10% de desconto que equivale a R$"+valorDesconto+". Totalizando o valor de R$"+deconto10+".");
        } else if (valorCompra>=300) {
            System.out.println("Sua compra ficou no valor de R$"+valorCompra+". Você ganhou 20% de desconto, que equivale a R$"+valorDesconto20+". totalizando o valor de R$"+deconto20);

        }
    }
}
