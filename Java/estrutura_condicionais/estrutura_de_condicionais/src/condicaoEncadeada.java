public class condicaoEncadeada {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >=7){
            System.out.println("Aprovado");

        }else if (nota >=5 && nota<7) {
            System.out.println("Aluno em recuperação");
            
        }else{
            System.out.println("Reprovado");
        }
    }
}

//Adição da variavel else if, caso a instrução não seja verdadeira ou falta, é adicionado mais uma condição.