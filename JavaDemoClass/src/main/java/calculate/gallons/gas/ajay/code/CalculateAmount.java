package calculate.gallons.gas.ajay.code;

public class CalculateAmount {
    public static double calculateTotalPrice(double gallonCapacity, double noOfGallonsInVehicle) {
        double gasPricePerGallon = Configuration.GAS_PRICE_PER_GALLON;
        return (gallonCapacity - noOfGallonsInVehicle) * gasPricePerGallon;
    }
}