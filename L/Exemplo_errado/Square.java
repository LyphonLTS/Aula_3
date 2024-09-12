public class Square extends Rectangle {
  // Nesta classe a mesma propriedade altera ambos os lados ao mesmo tempo,
  // comportamento este que não existe na classe pai

  public void setWidth(int width) {
    this.width = width;
    this.height = width;
  }

  public void setHeight(int height) {
    this.width = height;
    this.height = height;
  }
}
