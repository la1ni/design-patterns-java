package ChainOfResponsibility;

import java.math.BigDecimal;

public class DescontoCarroFIAT extends DescontoCarro {

    public DescontoCarroFIAT(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }

    // encadeamento de descontos. se for FIAT ele aplica essse. Independente, é chamado o próximo
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda  = carro.getPreco();
        if (Marca.FIAT.equals(carro.getMarca())){
            carro.setPreco(valorVenda.subtract(new BigDecimal(1000)));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
