public class ContaBanco {
    private String dono;
    protected String tipo;
    private int numConta;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        saldo = 0;
        status = false;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo.equalsIgnoreCase("CC")) {
            this.setSaldo(50);
        } else if (tipo.equalsIgnoreCase("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta no nome de " + this.getDono() + " aberta com sucesso.");
    }

    public void fecharConta() {
        if (this.isStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("Não é possível fechar uma conta com saldo.");
            } else if (this.getSaldo() < 0) {
                System.out.println("Não é possível fechar uma conta com débito.");
            } else {
                this.setStatus(false);
                this.setTipo(null);
            }
        } else {
            System.out.println("Conta no nome de " + this.getDono() + " fechada com sucesso.");
        }
    }

    public void depositar(double saldo) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + saldo);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Não é possível depositar em uma conta que não existe.");
        }
    }

    public void sacar(double saldo) {
        if (this.isStatus() && this.getSaldo() >= saldo) {
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("Saque realizado com sucesso no nome de " + this.getDono());
        } else if (this.isStatus() && this.getSaldo() <= saldo) {
            System.out.println("Você não tem saldo suficiente para sacar.");
        } else {
            System.out.println("Não é possível sacar em uma conta que não existe.");
        }
    }

    public void pagarMensal() {
        if (this.getTipo() == "CC") {
            this.setSaldo(this.getSaldo() - 12);
            System.out.println("Mensalidade paga no nome de " + this.getDono());
        } else if (this.getTipo() == "CP") {
            this.setSaldo(this.getSaldo() - 20);
            System.out.println("Mensalidade paga no nome de " + this.getDono());
        }
    }

    public void statusConta() {
        System.out.println("Dono: " + this.getDono());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Está em ativa: " + this.isStatus());
        System.out.println("------------------------");
    }

}
