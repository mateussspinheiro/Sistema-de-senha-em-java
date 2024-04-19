import java.util.Scanner;

public class main {

    public static void menu(){
        System.out.println("===MENU===");
        System.out.println("1 - entrar");
        System.out.println("2 - Trocar a senha");
        System.out.println("3 - sair");
        System.out.println("Opcao: ");
    }

    public static int verificasenha(int senha, int senhadigitada){
        if(senha == senhadigitada){
            senha = 0;
        }
        else{
            senha = 1;
        }

        return senha;
    }

    public static int trocarsenha(int senha){
        Scanner scanner = new Scanner(System.in);
        int novasenha = 0;
        System.out.println("Digite a nova senha: ");
        senha = scanner.nextInt();
        scanner.nextLine();
        return senha;
    }
    public static void main(String[] argumento){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int senha = 0, senhadigitada = 0;
        int resultado = 0;

        System.err.println("Digite a senha: ");
        senha = scanner.nextInt();
        scanner.nextLine();

        while(opcao != 3){
            
            menu();
           
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite a senha: ");
                    senhadigitada = scanner.nextInt();
                    scanner.nextLine();

                    resultado = verificasenha(senha, senhadigitada);
                    if(resultado == 0){
                        System.out.println("SENHA CORRETA!!!");
                    }
                    else{
                        System.out.println("SENHA INCORRETA");
                    }
                    break;
                
                case 2:
                    resultado = verificasenha(senha, senhadigitada);
                    System.out.println("Digite a senha: ");
                    senhadigitada = scanner.nextInt();
                    scanner.nextLine();

                    if(resultado == 0){
                        senha = trocarsenha(senha);
                        System.out.println("Senha alterada com sucesso!");
                    }
                    else{
                        System.out.println("SENHA INCORRETA");
                    }
                    break;
                
                case 3:
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }
        }
    }
}