abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.setSexo(sexo);
    }

    protected void ganharExperiencia() {
        this.setExperiencia(this.getExperiencia() + 1);
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
        if (this.getSexo().equalsIgnoreCase("f")) {
            this.sexo = "Feminino";
        } else if (this.getSexo().equalsIgnoreCase("m")) {
            this.sexo = "Masculino";
        } else {
            this.sexo = null;
            System.out.println("Sexo inválido. Siga o padrão: (m/f)");
        }
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
    }

}