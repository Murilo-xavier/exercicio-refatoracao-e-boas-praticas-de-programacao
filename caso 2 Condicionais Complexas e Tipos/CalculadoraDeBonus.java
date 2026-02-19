public class CalculadoraDeBonus {
    private int TEMPO_MINIMO_MES = 6;
    private double META_MINIMA = 0.80;

    public double calcularBonusAnual (Funcionario funcionario){
        double bonus = 0.0;

        boolean tempoMinimoComprido = funcionario.getMesesTrabalhados() > TEMPO_MINIMO_MES;
        boolean metaBatidaFuncionario = funcionario.getMetaBatida() >= META_MINIMA;
        boolean semAdvertencia = !funcionario.isPossuiAdivertencia();

        if(tempoMinimoComprido && metaBatidaFuncionario && semAdvertencia){
            TipoCargo cargo = funcionario.getCargo();
            bonus = funcionario.getSalario() * cargo.getMultiplicador() + cargo.getBonusFixo();
        }
        return bonus;
    }
}
