public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno: " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ",  matricula=" + matricula + ", curso="
                + curso + "]";
    }

}
