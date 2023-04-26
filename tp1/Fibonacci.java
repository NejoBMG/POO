package POO;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número de términos que desea mostrar en la secuencia de Fibonacci: ");
        int n = input.nextInt();
        int t1 = 0, t2 = 1;
        
        System.out.print("Los " + n + " términos de la secuencia de Fibonacci son: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
