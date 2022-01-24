import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<String> produtos = new HashSet<>(); //implementacao mais rapida, mas nao tem ordenacao
        Set<String> produtos2 = new TreeSet<>(); //Ordena os dados, mas possui ordenacao
        Set<String> produtos3 = new LinkedHashSet<>(); //Mantem a ordem de insercao em que os itens foram inseridos

        produtos.add("TV");
        produtos.add("Tablet");
        produtos.add("Notebook");
        produtos.add("Computador");

        produtos.remove("Tablet"); //Removendo um item do conjunto

        produtos.removeIf(x -> x.contains("Notebook")); //Remove com condicao que recebe um predicado

        for (String string : produtos) {
            System.out.println(produtos);
        }
    }
}
