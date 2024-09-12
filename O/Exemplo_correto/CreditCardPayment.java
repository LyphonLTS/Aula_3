public class CreditCardPayment extends Payment {
  // Agora está classe cuida de todas as regras para pagamentos com cartões de
  // crédito

  @Override
  public void processPayment() {
    System.out.println("Process credit card payment");
  }
}
