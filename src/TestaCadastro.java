public class TestaCadastro {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Jefferson");
        cliente.setCodigo(0001);
        Data dataCliente = new Data(03,02,1988);
        cliente.setDataNascimento(dataCliente);

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("ALfredo das Neves");
        funcionario1.setSalario(10000F);
        Data datafuncionario = new Data( 25,03,1970);
        funcionario1.setDataNascimento(datafuncionario);


        Gerente gerente1 = new Gerente();
        gerente1.setNome("Pablo Neruda");
        gerente1.setSalario(15000F);
        gerente1.setArea("Vendas");
        Data dataGerente = new Data(12,02,1975);
        gerente1.setDataNascimento(dataGerente);


        // Criar Cadastro
        CadastraPessoas cadastro = new CadastraPessoas();
        cadastro.cadastrarPessoa(cliente);
        cadastro.cadastrarPessoa(funcionario1);
        cadastro.cadastrarPessoa(gerente1);

        System.out.println("Quantidade de pessoas cadastradas: "+cadastro.getQuantidadeDePessoas());

        cadastro.imprimeCadastro();



    }

}
