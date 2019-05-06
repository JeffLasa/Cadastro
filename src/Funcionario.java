public class Funcionario extends Pessoa{

    private float salario;
    private float percentualDoImposto = 0.03F;


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calculaImposto(){
        float valorDoImposto = salario * percentualDoImposto;
        return valorDoImposto;
    }


    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Salário R$ " + salario );
        System.out.println("Valor do imposto R$ " + calculaImposto());

    }
}
