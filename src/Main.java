import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxTentativas = 5;
        boolean jogarNovamente;

        do {
            int numeroCerto = random.nextInt(100) + 1; // número entre 1 e 100
            int tentativas = 0;
            boolean acertou = false;

            System.out.println("\n === JOGO DA ADIVINHAÇÃO === ");
            System.out.println("Estou pensando em um número de 1 a 100...");
            System.out.println("Você tem " + maxTentativas + " tentativas!");
            System.out.println("----------------------------------");

            while (tentativas < maxTentativas && !acertou) {
                System.out.print("Digite seu palpite: ");
                int numeroDado = scanner.nextInt();
                tentativas++;

                if (numeroDado == numeroCerto) {
                    System.out.println("🎉 Arrasou! Você acertou em " + tentativas + " tentativa(s)!");
                    acertou = true;
                } else if (numeroDado < numeroCerto) {
                    System.out.println("🔼 Dica: O número é MAIOR!");
                } else {
                    System.out.println("🔽 Dica: O número é MENOR!");
                }

                System.out.println("Tentativas restantes: " + (maxTentativas - tentativas));
                System.out.println();
            }

            if (!acertou) {
                System.out.println("💀 Suas tentativas acabaram!");
                System.out.println("O número correto era: " + numeroCerto);
            }

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            jogarNovamente = scanner.next().equalsIgnoreCase("s");

        } while (jogarNovamente);

        System.out.println("\nObrigado por jogar! 🎮❤️");
        scanner.close();
    }
}
