public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // Métodos públicos
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        if (sexo.equalsIgnoreCase("m")) {
            this.setSexo("Masculino");
        } else if (sexo.equalsIgnoreCase("f")) {
            this.setSexo("Feminino");
        } else {
            System.out.println("Sexo inválido. Siga o padrão: (m/f)");
        }

    }

    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    // Métodos especiais
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
    }

}
