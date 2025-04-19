public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[4];
        p[0] = new Pessoa("Márcio", 45, "m");
        p[1] = new Pessoa("Ana", 42, "f");

        Livro stw = new Livro("Star Wars", "George Lucas", 325, p[0]);
        Livro hyp = new Livro("Harry Potter", "", 730, p[1]);

        hyp.detalhes();

        stw.detalhes();
        stw.avancarPag();

        stw.abrir();
        stw.folhear();
        stw.detalhes();

        stw.setPagAtual(320);
        stw.detalhes();

        stw.folhear();
        stw.detalhes();
        stw.folhear();

    }
}
