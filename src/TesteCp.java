
public class TesteCp {

    public static void main(String[] args) {


        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();


        System.out.println(conta1.imprimeDados());
        System.out.println(conta2.imprimeDados());

        // Testando os métodos depositar e sacar
        conta1.depositaValor(0);
        conta2.sacarValor(0);

        System.out.println(conta1.imprimeDados());
        System.out.println(conta2.imprimeDados());

        ContaCorrente conta3 = new ContaCorrente();
        conta3.cadastraDados();
        System.out.println(conta3.imprimeDados());
    }
}



