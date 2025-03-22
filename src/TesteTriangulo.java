import javax.swing.*;
import java.util.Scanner;

public class TesteTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.println("Digite o valor da base do Triangulo: ");
        float base = sc.nextFloat();

        System.out.println("Digite o valor da altura do Triangulo: ");
        float altura = sc.nextFloat();


        Triangulo triangulo = new Triangulo(base, altura);
        System.out.println(triangulo);

        System.out.println("\nDados do Triângulo:");
        System.out.println(triangulo.imprimeDados());
    }
}








