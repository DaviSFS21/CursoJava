import java.util.Objects;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;
        int i;
        int num1;
        int result = 1;
        String str;

        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.println("A soma dos valores é:" + soma);

        System.out.println("Digite um número para calcular seu fatorial: ");
        num1 = sc.nextInt();

        for(i = 1; i <= num1; i++){
            result *= i;
        }
        System.out.println(num1 + "! = " + result);

        do{
            System.out.println("Digite \"sair\" para encerrar o código");
            str = sc.next();
        } while (!Objects.equals(str, "sair"));
    }
}
