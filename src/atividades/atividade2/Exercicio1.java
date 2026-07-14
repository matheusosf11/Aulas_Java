import java.util.Scanner;

public static void main(String[] args) {

    System.out.println("Digite sua idade para saber se você pode votar ou não: ");
    Scanner scanner = new Scanner(System.in);
    int idade = scanner.nextInt();

        if(idade<16){
            System.out.println("Não pode votar.");
        }else if(idade>=16 && idade<=17 || idade>=70){
            System.out.println("Voto facultativo");
        }else if(idade>=18 && idade<=70){
            System.out.println("Voto obrigatório");
        }


}
