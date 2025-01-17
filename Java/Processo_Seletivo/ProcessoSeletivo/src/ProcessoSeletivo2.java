import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {

    public static void main(String[] args) {
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        double salarioBase = 2000.00;
        List<String> selecionados = new ArrayList<>();

        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            if (salarioPretendido <= salarioBase && selecionados.size() < 5) {
                selecionados.add(candidato);
            }
        }

        
        System.out.println("Candidatos selecionados:");
        for (String candidato : selecionados) {
            System.out.println(candidato);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}