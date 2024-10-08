public class Conta {
    protected String titular;
    protected double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valor) {
        this.saldo += valor;
    }

    public void sacar (double valor) {
        this.saldo -= valor;
    }

    public void exibirDados() {
        System.out.println("Titular da Conta: " + this.titular);
        System.out.println("Saldo da Conta: " + this.saldo);
    }

}
