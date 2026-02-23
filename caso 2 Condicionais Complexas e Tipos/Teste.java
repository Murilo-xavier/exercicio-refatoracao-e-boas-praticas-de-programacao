public class Teste {
    public static void main(String[] args) {
        System.out.println("\n\t---- TESTE GERENTE ----");

        Funcionario funcionarioGerente = new Funcionario("João", 5000.0, 8, 0.85, false, TipoCargo.GERENTE);
        CalculadoraDeBonus calculadora = new CalculadoraDeBonus();
        double bonus = calculadora.calcularBonusAnual(funcionarioGerente);
        System.out.println("O Salario de " + funcionarioGerente.getNome() + " é: " + funcionarioGerente.getSalario());
        System.out.println("O bônus anual de " + funcionarioGerente.getNome() + " é: " + bonus);

        System.out.println("\n\t---- TESTE OPERADOR ----");

        Funcionario funcionarioOperador = new Funcionario("Maria", 3000.0, 12, 0.90, false, TipoCargo.OPERADOR);
        bonus = calculadora.calcularBonusAnual(funcionarioOperador);
        System.out.println("O Salario de " + funcionarioOperador.getNome() + " é: " + funcionarioOperador.getSalario());
        System.out.println("O bônus anual de " + funcionarioOperador.getNome() + " é: " + bonus);

        System.out.println("\n\t---- TESTE DIRETOR ----");

        Funcionario funcionarioDiretor = new Funcionario("Carlos", 6000.0, 12, 0.95, false, TipoCargo.DIRETOR);
        bonus = calculadora.calcularBonusAnual(funcionarioDiretor);
        System.out.println("O Salario de " + funcionarioDiretor.getNome() + " é: " + funcionarioDiretor.getSalario());
        System.out.println("O bônus anual de " + funcionarioDiretor.getNome() + " é: " + bonus);

        System.out.println("\n\t---- TESTE FUNCIONARIO SEM DIREITO A BONUS ----");

       Funcionario funcionarioSemBonus = new Funcionario("pedro", 3000.0, 2, 0.90, true, TipoCargo.OPERADOR);
        bonus = calculadora.calcularBonusAnual(funcionarioSemBonus);
        System.out.println("O Salario de " + funcionarioSemBonus.getNome() + " é: " + funcionarioSemBonus.getSalario());
        System.out.println("O bônus anual de " + funcionarioSemBonus.getNome() + " é: " + bonus); 
    }
}
