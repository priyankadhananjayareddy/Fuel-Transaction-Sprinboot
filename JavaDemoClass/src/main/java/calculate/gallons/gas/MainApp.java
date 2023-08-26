package calculate.gallons.gas;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of gallons: ");
        double gallons = scanner.nextDouble();
        scanner.close();

        CalculateAmount calculateAmount = new CalculateAmount(gallons);
        System.out.println(calculateAmount);
    }
}
