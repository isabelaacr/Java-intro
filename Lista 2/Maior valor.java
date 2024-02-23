/******************************************************************************
7. Desenvolva um programa que leia três valores numéricos inteiros,
identifique e apresente o maior valor informado.
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 3 valores: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a > b && a > c) {
            System.out.println("O maior valor é: " + a);
        } else if (b > a && b > c) {
            System.out.println("O maior valor é: " + b);
        } else if (c > a && c > b) {
            System.out.println("O maior valor é: " + c);
        } else {
            System.out.println("Os valores são iguais");
        }

        scanner.close();
    }
}
