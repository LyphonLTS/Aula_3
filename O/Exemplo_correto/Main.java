class Main {
  public static void main(String[] args) {
    // Agora cada classe cuida da sua responsabilidade e se necessário ampliar os
    // métodos de pagamento basta criar uma nova classe extendendo as propriedades
    // da classe abstrata Payment e adicionando as suas próprias

    CreditCardPayment creditCardPayment = new CreditCardPayment();
    PayPalPayment payPalPayment = new PayPalPayment();

    creditCardPayment.processPayment();
    payPalPayment.processPayment();
  }
}