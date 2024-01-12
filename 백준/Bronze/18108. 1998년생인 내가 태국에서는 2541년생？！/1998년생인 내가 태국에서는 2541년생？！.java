import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sYear, bYear;

        Scanner sc = new Scanner(System.in);

        bYear = sc.nextInt();
        sYear = bYear - 543;

        System.out.println(sYear);
    }
}