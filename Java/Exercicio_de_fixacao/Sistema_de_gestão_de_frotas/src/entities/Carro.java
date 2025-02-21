package entities;
public class Carro extends Veiculo {

    private String tipGasolina;

    public Carro(String placa, String modelo, int ano, String status, String tipGasolina) {
        super(placa, modelo, ano, status);
        this.tipGasolina = tipGasolina;
    }

    public String getTipGasolina() {
        return tipGasolina;
    }

    public void setTipGasolina(String tipGasolina) {
        this.tipGasolina = tipGasolina;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Combustivel: " + tipGasolina);
    }
}
