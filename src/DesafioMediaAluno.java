import java.util.Scanner;

public class DesafioMediaAluno {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String sair, nome;
        float nota1,nota2,notafinal;

        do {
            System.out.println("Informe o nome do(a) Aluno(a)");
            nome = ler.next();
            System.out.println("Informe a nota do primeiro semestre do(a) aluno(a) " +nome);
            nota1 = ler.nextFloat();
            System.out.println("Informe a nota do segundo semestre do(a) aluno(a) " +nome);
            nota2 = ler.nextFloat();

            notafinal = ((nota1 + nota2) /2);

            if (notafinal >= 7){
                System.out.printf("O(a) aluno(a) %s está aprovado(a) pois ficou acima da média," +
                                " sua nota final foi %.2f %n"
                        , nome, notafinal);
            }else if (notafinal < 7){
                System.out.printf("O(a) aluno(a) %s está reprovado(a) pois ficou abaixo da média," +
                                " sua nota final foi %.2f %n"
                        , nome, notafinal);
            }

            System.out.println("Deseja realizar outro cálculo? 'S' ou 'N' ");
            sair = ler.next();
        }while(sair.equals("S"));

        System.out.println("Programa Finalizado");


    }
}
