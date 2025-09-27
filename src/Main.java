import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tentativas = 0;
        final int maxTentativas = 5;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroCerto = random.nextInt(100) + 1; // número entre 1 e 100

        System.out.println("Olá! Seja bem-vindo ao jogo da Adivinhação!");
        System.out.println("Na sorte, você se garante?");
        System.out.println("Tente adivinhar o número de 1 a 100.");

        boolean acertou = false;

        while (tentativas < maxTentativas && !acertou) {
            System.out.print("Digite seu palpite: ");
            int numeroDado = scanner.nextInt();

            if (numeroDado == numeroCerto) {
                System.out.println("Arrasou! Acertou mesmo!");
                acertou = true;
            } else {
                System.out.println("Tente de novo :c");
                tentativas++;
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número era: " + numeroCerto);
        }

        scanner.close();
    }
}