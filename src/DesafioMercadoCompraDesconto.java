import java.util.Scanner;

public class DesafioMercadoCompraDesconto {
    public static void main(String[] args) {

        System.out.printf(" 1- Tomate R$ 5,00" +
                "%n 2- Alface R$ 1,00" +
                "%n 3- Repolho R$ 2,00%n");

        Scanner ler = new Scanner(System.in);
        int escolha, qtditem = 0;
        String item = "";
        double valoritem = 0, total = 0, valordescontado = 0;
        escolha = ler.nextInt();


            switch (escolha){
                case 1:
                    System.out.println("Quantos Tomates você vai querer?");
                    qtditem = ler.nextInt();
                    item = "Tomate";
                    break;
                case 2:
                    System.out.println("Quantos Alfaces você vai querer?");
                    qtditem = ler.nextInt();
                    item = "Alface";
                    break;
                case 3:
                    System.out.println("Quantos Repolhos você vai querer?");
                    qtditem = ler.nextInt();
                    item = "Repolho";
                    break;
                default:
                    System.out.println("Opção incorreta, informe de 1 a 3");
            }
        System.out.println("Item " +item);
        System.out.println("Quantidade " +qtditem);

        //caso o item escolhido anteriormente seja o Tomate
        if (item == "Tomate"){
            valoritem = 5;
            if (qtditem <= 10) {
                total = valoritem * qtditem;
                System.out.println("O valor final do Tomate ficou: R$ "+total);
            } else if (qtditem > 10 && qtditem <= 20) {
                total = valoritem * qtditem;
                valordescontado = total * 0.1;
                total = total - valordescontado;
                System.out.println("O valor final do Tomate ficou: R$ "+total);
            } else if (qtditem > 20 && qtditem <= 50) {
                total = valoritem * qtditem;
                valordescontado = total * 0.2;
                total = total - valordescontado;
                System.out.println("O valor final do Tomate ficou: R$ "+total);
            } else if (qtditem > 50) {
                total = valoritem * qtditem;
                valordescontado = total * 0.25;
                total = total - valordescontado;
                System.out.println("O valor final do Tomate ficou: R$ "+total);
            }
            //caso o item escolhido anteriormente seja o alface

        } else if (item == "Alface") {
            valoritem = 1;
            if (qtditem <= 10) {
                total = valoritem * qtditem;
                System.out.println("O valor final do Alface ficou: R$ "+total);
            } else if (qtditem > 10 && qtditem <= 20) {
                total = valoritem * qtditem;
                valordescontado = total * 0.1;
                total = total - valordescontado;
                System.out.println("O valor final do Alface ficou: R$ "+total);
            } else if (qtditem > 20 && qtditem <= 50) {
                total = valoritem * qtditem;
                valordescontado = total * 0.2;
                total = total - valordescontado;
                System.out.println("O valor final do Alface ficou: R$ "+total);
            } else if (qtditem > 50) {
                total = valoritem * qtditem;
                valordescontado = total * 0.25;
                total = total - valordescontado;
                System.out.println("O valor final do Alface ficou: R$ "+total);
            }
            //caso o item escolhido anteriormente seja o Repolho

        } else if (item == "Repolho") {
            valoritem = 2;
            if (qtditem <= 10) {
                total = valoritem * qtditem;
                System.out.println("O valor final do Repolho ficou: R$ "+total);
            } else if (qtditem > 10 && qtditem <= 20) {
                total = valoritem * qtditem;
                valordescontado = total * 0.1;
                total = total - valordescontado;
                System.out.println("O valor final do Repolho ficou: R$ "+total);
            } else if (qtditem > 20 && qtditem <= 50) {
                total = valoritem * qtditem;
                valordescontado = total * 0.2;
                total = total - valordescontado;
                System.out.println("O valor final do Repolho ficou: R$ "+total);
            } else if (qtditem > 50) {
                total = valoritem * qtditem;
                valordescontado = total * 0.25;
                total = total - valordescontado;
                System.out.println("O valor final do Repolho ficou: R$ "+total);
            }
        }
    }
}