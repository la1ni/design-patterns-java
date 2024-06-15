package Prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {

    // tem como um atributo um objeto da prórpia classe, gatantindo que só exista uma instância
    private static BotaoRegistry botaoRegistry;

    // vai registrar os protótipos criados
    private static Map<String, Botao>   REGISTRY = new HashMap<>();

    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setTipoBorda("Tracejada");

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setTipoBorda("Reta");

        Botao botaoVerde = new Botao();
        botaoVerde.setCor("Verde");
        botaoVerde.setTipoBorda("Transparente");

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
        REGISTRY.put("BOTAO_VERDE", botaoVerde);
    }

    // padrão singletonLAZY
    public static BotaoRegistry getInstance(){
        if (Objects.isNull(botaoRegistry)) {
            botaoRegistry = new BotaoRegistry();
            return botaoRegistry;
        }
        return botaoRegistry;
    }

    // necessária a criação de uma factory
    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    // para adicionar ao registro
    public static void addRegistry(String chave, Botao botao){
        REGISTRY.put(chave, botao);
    }
}
