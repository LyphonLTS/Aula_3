public class Payment {
  // Nesta classe caso seja necessário acrescentar suporte a um novo método de
  // pagamento ela deverá ser modificada

  public void processPayment(String paymentType) {
    if (paymentType.equals("CreditCard")) {
      System.out.println("Process credit card payment");
    } else if (paymentType.equals("PayPal")) {
      System.out.println("Process PayPal payment");
    }
  }
}
