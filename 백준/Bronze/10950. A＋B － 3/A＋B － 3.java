import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, T;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A + B);
        }

    }
}