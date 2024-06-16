package Proxy;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new PessoaBuilder()
                .nome("Luzia")
                .sobrenome("Amaranto")
                .documento("00022244488")
                .apelido("Lu")
                .email("lu@hotmail.com")
                .dataNascimento("13/08/2978")
                .criaPessoa();


        PessoaService pessoaService = new PessoaService(new PessoaRepositoryProxy());

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

    }
}
