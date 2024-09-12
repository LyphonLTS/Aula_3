public class Order {
  // Nesta classe há uma sobrecarga de responsabilidades onde a classe Order está,
  // ao mesmo tempo, lidando com o processamento das ordens e também com o
  // registro de logs.

  public void processOrder() {
    System.out.println("Processing Order");
  }

  public void logOrder() {
    System.out.println("Logging Order");
  }
}
