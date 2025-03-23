import java.util.Scanner;

public class Triangulo {

        public float base;
        public float altura;

        public Triangulo() {

        }

        public Triangulo(float base, float altura) {
            this.base = base;
            this.altura = altura;
        }

        //métodos
        float calculeArea(){
            return (base * altura) / 2;
        }

        public String imprimeDados(){
            return "Base: " + base + ", Altura: " + altura + ", Área: " + calculeArea();
        }
    }

