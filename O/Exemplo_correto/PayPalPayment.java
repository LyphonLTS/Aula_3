public class PayPalPayment extends Payment {
  // Agora está classe cuida de todas as regras para pagamentos com PayPal

  @Override
  public void processPayment() {
    System.out.println("Process PayPal payment");
  }
}
