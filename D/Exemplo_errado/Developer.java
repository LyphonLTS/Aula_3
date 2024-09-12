public class Developer {
  // Nesta classe existe uma dependência de uma classe concreta

  private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

  public void develop() {
    frontendDeveloper.developFrontend();
  }
}
