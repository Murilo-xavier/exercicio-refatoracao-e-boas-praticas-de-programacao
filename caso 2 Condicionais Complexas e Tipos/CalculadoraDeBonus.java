public class CalculadoraDeBonus {
    
    private static final int TEMPO_MINIMO_MES = 6;
    private static final double META_MINIMA = 0.80;

    public double calcularBonusAnual (Funcionario funcionario){
        double bonus = 0.0;

        boolean tempoMinimoComprido = funcionario.getMesesTrabalhados() > TEMPO_MINIMO_MES;
        boolean bateuMeta = funcionario.getMetaParcialPorcentagem() >= META_MINIMA;
        boolean semAdvertencia = !funcionario.isPossuiAdivertencia();

        if(tempoMinimoComprido && bateuMeta && semAdvertencia){
            TipoCargo cargo = funcionario.getCargo();
            bonus = funcionario.getSalario() * cargo.getMultiplicador() + cargo.getBonusFixo();
        }
        return bonus;
    }
}
