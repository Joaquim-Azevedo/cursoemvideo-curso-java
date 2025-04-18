public class TesteEncapsulamento {
    public static void main(String[] args) {
        Controlador cr1 = new ControleRemoto();

        cr1.ligar();
        cr1.maisVolume();
        cr1.abrirMenu();

        cr1.ligarMudo();
        cr1.abrirMenu();

        cr1.desligarMudo();
        cr1.play();
        cr1.menosVolume();
        cr1.abrirMenu();

        cr1.pause();
        cr1.pause();
        cr1.abrirMenu();
        cr1.fecharMenu();

    }
}
