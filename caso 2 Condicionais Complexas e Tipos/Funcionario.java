public class Funcionario {
    private TipoCargo tipoCargo;
    private double salario;
    private int tempoDeCasaMeses;
    private double metaBatida; // PORCENTAGEM (0.0 A 1.0)
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
    public int getTempoDeCasaMeses() {
        return tempoDeCasaMeses;
    }
    public void setTempoDeCasaMeses(int tempoDeCasaMeses) {
        this.tempoDeCasaMeses = tempoDeCasaMeses;
    }
    public double getMetaBatida() {
        return metaBatida;
    }
    public void setMetaBatida(double metaBatida) {
        this.metaBatida = metaBatida;
    }
    public boolean isPossuiAdivertencia() {
        return possuiAdivertencia;
    }
    public void setPossuiAdivertencia(boolean possuiAdivertencia) {
        this.possuiAdivertencia = possuiAdivertencia;
    }
}
