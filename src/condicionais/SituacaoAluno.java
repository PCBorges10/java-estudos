package condicionais;
import java.util.Scanner;


public class SituacaoAluno {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a sua nota ? ");
        double nota = scanner.nextDouble();

        scanner.close();

        if(nota >= 7){
            System.out.println("Parabéns você foi aprovado ");
        } else if (nota >= 5 && nota < 7){
            System.out.println("Lamento, mas você está de recuperação ");
        }   else {
            System.out.println("Sorry i see you in the next semesterD");

        }
    }
}
