package entities;
public class Motorista {

    private String name;
    private String cnh;
    private Veiculo veiculoAtribuido;

    public Motorista(String name, String cnh, Veiculo veiculoAtribuido) {
        this.name = name;
        this.cnh = cnh;
        this.veiculoAtribuido = null;
    }

    public void atribuirVeiculo(Veiculo veiculo){
        if(veiculo.getStatus().equalsIgnoreCase("Disponível")){
            this.veiculoAtribuido = veiculo;
            veiculo.alterarStatus("Em Uso");
            System.out.println("Veiculo " + veiculo.getPlaca() + " atribuido a motorista: " + name);
        } else {
            System.out.println("Veiculo indisponivel! ");
        }
    }

    public void removerVeiculo(){
        if(veiculoAtribuido !=null){
            veiculoAtribuido.alterarStatus("Disponível");
            System.out.println("Veiculo " + veiculoAtribuido.getPlaca() + " removido do motorista: " + name);
            veiculoAtribuido = null;
        } else{
            System.out.println("Nenhum veiculo atribuido.");
        }

    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + name);
        System.out.println("CNH: " + cnh);

        if(veiculoAtribuido !=null){
            System.out.println("Veiculo Atribuido: ");
            veiculoAtribuido.exibirDetalhes();
        }else{
            System.out.println("Nenhum veiculo atribuido");
        }
    }
}
