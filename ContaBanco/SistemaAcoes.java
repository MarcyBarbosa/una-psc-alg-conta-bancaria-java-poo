public class SistemaAcoes {

    private String nome;
    private String numeroConta;
    private double saldoInicial;
    private double saldo;
    private double deposito;
    private double saque;
    private int operacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
        this.saldo = saldoInicial;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaque() {
        return saque;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public int getOperacao() {
        return operacao;
    }

    public void depositar() {
        saldo += deposito;
    }

    public void sacar() {
        saldo -= saque;
    }
}