import java.util.Random;

class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada == true) {
            System.out.println("#### DESAFIADO ####");
            desafiado.apresentar();
            System.out.println("#### DESAFIANTE ####");
            desafiante.apresentar();

            Random rand = new Random();
            int vencedor = rand.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    System.out.println("");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O desafiado " + desafiado.getNome() + " ganhou a luta!");
                    System.out.println("");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O desafiante " + desafiante.getNome() + " ganhou a luta!");
                    System.out.println("");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer pois os lutadores têm categorias diferentes.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
