public class TesteContaBanco {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();

        c1.setDono("José");
        c1.setNumConta(10854);
        c1.abrirConta("CC");
        c1.statusConta();

        c1.sacar(190);
        c1.statusConta();

        c1.depositar(150);
        c1.pagarMensal();
        c1.statusConta();

        c1.sacar(188);
        c1.statusConta();

        c1.fecharConta();
        c1.statusConta();

    }
}
