package com.eficens.main;
import com.eficens.calculate.CalculateAmount;
import com.eficens.result.Invoice;
import com.eficens.config.Config;

public class Main {
    public static void main(String[] args) {
        double gallonCapacity = 10;
        double noOfGallonsInVehicle = 2;

        CalculateAmount calculateAmount = new CalculateAmount();
        Invoice invoice = calculateAmount.getInvoice(gallonCapacity, noOfGallonsInVehicle);

        System.out.println(invoice);
    }
}