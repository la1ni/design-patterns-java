package ChainOfResponsibility;

import java.math.BigDecimal;

public class DescontoCarroFORD extends DescontoCarro {

    public DescontoCarroFORD(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }
    // encadeamento de descontos. se for FORD ele aplica essse. Independente, é chamado o próximo

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda  = carro.getPreco();
        if (Marca.FORD.equals(carro.getMarca())){
            carro.setPreco(valorVenda.subtract(new BigDecimal(2000)));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }

}
