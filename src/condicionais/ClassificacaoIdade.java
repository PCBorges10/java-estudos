package condicionais;

import java.util.Scanner;


public class ClassificacaoIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        scanner.close();

        if (idade <= 12) {
            System.out.println("Você é criança ");
        } else if (idade >= 13 && idade <= 17){
            System.out.println("Você é adolescente ");
        }      else if (idade >= 18 && idade <= 59) {
            System.out.println("Você é adulto ");
        } else {
            System.out.println("Você é idoso");
        }

    }

}
