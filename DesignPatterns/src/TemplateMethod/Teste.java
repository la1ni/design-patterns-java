package TemplateMethod;

public class Teste {
    public static void main(String[] args) {

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDeDano(60);

        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDeDano(80);

        ReparoVeiculoService reparaLuxo = new ReparaVeiculoDeLuxoService(veiculoDeLuxo);
        reparaLuxo.reparaVeiculo();

        ReparoVeiculoService reparaComum = new ReparaVeiculoComumService(veiculoComum);
        reparaComum.reparaVeiculo();
    }
}
