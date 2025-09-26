import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Integer tentativas = 0;
       Integer numeroCerto;
       Integer numeroDado;


      Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Seja bem vindo ao jogo da Adivinhação");
        System.out.println("Na sorte, você se garante?");
        System.out.println("Agora, digite um numero de 1 a 100");
        scanner.nextInt(numeroDado);

        Do while(numeroDado == numeroCerto || tentativas <= 5){
            int numeroCerto = new Random().nextInt(100);


            if(numeroDado == numeroCerto){
                System.out.println("Arrasou! Acertou mesmo!");
            }
            else {
                System.out.println("tente de novo :c");
            }
        }
    }
}