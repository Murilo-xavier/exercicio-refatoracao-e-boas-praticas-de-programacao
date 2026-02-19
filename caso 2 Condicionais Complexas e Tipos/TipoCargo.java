public enum TipoCargo {

    DIRETOR(4,5000),
    GERENTE(3,3000),
    OPERADOR(1,0);

    private int multiplicador;
    private double bonusFixo;

    TipoCargo(int multiplicador, double bonusFixo) {
        this.multiplicador = multiplicador;
        this.bonusFixo = bonusFixo;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public double getBonusFixo() {
        return bonusFixo;
    }
}
