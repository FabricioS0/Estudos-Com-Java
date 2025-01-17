
import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BinarySearchTree bst = new BinarySearchTree();
    private static final Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar novo veículo");
            System.out.println("2. Remover veículo");
            System.out.println("3. Pesquisar veículo");
            System.out.println("4. Imprimir todos os veículos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    removerVeiculo();
                    break;
                case 3:
                    pesquisarVeiculo();
                    break;
                case 4:
                    imprimirVeiculos();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida, por favor tente novamente.");
            }
        }
    }

    private static void cadastrarVeiculo() {
        System.out.print("Nome do veículo: ");
        String name = scanner.nextLine();
        System.out.print("Quantidade Vendida: ");
        int quantitySold = scanner.nextInt();
        System.out.print("Preço: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        int key = random.nextInt(10000) + 1; 
        carro carro = new carro(name, quantitySold, price);
        bst.insert(key, carro);
        System.out.println("Veículo cadastrado com a chave: " + key);
    }

    private static void removerVeiculo() {
        System.out.print("Digite a chave do veículo a ser removido: ");
        int key = scanner.nextInt();
        scanner.nextLine(); 

        bst.remove(key);
        System.out.println("Veículo com a chave " + key + " removido (se existia)");
    }

    private static void pesquisarVeiculo() {
        System.out.print("Digite a chave do veículo a ser pesquisado: ");
        int key = scanner.nextInt();
        scanner.nextLine(); 

        carro carro = bst.search(key);
        if (carro != null) {
            System.out.println("Veículo encontrado: " + carro);
        } else {
            System.out.println("Veículo não encontrado");
        }
    }

    private static void imprimirVeiculos() {
        System.out.println("Veículos cadastrados:");
        bst.printInOrder();
    }
}
