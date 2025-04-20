public class Gafanhoto extends Pessoa {
    private String login;
    private int totalAssistido;

    // Métodos públicos
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm() {
        this.setTotalAssistido(this.totalAssistido++);
    }

    public void status() {
        System.out.println("Gafanhoto:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Login: " + this.login);
        System.out.println("Experiência: " + this.experiencia);
        System.out.println("Total assistido: " + this.totalAssistido);
    }

    // Métodos Especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
}
