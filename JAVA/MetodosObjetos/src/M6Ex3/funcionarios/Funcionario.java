package M6Ex3.funcionarios;

public class Funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private double salarioBase;
    private double percentualBonus;
    private boolean ativo;

    public Funcionario(String matricula, String nome, String cargo, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.ativo = true;
    }
    public double calcularSalarioLiquido(){
        return salarioBase + percentualBonus * 0.15;

    }

    public boolean aplicarAumento(double percentual){

    }

    public void aplicarBonus(double percentual){

    }

    public void desligar(){
        this.ativo = false;
        this.percentualBonus = 0;
    }

    public boolean isAtivo() {
        return ativo;
    }



    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
