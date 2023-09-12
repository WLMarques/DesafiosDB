import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        System.out.printf("Aqui é a sua calculadora, informe qual é a operação que você deseja realizar:" +
                "%n 1- Adição" +
                "%n 2- Subtração" +
                "%n 3- Multiplicação" +
                "%n 4- Divisão" +
                "%n Escolha:%n ");

        Scanner ler = new Scanner(System.in);

        int escolha;
        float num1,num2;
        escolha = ler.nextInt();

        switch(escolha) {
            case 1:
                System.out.println("Você escolheu Adição");
                System.out.println("Informe o primeiro número");
                num1 = ler.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = ler.nextFloat();

                System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1 + num2));
                break;
            case 2:
                System.out.println("Você escolheu Subtração");
                System.out.println("Informe o primeiro número");
                num1 = ler.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = ler.nextFloat();

                System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1 - num2));
                break;
            case 3:
                System.out.println("Você escolheu Multiplicação");
                System.out.println("Informe o primeiro número");
                num1 = ler.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = ler.nextFloat();

                System.out.printf("%.2f x %.2f = %.2f", num1,num2,(num1 * num2));
                break;
            case 4:
                System.out.println("Você escolheu Divisão");
                System.out.println("Informe o primeiro número");
                num1 = ler.nextFloat();
                System.out.println("Informe o segundo número");
                num2 = ler.nextFloat();

                System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1 / num2));
                break;
            default:
                System.out.println("Escolha incorreta");
        }

    }
}