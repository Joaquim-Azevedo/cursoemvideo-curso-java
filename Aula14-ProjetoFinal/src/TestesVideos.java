public class TestesVideos {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Curso Java Básico Completo", "Curso em Video");
        v[1] = new Video("Curso MySQL Básico Completo", "Curso em Video");
        v[2] = new Video("Curso Java POO Completo", "Curso em Video");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Josias", 20, "M", "jojos");
        g[1] = new Gafanhoto("Maria", 18, "F", "marimaria");

        Visualizacao vis = new Visualizacao(g[0], v[2]);

        v[2].play();

        vis.avaliar();
        vis.avaliar(9);
        vis.avaliar(51f);

        vis.status();
    }
}
