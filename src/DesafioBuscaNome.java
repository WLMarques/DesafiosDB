import java.util.Arrays;
import java.util.Scanner;

public class DesafioBuscaNome {

    public static void main(String[] args) {

        String vetor[] = new String[10];
        String nome, buscavetor;
        boolean buscanome = false;
        int p;
        Scanner ler = new Scanner(System.in);

        System.out.println("informe os nomes para o vetor de 10 posições");


        for (p=0 ; p<vetor.length ; p++){
            System.out.println("Informe um nome para a posição "+p);
            vetor[p] = ler.next();
        }
        /**
        for (p=0 ; p<vetor.length ; p++){
            System.out.println("Vetor tem os seguintes nomes: " +p);
        }*/

        System.out.println("Informe um nome para buscar no vetor");
        nome = ler.next();

        for (p=0 ; p<vetor.length ; p++) {
            buscavetor = vetor[p];
            if(buscavetor.equals(nome)){
                System.out.println("Nome encontrado no vetor na posição "+p);
                buscanome = true;
                break;
            }else if (buscavetor != nome){
                System.out.println("Nome não encontrado no vetor na posição " +p);
                buscanome = false;
            }
        }

        if(buscanome == true){
            System.out.println("O nome digitado FOI encontrado no vetor");
        }else
            System.out.println("O nome digitado NÃO FOI encontrado no vetor");

    }
}
