package calculate.gallons.gas.ajay.code;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    private double gallonCapacity;
    private double noOfGallonsInVehicle;
    private double totalPrice;
    private String currentTime;

    public Invoice(double gallonCapacity, double noOfGallonsInVehicle) {
        this.gallonCapacity = gallonCapacity;
        this.noOfGallonsInVehicle = noOfGallonsInVehicle;
        this.totalPrice = CalculateAmount.calculateTotalPrice(gallonCapacity, noOfGallonsInVehicle);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.currentTime = dateFormat.format(new Date());
    }

    @Override
    public String toString() {
        return "Current Date and Time: " + currentTime + "\n"
                + "Gallon Capacity: " + gallonCapacity + " gallons" + "\n"
                + "Number of Gallons in Vehicle: " + noOfGallonsInVehicle + " gallons" + "\n"
                + "Gas Price per Gallon: $" + Configuration.GAS_PRICE_PER_GALLON + "\n"
                + "Total Price: $" + totalPrice;
    }
}
