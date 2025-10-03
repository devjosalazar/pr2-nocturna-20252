package co.edu.uniquindio.programacion2.patrones_comportamiento.strategy.sinImpl;

public class PaymentService {

    public static void main(String[] args) {
        pay("credit",1000.0);
    }

    public static void pay(String method, double amount) {
        if ("credit".equalsIgnoreCase(method)) {
            System.out.println("Pagando " + amount + " con tarjeta de crédito.");
        } else if ("paypal".equalsIgnoreCase(method)) {
            System.out.println("Pagando " + amount + " con PayPal.");
        } else if ("cash".equalsIgnoreCase(method)) {
            System.out.println("Pagando " + amount + " en efectivo.");
        } else {
            System.out.println("Método de pago no soportado.");
        }
    }
}
/**
 * Desventajas:
 * Añadir nuevos métodos de pago implica modificar la clase (violando el principio abierto/cerrado). *
 * La lógica está acoplada y poco escalable. *
 * Difícil de probar de manera aislada.
 * **/