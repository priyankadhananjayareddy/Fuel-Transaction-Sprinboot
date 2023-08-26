package com.eficens.springboot.controller;
import com.eficens.springboot.entity.FuelTransaction;
import com.eficens.springboot.request.FuelTransactionRequest;
import com.eficens.springboot.service.FuelTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuelTransactionController {
    @Autowired
    private FuelTransactionService fuelTransactionService;


    @PostMapping("/calculate-invoice")
    public FuelTransaction calculateInvoice(@RequestBody FuelTransactionRequest request) {
        return fuelTransactionService.createFuelTransaction(request.getGallonCapacity(), request.getNoOfGallonsInVehicle());
    }
}

