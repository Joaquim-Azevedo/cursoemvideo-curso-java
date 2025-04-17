class CanetaConstrutor {
    private String modelo;
    private float ponta;
    private boolean tampada;

    public CanetaConstrutor(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        // Definindo um comportamento padrão para quando for instânciada.
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean tampar() {
        return tampada = true;
    }

    public boolean destampar() {
        return tampada = false;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ponta: " + ponta);
        System.out.println("Tampada: " + tampada);
    }
}
