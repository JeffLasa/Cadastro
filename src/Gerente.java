public class Gerente extends Funcionario {

    private String area;
    private float percentualImposto = 0.05F;


    public void imprimeDados() {
            super.imprimeDados();
            System.out.println("Área do Gerente: " + area);
        }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(float percentualImposto) {
        this.percentualImposto = percentualImposto;
    }
}