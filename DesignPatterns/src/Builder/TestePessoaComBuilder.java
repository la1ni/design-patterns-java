package Builder;

public class TestePessoaComBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new PessoaBuilder()
                .nome("Andreia")
                .sobrenome("Ozzil")
                .documento("09316677799")
                .email("andy@gmail.com")
                .apelido("deinha")
                .dataNascimento("13/09/1988")
                .criaPessoa();

        System.out.println(pessoa);
    }


}
