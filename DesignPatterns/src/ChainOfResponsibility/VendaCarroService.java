package ChainOfResponsibility;

import java.math.BigDecimal;

public class VendaCarroService {

    public BigDecimal calcularValorVenda(Carro carro){

        DescontoCarro desconto = new DescontoCarroFIAT(
                new DescontoCarroFORD(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDireitoADesconto(null))));

        return desconto.aplicaDesconto(carro);
    }
}
