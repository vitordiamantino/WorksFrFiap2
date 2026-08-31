public class Candidato {
    private String nome;
    private double notaTecnica;
    private int anosExperiencia;

    public Candidato(String nome, double notaTecnica,  int anosExperiencia) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.notaTecnica = notaTecnica;
    }

    @Override
    public String toString() {
        return nome + " - " + anosExperiencia + " - " + notaTecnica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaTecnica() {
        return notaTecnica;
    }

    public void setNotaTecnica(double notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}
