package ChainOfResponsibility;

import java.math.BigDecimal;

public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro {

    public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }


    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda  = carro.getPreco();
        System.out.println("Moranguinho");
        if (carro.getPreco().compareTo(new BigDecimal(100000)) == 1 ){
            carro.setPreco(valorVenda.subtract(new BigDecimal(10000)));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
