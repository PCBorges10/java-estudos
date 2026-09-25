import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Qual é o seu nome ? ");
        String nome = scanner.nextLine();

        System.out.println("Qual é a sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Qual é a sua altura? ");
        double altura = scanner.nextDouble();

        scanner.nextLine();//limpa o scanner

        System.out.println("Qual é a sua cidade? ");
        String cidade = scanner.nextLine();

        System.out.println("Seu nome é  " + nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Sua altura é " + altura);
        System.out.println("Sua cidade é " + cidade);

        scanner.close();


    }


}






