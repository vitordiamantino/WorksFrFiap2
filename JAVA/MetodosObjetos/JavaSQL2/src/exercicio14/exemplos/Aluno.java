package exercicio14.exemplos;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int rm;

    public Aluno(String nome, int rm) {
        this.nome = nome;
        this.rm = rm;
    }

    @Override
    public String toString() {
        return rm + " " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }


    @Override
    public int compareTo(Aluno o) {
        return 0;
    }
}
