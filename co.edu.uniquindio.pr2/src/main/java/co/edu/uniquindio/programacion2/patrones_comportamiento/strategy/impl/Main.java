package co.edu.uniquindio.programacion2.patrones_comportamiento.strategy.impl;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService(new PayPalPayment());
        service.executePayment(100.0);

        service = new PaymentService(new CreditCardPayment());
        service.executePayment(250.0);
    }
}
/**
 * Ventajas de usar Strategy:
 * Fácil de extender sin modificar el código existente. *
 * Cada estrategia es independiente y testeable. *
 * Se respeta el principio de abierto/cerrado y de responsabilidad única.
 * **/