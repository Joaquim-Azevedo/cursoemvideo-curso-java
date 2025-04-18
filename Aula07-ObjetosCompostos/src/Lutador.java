public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int lutasTotais;

    // Métodos públicos
    public void apresentar() {
        System.out.println("-----------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println(this.getAltura() + "m de altura.");
        System.out.println("Peso: " + this.getPeso() + "kg.");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Lutas: " + this.getLutasTotais());
        System.out.println("-----------------------------");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
        this.setLutasTotais(this.getLutasTotais() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
        this.setLutasTotais(this.getLutasTotais() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
        this.setLutasTotais(this.getLutasTotais() + 1);
    }

    // Métodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vit, int de, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vit;
        this.derrotas = de;
        this.empates = emp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getLutasTotais() {
        return lutasTotais + this.getVitorias() + this.getDerrotas() + this.getEmpates();
    }

    private void setLutasTotais(int lutasTotais) {
        this.lutasTotais = lutasTotais;
    }
}
