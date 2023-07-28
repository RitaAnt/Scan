import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double res = 0.000000;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                res += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf(Locale.US, "%.6f", res);
        scanner.close();
    }
}