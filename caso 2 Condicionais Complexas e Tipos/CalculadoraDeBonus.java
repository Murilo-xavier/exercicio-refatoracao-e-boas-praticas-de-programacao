public class CalculadoraDeBonus {

    public double calcularBonusAnual (Funcionario f){
        if(f.getTempoDeCasaMeses() > 6 &&
         f.getMetaBatida() >= 0.80 && 
         !f.isPossuiAdivertencia()){

            if(f.getCargo().equals("DIRETOR")){
                return f.getSalario() * 4.0 + 5000;

            } else if (f.getCargo().equals("GERENTE")){
                return f.getSalario() * 2.0 + 2000;
            
            } else if (f.getCargo().equals("OPERADOR")){
                return f.getSalario() * 1;
            }
        }
        return 0.0;
    }
}
