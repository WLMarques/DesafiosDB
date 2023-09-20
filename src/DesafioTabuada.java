import java.util.Scanner;

public class DesafioTabuada {

    public static void main(String[] args) {


        int num, contador = 0, tabuada;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Bem vindo ao programa de Tabuada%n" +
                "Informe um número entre 1 e 10, caso informe diferente, será solicitado novamente%n");
        num = ler.nextInt();

        while (num < 1 || num > 10) {
            System.out.println("Precisa ser um número entre 1 e 10");
            num = ler.nextInt();
        }
        System.out.println("Você verá a tabuada do: "+num);
        while (contador <= 10){
            tabuada = num * contador;
            System.out.println(tabuada);
            contador++;
        }
    }
}
