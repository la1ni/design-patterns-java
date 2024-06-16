package TemplateMethod;

public class ReparaVeiculoDeLuxoService extends ReparoVeiculoService{
    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoDeLuxoService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDeDano() <= 50;
    }
}
