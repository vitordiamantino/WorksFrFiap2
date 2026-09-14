import java.util.Arrays;
import java.util.List;

public class Exemplo {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Ana", "Maria", "Bento", "Judite");

        List<String> nova = lista.stream()
                .filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toUpperCase())
                .toList();

        System.out.println(nova);


    }
}
