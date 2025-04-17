public class TesteCaneta {
    public static void main(String[] args) {
        /*
         * Exemplo da proteção:
         * c1.modelo = "Bic"
         * c1.ponta = 0.5f
         * 
         * Retornarão erros de atributo privado.
         */

        // SEM construtor
        Caneta c1 = new Caneta();

        c1.setModelo("BIC Uniball");
        c1.setPonta(0.5f);

        c1.status();

        System.out.println("");

        CanetaConstrutor c2 = new CanetaConstrutor("BIC Rollerball", 0.7f);

        c2.status();

    }
}
