import Interface.IWorker;

public class Robot implements IWorker {
  // Nesta classe estamos obrigando a existência de um método do qual não há uso

  public void work() {
    System.out.println("Robot working");
  }

  public void eat() {

  }
}
