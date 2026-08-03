import java.util.Scanner;

public class first {

    public static void table(int n) {

        for (int i = 1; i <= 10; i++) {
            int ans = i * n;

            System.out.println(n + " x " + i + " = " + ans);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        int n = sc.nextInt();

        table(n);

        sc.close();
    }
}