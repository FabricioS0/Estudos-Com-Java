package entities;
public class Caminhao extends Veiculo{
    private Double tonelada;

    public Caminhao(String placa, String modelo, int ano, String status, Double tonelada) {
        super(placa, modelo, ano, status);
        this.tonelada = tonelada;
    }

    public Double getTonelada() {
        return tonelada;
    }

    public void setTonelada(Double tonelada) {
        this.tonelada = tonelada;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Toneladas: " + tonelada);
    }
}
