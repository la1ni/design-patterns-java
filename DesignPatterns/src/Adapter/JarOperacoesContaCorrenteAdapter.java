package Adapter;

import java.math.BigDecimal;

// para utilizar a classe JOCC adaptando alguns métodos. nesse caso, por exemplo, a validação de saldo é feita antes do método sacar. O cliente implementará os métodos de um objeto daqui

public class JarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrente jarConta;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }

    public void saca (BigDecimal valorPretendido){
        if (jarConta.validarSaldo(valorPretendido)){
            jarConta.saca(valorPretendido);
        } else {
            throw new IllegalArgumentException("Valor não permitido para saque");
        }

    }

    public void deposita(BigDecimal valorPretendido) {
        jarConta.deposita(valorPretendido);
    }
}
