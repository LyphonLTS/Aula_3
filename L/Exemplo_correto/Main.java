class Main {
  public static void main(String[] args) {
    // Neste caso o que irá acontecer com o objeto square é que os lados dele serão
    // alterados duas vezes sobrepondo seus valores

    Rectangle rectangle = new Rectangle();

    rectangle.setHeight(10);
    rectangle.setWidth(15);

    System.out.println("Retangulo - base: " + rectangle.getWidth() + ", altura: " + rectangle.getHeight());

    Square square = new Square();
    square.setSide(10);

    System.out.println("Quadrado - lado: " + square.getSide());
  }
}