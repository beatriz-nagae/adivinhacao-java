import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = 0;

        System.out.println("Digite um Número inteiro");
        numeroDigitado = scanner.nextInt();

        if(numeroDigitado > 0){
            System.out.println("Seu número é positivo. Goodbye antidepressants!");
        }
else {
            System.out.println("Oh, Shoosh! Seu numero ta muito negativo... melhor leva-lo ao analista!");
        }
        scanner.close();
    }

}
