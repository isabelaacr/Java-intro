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
