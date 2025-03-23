import java.util.Scanner;

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

    public void cadastrarDados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu saldo: ");
        saldo = sc.nextFloat();

        System.out.println("Digite seu limite: ");
        limite = sc.nextFloat();

        System.out.println("Digite seu tipo de conta: ");
        tipo = sc.next().charAt(0);
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome + " Saldo: " + saldo + " Limite: " + limite + " Tipo: " + tipo);
    }

    public void depositarValor(float valor){
        saldo += valor;

    }

    public void sacarValor(float valor){
        saldo -= valor;
        if (this.saldo + this.limite >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente!");
    }

}
    }
