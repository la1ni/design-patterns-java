package Prototype;

public class Botao {
    private String cor;
    private String tipoBorda;


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoBorda() {
        return tipoBorda;
    }

    public void setTipoBorda(String tipoBorda) {
        this.tipoBorda = tipoBorda;
    }

    @Override
    public String toString() {
        return "Botao{" +
                "cor='" + cor + '\'' +
                ", tipoBorda='" + tipoBorda + '\'' +
                '}';
    }
}
