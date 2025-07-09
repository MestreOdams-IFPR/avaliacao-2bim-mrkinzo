
import java.util.Scanner;

public class recursivos {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = LER.nextInt();
        int resultT = tribo(n);
        int resultP = pell(n);
        System.out.println("tribo " + resultT);
        System.out.println("pell " + resultP);
    }

    public static int tribo(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        } else {
            return tribo(n - 1) + tribo(n - 2) + tribo(n - 3);
        }
    }

    public static int pell(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return 2 * pell(n - 1) + pell(n - 2);
        }
    }
}
