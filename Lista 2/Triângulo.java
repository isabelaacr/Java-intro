/******************************************************************************
Construa um programa que leia três valores para os lados de um
triângulo (A, B e C). O programa deve verificar se os lados fornecidos
formam realmente um triângulo. Em caso positivo, deve mostrar a
mensagem “Os lados formam um triângulo” e caso contrário “Os valores
informados não podem formar um triângulo”. Para que três valores de
lados formem um triângulo, cada par de lados somados não pode ser
menor ou igual ao terceiro lado.
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os valores dos lados do triângulo (A, B e C): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (isTriangle(a, b, c)) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }

        scanner.close();
    }

    public static boolean isTriangle(double a, double b, double c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
