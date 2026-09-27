package condicionais;
import java.util.Scanner;


public class ParOuImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número ");
        int num = scanner.nextInt();

        scanner.close();

        if (num %2 == 0 ){
            System.out.println("esse número é par");
        } else {
            System.out.println("esse número é impar");
        }
    }

}
