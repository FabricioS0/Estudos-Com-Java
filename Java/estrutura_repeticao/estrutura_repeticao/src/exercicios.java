import java.util.Scanner;

public class exercicios{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero %2 == 0 ){
            System.out.println("par");

        } else if (numero % 2 == 1) {
            System.out.println("impar");

        } else{
            System.err.println("erro");
        }
    }
}