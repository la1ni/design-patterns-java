package ChainOfResponsibility;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {

        Carro carroFiat = new Carro();
        carroFiat.setMarca(Marca.FIAT);
        carroFiat.setModelo("Palio");
        carroFiat.setPreco(new BigDecimal(15000));

        Carro carroFord = new Carro();
        carroFord.setMarca(Marca.FORD);
        carroFord.setModelo("Fusion");
        carroFord.setPreco(new BigDecimal(120000));

        Carro carroChevrolet = new Carro();
        carroChevrolet.setMarca(Marca.CHEVROLET);
        carroChevrolet.setModelo("Astra");
        carroChevrolet.setPreco(new BigDecimal(12000));

        VendaCarroService venda = new VendaCarroService();

        System.out.println(venda.calcularValorVenda(carroChevrolet));
        System.out.println(venda.calcularValorVenda(carroFiat));
        System.out.println(venda.calcularValorVenda(carroFord));

    }
}
