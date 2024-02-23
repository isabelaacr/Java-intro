/******************************************************************************
5. Desenvolva um programa que leia quatro valores numéricos inteiros e
mostre os valores que são divisíveis por 2 e 3.
*******************************************************************************/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 4 valores: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        if (divisivel(a) && divisivel(b) && divisivel(c) && divisivel(d)) {
            System.out.println("Os valores são divisíveis por 2 e 3.");
        } else {
            System.out.println("Os valores informados não são divisíveis por 2 e 3.");
        }

        scanner.close();
    }

    public static boolean divisivel(int num) {
        return num % 2 == 0 && num % 3 == 0;
    }
}

/******************************************************************************
6. Desenvolva um programa que leia quatro valores numéricos inteiros e
mostre os valores que são divisíveis por 2 e 3.
*******************************************************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 4 valores: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        boolean divisivelA = divisivel(a);
        boolean divisivelB = divisivel(b);
        boolean divisivelC = divisivel(c);
        boolean divisivelD = divisivel(d);
        
        if (divisivelA || divisivelB || divisivelC || divisivelD) {
            System.out.println("Os valores divisíveis por 2 e 3 são:");
            if (divisivelA) {
                System.out.println(a);
            }
            if (divisivelB) {
                System.out.println(b);
            }
            if (divisivelC) {
                System.out.println(c);
            }
            if (divisivelD) {
                System.out.println(d);
            }
        } else {
            System.out.println("Nenhum dos valores é divisível por 2 e 3.");
        }

        scanner.close();
    }

    public static boolean divisivel(int num) {
        return num % 2 == 0 && num % 3 == 0;
    }
}
