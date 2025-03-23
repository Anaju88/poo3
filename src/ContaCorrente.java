public class ContaCorrente {

    private String nome;
    private float saldo;
    private float limite;
    private char tipo;


    public ContaCorrente(String nome, float saldo, float limite, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }
    public ContaCorrente(String nome, float saldo, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    public ContaCorrente() {
    }
}
