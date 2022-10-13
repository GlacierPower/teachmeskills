import java.util.Scanner;
public class ScannerTry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        if (scanner.hasNext()) {
            int enterValue = scanner.nextInt();
            System.out.println("Your value is: " + enterValue);
        } else {
            System.out.println("You inout value is wrong...");


        }
    }
}
