package Strategy;

import java.math.BigDecimal;

public class CalculadorReajusteAnualSalarioCnpj implements CalculadorReajusteAnualSalario{

    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(BigDecimal.valueOf(0.05))));
    }
}
