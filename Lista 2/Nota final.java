/******************************************************************************
10.A nota final de um estudante é calculada a partir de três notas
atribuídas, respectivamente, a um trabalho de laboratório, a uma
avaliação semestral e a um exame final. A média das três notas
mencionadas obedece aos pesos a seguir:

Nota Peso
Trabalho de laboratório 2
Avaliação semestral 3
Exame final 5

Faça um programa que receba as três notas, calcule e mostre a média
ponderada e o conceito que segue a tabela:
Média Ponderada Conceito
8,0 (inclusive) a 10,0 (inclusive) A
7,0 (inclusive) a 8,0 B
6,0 (inclusive) a 7,0 C
5,0 (inclusive) a 6,0 D
0,0 (inclusive) a 5,0 E
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite suas notas: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double n1 = nota1 * 0.2;
        double n2 = nota2 * 0.3;
        double n3 = nota3 * 0.5;
        double media = n1 + n2 + n3;

        if (media >= 8.0 && media <= 10.0) {
            System.out.println("Conceito A");
        } else if (media >= 7.0 && media < 8.0) {
            System.out.println("Conceito B");
        } else if (media >= 6.0 && media < 7.0) {
            System.out.println("Conceito C");
        } else if (media >= 5.0 && media < 6.0) {
            System.out.println("Conceito D");
        } else if (media >= 0.0 && media < 5.0) {
            System.out.println("Conceito E");
        } else {
            System.out.println("Nota inválida");
        }

        scanner.close();
    }
}
