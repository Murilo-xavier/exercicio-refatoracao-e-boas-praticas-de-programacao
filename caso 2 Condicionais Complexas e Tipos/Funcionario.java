public class Funcionario {
    private TipoCargo tipoCargo;
    private String nome;
    private double salario;
    private int MesesTrabalhados;
    private double metaParcialPorcentagem;
    private boolean possuiAdivertencia;

    public Funcionario(String nome, double salario, int mesesTrabalhados, double metaParcialPorcentagem, boolean possuiAdivertencia, TipoCargo tipoCargo) {
        this.nome = nome;
        this.salario = salario;
        this.MesesTrabalhados = mesesTrabalhados;
        this.metaParcialPorcentagem = metaParcialPorcentagem;
        this.possuiAdivertencia = possuiAdivertencia;
        this.tipoCargo = tipoCargo;
        this.possuiAdivertencia = possuiAdivertencia;
    }

    public String getNome() {
        return nome;
    }
    public TipoCargo getCargo() {
        return tipoCargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getMesesTrabalhados() {
        return MesesTrabalhados;
    }
    public void setMesesTrabalhados(int totalMesesTrabalhados) {
        this.MesesTrabalhados = totalMesesTrabalhados;
    }
    public double getMetaParcialPorcentagem() {
        return metaParcialPorcentagem;
    }
    public void setMetaParcialPorcentagem(double metaBatida) {
        this.metaParcialPorcentagem = metaBatida;
    }
    public boolean isPossuiAdivertencia() {
        return possuiAdivertencia;
    }
    public void setPossuiAdivertencia(boolean possuiAdivertencia) {
        this.possuiAdivertencia = possuiAdivertencia;
    }
}
