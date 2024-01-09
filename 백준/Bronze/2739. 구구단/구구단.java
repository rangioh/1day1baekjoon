import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            int result = N*i;
            System.out.println(N + " * " + i + " = " + result);
        }

    }
}