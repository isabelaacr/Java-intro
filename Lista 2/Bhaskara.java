/******************************************************************************
Construa um programa que leia três valores numéricos (representados
pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de
segundo grau, segundo a fórmula de Báskara. O programa deve mostrar
quantas raízes reais a equação possui (delta < 0 – mostrar uma
mensagem dizendo que a equação não possui raízes reais, delta > 0 –
mostrar que possui duas raízes reais, delta = 0 – mostrar que possui
uma única raiz real). 
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, delta, sqrtdelta, x1, x2;

        System.out.println("Coeficientes da equação: ");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        delta = ((b * b) - (4 * a * c));
        sqrtdelta = (float) Math.sqrt(delta);

        if (delta > 0) {
            x1 = (-b + sqrtdelta) / (2 * a);
            x2 = (-b - sqrtdelta) / (2 * a);
            System.out.printf("Raízes reais: %.2f %.2f\n", x1, x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.printf("Raiz real: %.2f\n", x1);
        } else {
            System.out.println("Não possui raízes reais");
        }
        scanner.close();
    }
}
