import java.util.Scanner;
public class PrimeriaAula {
    public static void main(String[] args){
        String nome;
        int idade;
        double altura;
        String cargo;
        String periodo;
        
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2  = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        Scanner entrada5 = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        nome = entrada1.nextLine();
        System.out.println("Digite sua idade: ");
         idade = entrada2.nextInt();
        System.out.println("Digite sua altura: ");
         altura = entrada3.nextDouble();
        System.out.println("Digite seu cargo:  ");
         cargo = entrada4.nextLine();
        System.out.println("Digite seu periodo do curso:  ");
         periodo = entrada5.nextLine();

         System.out.println(
         "Suas informações: \n" +
                 "Nome: "+nome +"\n"+
                 "Idade: "+idade+"\n"+
                 "Altura: "+altura+"\n"+
                 "Cargo: "+cargo+"\n"+
                 "Periodo: "+periodo+"\n");







    }




}
