public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private String canal;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Métodos Públicos
    public Video(String titulo, String canal) {
        this.titulo = titulo;
        this.canal = canal;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public void status() {
        System.out.println("Video:");
        System.out.println("Título: " + this.titulo);
        System.out.println("Canal: " + this.canal);
        System.out.println("Visualizações: " + this.views);
        System.out.println("Curtidas: " + this.curtidas);
        System.out.println("Avaliação: " + this.avaliacao);
        System.out.println("Reproduzindo: " + this.reproduzindo);
    }

    // Métodos Implementados
    @Override
    public void play() {
        if (this.reproduzindo) {
            System.out.println("Vídeo já está sendo reproduzido.");
        } else {
            this.reproduzindo = true;
        }

    }

    @Override
    public void pause() {
        if (!(this.reproduzindo)) {
            System.out.println("Vídeo já está pausado.");
        } else {
            this.reproduzindo = false;
        }
    }

    @Override
    public void like() {
        this.curtidas += 1;
    }

    // Métodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Avaliação = Views/Curtidas
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    // Métodos Sobrescritos
    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", canal=" + canal + ", views=" + views
                + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + "]";
    }

}
