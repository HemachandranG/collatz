import java.util.scanner;

public class collatz {

    public static void main(string[] args) {
        scanner sc = new scanner(system.in);
        int n = sc.nextint();
        system.out.print(n + " ");
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
            system.out.print(n + " ");
        }
    }
}
