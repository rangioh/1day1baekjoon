import java.util.Scanner;

/* 이 문제의 목적은 파일의 끝(EOF)을 올바르게 판단하는 법을 연습하는 것입니다.
 더 이상 읽을 게 없을 때 프로그램을 종료하는 법을 알아야 합니다.  */
public class Main {
    public static void main(String[] args) {
        int A, B;

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}