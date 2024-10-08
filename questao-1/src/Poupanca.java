public class Poupanca extends Conta {
    private double rendimento;

    public void setRendimento(double selic) {
        if (selic > 8.5) {
            this.rendimento = 0.005 * this.saldo;
        } else {
            this.rendimento = 0.007 * selic * this.saldo;
        }
    }

    public double getRendimento() {
        return rendimento;
    }
}
