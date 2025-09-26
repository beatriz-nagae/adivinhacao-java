import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Integer tentativas = 0;
       Integer numeroCerto = 0;
       Integer numeroDado = 0;

       Random random = new Random();
      Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Seja bem vindo ao jogo da Adivinhação");
        System.out.println("Na sorte, você se garante?");
        System.out.println("Agora, digite um numero de 1 a 100");

       while(numeroDado.equals(numeroCerto) || tentativas <= 5)
             numeroCerto = random.nextInt(100);

            if(numeroDado == numeroCerto){
                System.out.println("Arrasou! Acertou mesmo!");
            }
            else {
                System.out.println("tente de novo :c");
                 tentativas = tentativas + 1;
            }
        }
    }
