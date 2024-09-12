class Main {
  public static void main(String[] args) {
    // Nesta caso agora cada classe cuida de um tipo de processamento distinto
    // determinando assim a responsabilidade única sobre cada operação do programa
    OrderProcessor orderProcessor = new OrderProcessor();
    OrderLogger orderLogger = new OrderLogger();

    orderLogger.logOrder();
    orderProcessor.processOrder();
  }
}