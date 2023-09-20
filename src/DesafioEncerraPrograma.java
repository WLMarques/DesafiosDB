import java.util.Scanner;

public class DesafioEncerraPrograma {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Você pode escolher qualquer número, se informar 10 o programa encerra");
            escolha = ler.nextInt();
        }while (escolha != 10);

        System.out.println("Programa encerrado");
    }
}