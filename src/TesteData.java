import java.util.Scanner;

public class TesteData {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Data d = new Data();

        System.out.println("Digite o dia:");
        int dia = sc.nextInt();

        System.out.println("Digite o mês:");
        int mes = sc.nextInt();

        System.out.println("Digite o ano:");
        int ano = sc.nextInt();

        System.out.println(dia + "/" + mes + "/" + ano);
        System.out.println(Data.imprimeDados());

        }
}
