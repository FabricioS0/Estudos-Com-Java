import java.util.Scanner;

public class Alturas {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Quantas pessoas seram inseridas: ");
         int n = sc.nextInt();
         
         String[] nomes = new String[n];
         int[] idades = new int[n];
         double[] alturas = new double[n];

         for(int i = 0; i < n; i++){
            System.out.println("Digite os dados da "+ (i+1) + "º pessoa:");
            System.out.print("Digite o nome da pessoa: ");
            nomes[i] = sc.next();
            System.out.println();
            System.out.print("Digite a idade: ");
            idades[i] = sc.nextInt();
            System.out.println();
            System.out.print("Digite a altura: ");
            alturas[i] = sc.nextDouble();
            System.out.println();
         }

         double soma = 0.0;
         for(int i=0; i<n; i++){
            soma = soma + alturas[i];
         }
         double media = soma / n;

         int cont = 0;
         System.out.println("Altura media: " + media);
         for(int i = 0; i < n; i++){
            if(idades[i] < 16){
                cont = cont + 1;
            }
         }
         double percentual = cont * 100.00 / n;
         System.out.println("Pessoas com menos de 16 anos são: "+ percentual + "%");

         sc.close();
    }
}


