import java.util.Scanner;

public class Soma_vetor {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de valores");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            System.out.println();
        }
        System.out.println("Valores: ");
        for(int i=0; i <n; i++){
            System.out.println(vetor[i]);
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vetor[i];
        }
        System.out.println("Soma=" + sum);

        double media = (sum / n);

        System.out.println("Media = "+ media);


        sc.close();
    }
}