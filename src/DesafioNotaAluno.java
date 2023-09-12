import java.util.Scanner;

public class DesafioNotaAluno {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        float nota1, nota2, nota3, notafinal = 0;

        System.out.println("Informe o nome do(a) Aluno(a)");
        nome = ler.nextLine();
        System.out.println("Informe a nota do primeiro trimestre do(a) aluno(a) " +nome);
        nota1 = ler.nextFloat();
        System.out.println("Informe a nota do segundo trimestre do(a) aluno(a) " +nome);
        nota2 = ler.nextFloat();
        System.out.println("Informe a nota do terceiro trimestre do(a) aluno(a) " +nome);
        nota3 = ler.nextFloat();

        notafinal = ((nota1 + nota2 + nota3) /3);

        if (notafinal >= 7){
            System.out.printf("O(a) aluno(a) %s está aprovado(a) pois ficou acima da média, sua nota final foi %.2f"
                    , nome, notafinal);
        }else if (notafinal >= 5 && notafinal < 7){
            System.out.printf("O(a) aluno(a) %s está em recuperação pois ficou abaixo da média, sua nota final foi %.2f"
                    , nome, notafinal);
        }else
            System.out.printf("O(a) aluno(a) %s está reprovado(a) pois ficou abaixo da média, sua nota final foi %.2f"
                    , nome, notafinal);
    }
}