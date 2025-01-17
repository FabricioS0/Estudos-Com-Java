import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        List <String> list = new ArrayList<>(); 

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        //Exibe a quantidade de elementos da lista
        System.out.println(list.size());
        // remove o item especifico da lista
        list.remove("Anna");
        list.remove("Alex");


        //imprime cada elemento da lista 
        for (String x : list){
            System.out.println(x);
        }

        list.remove(1);

        //remove por predicato
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list){
            System.out.println(x);
        }

        //diz quantos Bob tem na lista
        System.out.println("Index of bob: " + list.indexOf("Bob"));

        //Fazendo isso você imprime apenas nomes com a determinada letra escolhida
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        //Encontrar o elemento na qual encontre o determinado elemento 
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        };

    }
