import java.util.Scanner;

public class estrutura_enquanto {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {

            System.out.println("Senha invalida! ");

            System.out.print("Digite a senha novamente: ");
            senha = sc.nextInt();
            
        }
        System.out.println("Acesso Permitido! ");

        sc.close();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de combustivel que você mais utiliza:\n 1.alcool \n 2.Gasolina \n 3.Diesel \n 4.Sair da pesquisa");
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo !=4) {
            if (tipo== 1){
                alcool +=1;
            }else if (tipo == 2){
                gasolina +=1;
            }else if (tipo == 3){
                diesel +=1;
            }

            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
