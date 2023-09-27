import java.util.Scanner;

public class DesafioValoresImpares {

    public static void main(String[] args) {



        int vetor[] = new int[10];
        int p, pegaimpar = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("informe os valores para o vetor de 10 posições");


        for (p=0 ; p<vetor.length ; p++){
            vetor[p] = ler.nextInt();
            System.out.println("Posição: " +p);
            if (vetor[p]%2!=0){
                pegaimpar = pegaimpar+1;
            }
        }

        System.out.println("Total de números ímpares no vetor: " +pegaimpar);






    }
}
