import java.util.Scanner;

public class ExercicioRepeticao {
    public static void main(String[] args){
        int numero;
        int total = 0;
        int opcao;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            total += numero;

            do {
                System.out.printf("Deseja realizar outra soma?%n1 - Sim%n0 - Não%n");
                opcao = sc.nextInt();
            } while (opcao > 1 | opcao < 0);

            if (opcao == 1) {
                System.out.println("O resultado até agora é: " + total);
            } else {
                System.out.println("O resultado final foi: " + total);
            }

        }while(opcao != 0);
    }
}
