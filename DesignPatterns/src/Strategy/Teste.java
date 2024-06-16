package Strategy;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setContratacaoEnum(TipoContratacaoEnum.CLT);
        funcionarioCLT.setNome("Clóvis");
        funcionarioCLT.setSalario(BigDecimal.valueOf(1200.00));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setContratacaoEnum(TipoContratacaoEnum.CNPJ);
        funcionarioPJ.setNome("Cláudio");
        funcionarioPJ.setSalario(BigDecimal.valueOf(2000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setContratacaoEnum(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setNome("Claudiane");
        funcionarioEstagio.setSalario(BigDecimal.valueOf(1900.00));

        ReajusteAnualSalarioComStrategy reajuste = new ReajusteAnualSalarioComStrategy();

        reajuste.reajusteAnualSalario(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajuste.reajusteAnualSalario(funcionarioPJ, new CalculadorReajusteAnualSalarioCnpj());
        reajuste.reajusteAnualSalario(funcionarioEstagio, new CalculadorReajusteAnualSalarioEstagio());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }
}
