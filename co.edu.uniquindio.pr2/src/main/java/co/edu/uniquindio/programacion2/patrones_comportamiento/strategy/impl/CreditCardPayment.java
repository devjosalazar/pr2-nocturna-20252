package co.edu.uniquindio.programacion2.patrones_comportamiento.strategy.impl;

import co.edu.uniquindio.programacion2.patrones_comportamiento.strategy.impl.services.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagando " + amount + " con tarjeta de crédito.");
    }
}
