class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int numeroPessoas) {
        super(valor, nomeFilme, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * numeroPessoas;
        if (numeroPessoas > 3) {
            total *= 0.95; // Aplica desconto de 5%
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + " | Número de pessoas: " + numeroPessoas;
    }
}