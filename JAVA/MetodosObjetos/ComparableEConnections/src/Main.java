import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Maria", 9, 20));
        lista.add(new Candidato("Ana", 9, 20));
        lista.add(new Candidato("Gigi", 3.5, 1));
        lista.add(new Candidato("Vitor", 4, 15));

        lista.sort(Comparator.comparing(Candidato::getNotaTecnica)
                .thenComparing(Candidato::getAnosExperiencia)
                .thenComparing(Candidato::getNome));

        lista.forEach(candidato -> {
            System.out.println(candidato);
        });
    }
}