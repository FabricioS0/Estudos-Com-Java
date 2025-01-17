import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        scanner.close();

        System.out.println("Ola me chamo "+ nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm " );
        }
        catch( inputMismatchException e){
            System.out.println("O campos idade e altura precisam ser numericos!");
        }
    }
}

//Try e catch, muito utilizado para tratamento de erro em entrada de dados ou ao longo do codigo
