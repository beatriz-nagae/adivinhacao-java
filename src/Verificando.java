import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        String mensagem = "";

        if (numero1 == numero2) {
            mensagem = "Os números são iguais.";
        } else {
            mensagem = "Os números são diferentes. ";
            if (numero1 > numero2) {
                mensagem += "O primeiro número é maior.";
            } else {
                mensagem += "O segundo número é maior.";
            }
        }

        System.out.println(mensagem);

        scanner.close();
    }
}