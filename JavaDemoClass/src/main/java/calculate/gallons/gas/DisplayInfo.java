package calculate.gallons.gas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayInfo {
    public static void display(double gallons, double pricePerGallon, double totalPrice) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());

        System.out.println("Current Date and Time: " + currentTime);
        System.out.println("Number of Gallons: " + gallons);
        System.out.println("Price per Gallon: $" + pricePerGallon);
        System.out.println("Total Price: $" + totalPrice);
    }
}