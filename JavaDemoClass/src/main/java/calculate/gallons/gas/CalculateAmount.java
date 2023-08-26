package calculate.gallons.gas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateAmount {
    public static final double pricePerGallon = 3.5;

    private double gallons;
    private double totalPrice;
    private String currentTime;

    public CalculateAmount(double gallons) {
        this.gallons = gallons;
        this.totalPrice = gallons * pricePerGallon;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.currentTime = dateFormat.format(new Date());
    }

    public double getGallons() {
        return gallons;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Current Date and Time: " + currentTime + "\n"
                + "Number of Gallons: " + gallons + "\n"
                + "Price per Gallon: $" + pricePerGallon + "\n"
                + "Total Price: $" + totalPrice;
    }

}