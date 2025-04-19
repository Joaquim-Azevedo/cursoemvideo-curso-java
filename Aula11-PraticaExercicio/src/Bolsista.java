public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Bolsa renovada com sucesso.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }

    @Override
    public String toString() {
        return "Bolsista [bolsa=" + bolsa + ", nome=" + getNome() + ", matricula=" + getMatricula()
                + ", idade=" + getIdade() + ", curso=" + getCurso() + ", sexo=" + getSexo() + "]";
    }

}
