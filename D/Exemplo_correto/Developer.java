import Interface.DeveloperType;

public class Developer {
  // Agora esta classe está dependendo de uma interface ao invés de depender de
  // classes concretas

  private DeveloperType developer;

  public Developer(DeveloperType developer) {
    this.developer = developer;
  }

  public void develop() {
    developer.develop();
  }
}
