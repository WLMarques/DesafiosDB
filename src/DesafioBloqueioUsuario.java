import java.util.Scanner;

public class DesafioBloqueioUsuario {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String login, senha;
        int tentativa = 1;

        do {
            System.out.println("Informe o login");
            login = ler.nextLine();
            System.out.println("Informe a senha");
            senha = ler.nextLine();

            if (login.equals("aluno") && senha.equals("segredo")){
                System.out.println("Bem vindo");
                break;
            }if (login != "aluno" && senha != "segredo"){
                System.out.printf("Não foi possível realizar o login, tente novamente%n" +
                        "Se você informar errado 3 vez(es), será bloqueado seu usuário%n");
                System.out.println("Tentativa número: "+tentativa);
                tentativa++;
                if (tentativa == 4){
                    System.out.println("Login bloqueado");
                    break;
                }
            }
        }while (login != "aluno" && senha != "segredo");

    }
}
