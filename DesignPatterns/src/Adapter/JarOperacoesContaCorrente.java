package Adapter;

import java.math.BigDecimal;

// para efeitos didáticos, considerar essa classe um JAR externo que não se pode modificar

public class JarOperacoesContaCorrente {
    public boolean validarSaldo(BigDecimal valorPretendido){
        System.out.println("Validando o saldo");
        return true;
    }

    public void saca (BigDecimal valorPretendido){
        System.out.println("Sacando... ");
    }

    public void deposita(BigDecimal valorPretendido) {
        System.out.println("Depositando... ");
    }
}
