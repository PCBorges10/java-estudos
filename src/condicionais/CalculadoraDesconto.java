package condicionais;
import java.util.Scanner;


public class CalculadoraDesconto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi o valor da compra ?");
        double v = scanner.nextDouble();

        scanner.close();

        double percentualDesconto;


        if(v < 100){
            percentualDesconto = 0;

        } else if(v < 499){
            percentualDesconto = 0.10;

        } else {
            percentualDesconto = 0.20;

        }

        double desconto = v * percentualDesconto;
        double valorFinal = v - desconto;

        System.out.println("Valor original: R$ " + v);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

    }
}
