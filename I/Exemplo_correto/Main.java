class Main {
  public static void main(String[] args) {
    Robot robot = new Robot();
    robot.work();

    Human human = new Human();
    human.eat();
    human.work();
  }
}