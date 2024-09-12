public class Human implements IWorkable, IEatable {
  // Agora está classe implementa não só o método que compartilha com a outra
  // classe mas também implementa outro método que apenas ela fará uso

  public void work() {
    System.out.println("Human working");
  }

  public void eat() {
    System.out.println("Human eating");
  }
}
