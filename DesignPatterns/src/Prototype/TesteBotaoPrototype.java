package Prototype;

public class TesteBotaoPrototype {
    public static void main(String[] args) {

        // exibindo botão azul que já está nos protótipos
        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        // criando, adicionando ao protótipo e exibindo botão roxo
        String chave = "BOTAO_ROXO";
        Botao botaoRoxo = new Botao();
        botaoRoxo.setTipoBorda("Tracejada");
        botaoRoxo.setCor("Roxo");
        BotaoRegistry.addRegistry(chave, botaoRoxo);
        Botao btnRoxo = BotaoRegistry.getBotao("BOTAO_ROXO");
        System.out.println(btnRoxo);

    }
}
