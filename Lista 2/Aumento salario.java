/******************************************************************************
9. Uma empresa decide dar um aumento de 30% aos funcionários cujo
salário é inferior a 5000. Escreva um programa que possa ser utilizado
para efetuar o cálculo do salário reajustado de um funcionário, a partir
do valor do salário informado pelo usuário
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu salario: ");
        int salario = scanner.nextInt();
        
        if (salario > 0 && salario <= 5000) {
            double novosal = (salario * 0.3) + salario;
            System.out.println("O valor é: " + novosal);
        } else {
            
            System.out.println("Não foi possivel calcular");
        }

        scanner.close();
    }
}
