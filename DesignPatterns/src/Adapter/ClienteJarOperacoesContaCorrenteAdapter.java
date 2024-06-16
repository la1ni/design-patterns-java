package Adapter;
import java.math.BigDecimal;


// basicamente aqui serão repassadas as operações da classe JarAdapter. serve para manipular uma biblioteca fechada, como seria o caso da JOOC
public class ClienteJarOperacoesContaCorrenteAdapter {

    private JarOperacoesContaCorrenteAdapter jarContaAdapter;

    public ClienteJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarContaAdapter){
        this.jarContaAdapter = jarContaAdapter;
    }

    public void sacar(BigDecimal valorPretendido){jarContaAdapter.saca(valorPretendido);}

    public void depositar(BigDecimal valorPretendido) {jarContaAdapter.deposita(valorPretendido);}
}
