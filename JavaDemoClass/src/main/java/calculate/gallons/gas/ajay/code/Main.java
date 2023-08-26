package calculate.gallons.gas.ajay.code;

public class Main {
    public static void main(String[] args) {
        double gallonCapacity = 10;
        double noOfGallonsInVehicle = 2;

        Invoice i = new Invoice(gallonCapacity, noOfGallonsInVehicle);

        System.out.println(i);
    }
}