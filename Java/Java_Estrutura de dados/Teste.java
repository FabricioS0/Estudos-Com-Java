import java.util.Scanner;
import java.util.Locale;

public class Teste {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    System.out.println("Entre com o numero da conta: ");
    int numConta = sc.nextInt();

    System.out.print("Nome do proprietario: ");
    sc.nextLine()
    String name = sc.nextLine();

    System.out.println("Deseja fazer um deposito inicial: (S/N)");
    char response = sc.next().charAt(0);
    if( response == S){
        System.out.println("Entre com o valor incial");
        double saldoInicial = sc.nextDouble();
        Bank conta = new Bank(name, numConta, saldoInicial);
    }
    Bank conta = new Bank(numConta, name);

    System.out.println();
    
    system.out.println();

    




    sc.close();
    
}
    
}
