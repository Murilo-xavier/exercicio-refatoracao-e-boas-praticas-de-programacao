/*CLASSE CRIADA APENAS PARA AJUDAR NA LOGICA DO EXERCICIO */
public class Cliente {
    private String email;
    private int tempoFidelidade; // em anos
    private boolean possuiDebitosPendentes;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTempoFidelidade() {
        return tempoFidelidade;
    }
    public void setTempoFidelidade(int tempoFidelidade) {
        this.tempoFidelidade = tempoFidelidade;
    }
    public boolean possuiDebitosPendentes() {
        return possuiDebitosPendentes;
    }
    public void setPossuiDebitosPendentes(boolean possuiDebitosPendentes) {
        this.possuiDebitosPendentes = possuiDebitosPendentes;
    }   
}
