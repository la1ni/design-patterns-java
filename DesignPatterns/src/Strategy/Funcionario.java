package Strategy;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private BigDecimal salario;
    private TipoContratacaoEnum contratacaoEnum;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoContratacaoEnum getContratacaoEnum() {
        return contratacaoEnum;
    }

    public void setContratacaoEnum(TipoContratacaoEnum contratacaoEnum) {
        this.contratacaoEnum = contratacaoEnum;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", contratacaoEnum=" + contratacaoEnum +
                '}';
    }
}
