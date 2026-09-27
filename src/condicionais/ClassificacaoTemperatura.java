package condicionais;
import java.util.Scanner;


public class ClassificacaoTemperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura do dia de hoje ? ");
        double temp = scanner.nextDouble();

        scanner.close();

        if(temp <= 15 ){
            System.out.println("Hoje está deveras frio");
        } else if (temp <= 25){
            System.out.println("Hoje está com o clima agradavél");
        } else {
            System.out.println("Hojé está quente para um caramba");
        }
    }
}
