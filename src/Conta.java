public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public Conta(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para exibir mensagem formatada
    public String exibirMensagem() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    }
}
