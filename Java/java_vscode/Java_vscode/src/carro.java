
public class carro {
    private String nome;
    private int quantidade;
    private double preco;

    public carro(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getnome() {
        return nome;
    }

    public int getquantidade() {
        return quantidade;
    }

    public double getpreco() {
        return preco;
    }

    public String toString() {
        return "Veículo: " + nome + ", Quantidade Vendida: " + quantidade + ", Preço: " + preco;
    }
}
