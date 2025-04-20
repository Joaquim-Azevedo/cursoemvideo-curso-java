public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }

        this.filme.setAvaliacao(tot);
    }

    public void status() {
        System.out.println("-----------------------");
        espectador.status();
        System.out.println("");
        filme.status();
        System.out.println("-----------------------");

        System.out.println("-----------------------");
        System.out.println("Video: " + this.filme.getTitulo());
        System.out.println("Autor: " + this.filme.getCanal());
        System.out.println("Avaliação: " + this.filme.getAvaliacao());
        System.out.println("Views: " + this.filme.getViews());
        System.out.println("Curtidas: " + this.filme.getCurtidas());
        System.out.println("Espectador: " + this.espectador.getNome());
        System.out.println("-----------------------");

    }

    // Métodos Especiais
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }

}
