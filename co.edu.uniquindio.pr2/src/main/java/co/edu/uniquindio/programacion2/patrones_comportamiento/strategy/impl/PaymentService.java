package co.edu.uniquindio.programacion2.patrones_comportamiento.strategy.impl;

import co.edu.uniquindio.programacion2.patrones_comportamiento.strategy.impl.services.PaymentStrategy;

public class PaymentService {
    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}

