public class Funcionario {
    private TipoCargo tipoCargo;
    private double salario;
    private int MesesTrabalhados;
    private double metaParcialPorcentagem;
    private boolean possuiAdivertencia;

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
