class Payment {
    void processPayment() {
        System.out.println("Processing Generic Payment");
    }
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Processing Credit Card Payment");
    }
}

class PayPal extends Payment {
    void processPayment() {
        System.out.println("Processing PayPal Payment");
    }
}

public class PolymorphismExample5 {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCard(), new PayPal()};
        for (Payment payment : payments) {
            payment.processPayment();
        }
    }
}
