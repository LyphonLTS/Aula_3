public class Square {
  // Agora esta classe age conforme seu princípio onde um quadrado possui os lados
  // iguais não havendo a necessidade de alterar sua base e altura em dois métodos
  // distintos

  private int side;

  public void setSide(int side) {
    this.side = side;
  }

  public int getSide() {
    return this.side;
  }
}
