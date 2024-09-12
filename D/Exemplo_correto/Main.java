class Main {
  public static void main(String[] args) {
    // Agora com a abstração é possível realizar a integração entre as classes e
    // realizar as operações desejadas

    Developer frontendDeveloper = new Developer(new FrontendDeveloper());
    frontendDeveloper.develop();

    Developer backenDeveloper = new Developer(new BackendDeveloper());
    backenDeveloper.develop();
  }
}