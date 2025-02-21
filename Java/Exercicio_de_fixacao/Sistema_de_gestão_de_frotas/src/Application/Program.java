package Application;

import entities.Carro;
import entities.Motorista;
import entities.Veiculo;

public class Program {

    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC-1234", "Honda Civic", 2020, "Gasolina", null);
        Motorista motorista = new Motorista("Carlos Silva", "123456789", carro);

        motorista.atribuirVeiculo(carro);
        motorista.exibirDetalhes();
        

        motorista.removerVeiculo();
        motorista.exibirDetalhes();
    }
}
