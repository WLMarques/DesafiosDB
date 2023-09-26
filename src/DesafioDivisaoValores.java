import java.util.Scanner;

public class DesafioDivisaoValores {

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        float num1,num2, resultado = 0;
        String sair;



        do {

            System.out.println("Informe o primeiro número");
            num1 = ler.nextFloat();
            System.out.println("Informe o segundo número");
            num2 = ler.nextFloat();

            if (num2 != 0){

                resultado = (float) num1 / num2;
                System.out.printf("Numero 1:  %.2f número 2:  %.2f   %n", num1, num2);
                System.out.println("O resultado da divisão é:  " + resultado);
                break;

            }else if (num2 == 0) {

                System.out.println("Não é possível informar zero, informe outro número: ");
                num2 = ler.nextFloat();

                resultado = (float) num1 / num2;
                System.out.printf("Numero 1:  %.2f número 2:  %.2f   %n", num1, num2);
                System.out.println("O resultado da divisão é:  " + resultado);

            }
            System.out.println("Deseja realizar outro cálculo? 'S' ou 'N' ");
            sair = ler.next();



        }while (sair.equals("S"));

        System.out.println("Programa encerrado");






    }
}
