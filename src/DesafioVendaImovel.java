import java.util.Scanner;

public class DesafioVendaImovel {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nomeimovel;
        double valorimovel, comissao;

        System.out.printf("Bem vindo ao seu sistema de imóveis, para prosseguir, informe o %n" +
                "imóvel que quer vender e qual o valor respectivo dele, após isso será %n" +
                "informado o valor da sua comissão%n");
        System.out.println("Informe qual é o imóvel que foi vendido: ");
        nomeimovel = ler.nextLine();
        System.out.println("Informe o valor do imóvel vendido: ");
        valorimovel = ler.nextDouble();


        if (valorimovel >= 50000){
            comissao = valorimovel * 0.20;
            System.out.printf("Imóvel %s vendido por R$ %.2f, sua comissão foi de 20 por cento: R$ %.2f", nomeimovel,valorimovel, comissao);
        }else if (valorimovel >= 30000 && valorimovel < 50000){
            comissao = valorimovel * 0.15;
            System.out.printf("Imóvel %s vendido por R$ %.2f, sua comissão foi de 15 por cento: R$ %.2f", nomeimovel,valorimovel, comissao);
        }else
        comissao = valorimovel * 0.10;
        System.out.printf("Imóvel %s vendido por R$ %.2f, sua comissão foi de 10 por cento: R$ %.2f", nomeimovel,valorimovel, comissao);
    }
}