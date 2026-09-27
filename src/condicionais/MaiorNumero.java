package condicionais;
import java.util.Scanner;


public class MaiorNumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número aleatório: ");
        int num = scanner.nextInt();

        System.out.println("Escolha outro número aleatório: ");
        int num2 = scanner.nextInt();

        scanner.close();

        if(num > num2){
            System.out.println("O primeiro é maior que o segundo número escolhido");
        } else if (num2 > num){
            System.out.println("O segundo é maior que o primeiro número escolhido");
        }   else {
            System.out.println("Os números são iguais");
        }
    }
}
