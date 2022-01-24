import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union 
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b); //une os dois conjuntos
        System.out.println(c);


        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b); //retorna apenas os itens que se repetem nos dois conjuntos
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b); //remove do conjunto e todo mundo que esta no conjunto b
        System.out.println(e);
    
    }
}
