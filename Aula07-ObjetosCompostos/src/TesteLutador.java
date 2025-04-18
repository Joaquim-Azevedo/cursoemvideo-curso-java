public class TesteLutador {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Jok", "Uruguaio", 23, 1.78f, 63.4f, 6, 4, 1);
        l[1] = new Lutador("Márcio", "Brasileiro", 30, 1.75f, 88.4f, 8, 1, 2);
        l[2] = new Lutador("Cheif", "Irlandês", 27, 1.86f, 92.6f, 3, 4, 1);
        l[3] = new Lutador("Abreu", "Ucraniano", 26, 1.64f, 72.2f, 5, 3, 4);
        l[4] = new Lutador("Luke", "Estadunidense", 26, 1.82f, 68.2f, 4, 2, 4);
        l[5] = new Lutador("Josias", "Canadense", 33, 1.87f, 79.1f, 3, 4, 4);

        for (Lutador lutador : l) {
            lutador.apresentar();
        }

        System.out.println("----------- LUTAS -----------");

        Luta luta = new Luta();
        Luta luta2 = new Luta();
        Luta luta3 = new Luta();
        Luta luta4 = new Luta();

        luta.marcarLuta(l[0], l[4]);
        luta2.marcarLuta(l[3], l[5]);
        luta3.marcarLuta(l[1], l[2]);
        luta4.marcarLuta(l[0], l[1]);

        luta.lutar();
        luta2.lutar();
        luta3.lutar();
        luta4.lutar();

    }
}
