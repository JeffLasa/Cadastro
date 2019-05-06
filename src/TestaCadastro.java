public class TestaCadastro {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Jefferson");
        cliente.setCodigo(0001);
        Data dataCliente = new Data(03,02,1988);
        cliente.setDataNascimento(dataCliente);
        cliente.imprimeDados();

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("ALfredo das Neves");
        funcionario1.setSalario(10000F);
        Data datafuncionario = new Data( 25,03,1970);
        funcionario1.setDataNascimento(datafuncionario);
        funcionario1.imprimeDados();

        Gerente gerente1 = new Gerente();
        gerente1



    }

}
