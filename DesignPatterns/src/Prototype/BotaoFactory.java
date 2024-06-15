package Prototype;

public class BotaoFactory {

    public static Botao getInstance(Botao prototipo){
        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setTipoBorda(prototipo.getTipoBorda());
        return clone;
    }
}
