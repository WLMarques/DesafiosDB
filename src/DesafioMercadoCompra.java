import java.util.Scanner;

public class DesafioMercadoCompra {
    public static void main(String[] args) {

        System.out.printf("Bem vindo ao Mercado %nEscolha uma das opções" +
                "%n1- Refrigerante" +
                "%n2- Água" +
                "%n3- Cerveja" +
                "%n Escolha: %n");

        Scanner ler = new Scanner(System.in);

        int escolha;
        int idade;
        escolha = ler.nextInt();

        switch(escolha) {
            case 1:
                System.out.println("Aqui está seu Refrigerante");
                break;
            case 2:
                System.out.println("Aqui está sua Água");
                break;
            case 3:
                System.out.println("Informe a idade");
                //Vai pegar o valor da idade
                idade = ler.nextInt();
                if (idade < 18){
                    System.out.println("Você é menor de idade para comprar Cerveja");
                }else
                    System.out.println("Aqui está sua Cerveja");
                break;
            default:
                System.out.println("Escolha incorreta");
        }

    }
}