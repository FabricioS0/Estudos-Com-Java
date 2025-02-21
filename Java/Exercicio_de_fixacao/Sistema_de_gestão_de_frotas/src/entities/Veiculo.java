package entities;


public class Veiculo {

    private String placa;
    private String modelo;
    private int ano;
    private String status;

    
    public Veiculo(String placa, String modelo, int ano, String status) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.status = status;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getStatus() {
        return status;
    }
    public void alterarStatus(String status) {
        if (status.equalsIgnoreCase("Disponível") || 
            status.equalsIgnoreCase("Em Uso") || 
            status.equalsIgnoreCase("Em Manutenção")) {
            this.status = status;
        } else {
            System.out.println("Status inválido. Use: Disponível, Em Uso ou Em Manutenção.");
        }
    }
    
    public void exibirDetalhes(){
        System.out.println("Modelo: " + modelo + "\n" + 
        "Placa: " + placa + "\n" +
        "Ano: " + ano + "\n" +
        "Status: " + status);
    }


    
}
