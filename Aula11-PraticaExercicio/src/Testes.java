public class Testes {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Joaquim");
        a1.setIdade(19);
        a1.setMatricula(2703);
        a1.setSexo("Masculino");
        a1.setCurso("Ciência da Computação");
        a1.pagarMensalidade();

        System.out.println(a1.toString());
        System.out.println("");

        Bolsista b1 = new Bolsista();
        b1.setNome("Carlos");
        b1.setIdade(23);
        b1.setSexo("Masculino");
        b1.setMatricula(2025);
        b1.setBolsa(15f);
        b1.setCurso("ADS");
        b1.renovarBolsa();
        b1.pagarMensalidade();

        System.out.println(b1.toString());
    }
}
