package exercicio14.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno("Vitinho", 25));
        lista.add(new Aluno("Vitao", 24));
        lista.add(new Aluno("Vitor", 23));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

        //ordenação usando o método compareTO da interface COMPARABLE

        Collections.sort(lista);
        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

        //ordenação usando critério lambda

        System.out.println();
        lista.sort(Comparator.comparing(Aluno::getRm).thenComparing(Comparator.comparing(Aluno::getNome)));
        lista.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
