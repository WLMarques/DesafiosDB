public class DesafioSomaDeValores {

    public static void main(String[] args) {

        int soma = 0;

        System.out.printf("A soma de valores inteiros existentes entre 1 e 100 é: ");
        for(int i = 1; i<=100; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}
