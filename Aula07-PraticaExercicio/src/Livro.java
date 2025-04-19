public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.aberto = false;
        this.pagAtual = 0;
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
    }

    // Métodos públicos
    public void detalhes() {
        System.out.println("-------- Informações --------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotalPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Quem está lendo: " + leitor.getNome());
        System.out.println("Está aberto? " + this.isAberto());
        System.out.println("-----------------------------");
    }

    // Métodos implementados
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Não é possível avançar uma página com o livro fechado.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Não é possível voltar uma página com o livro fechado.");
        }
    }

    @Override
    public void folhear() {
        if (this.isAberto()) {
            if (this.getPagAtual() < this.getTotalPaginas()) {
                this.setPagAtual(this.getPagAtual() + 5);
            } else {
                System.out.println("O livro acabou, não é possível avançar mais páginas.");
            }
        } else {
            System.out.println("Não é possível voltar uma página com o livro fechado.");
        }
    }

    // Métodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
