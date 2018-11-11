public class Triangle {
  private int lines;

  public Triangle(int lines) {
    this.lines = lines;
    display();
  }

  public void display() {
    int spaces = lines - 1;
    int last;
    int min = 1;
    int max;

    for (int i = 0; i < lines; i++) {
      last = 2 * i + 1;
      max = spaces + last;

      for (int j = min; j <= max; j++) {
        if (j == spaces + 1 || j == max || i == lines - 1)
          System.out.print('*');
        else
          System.out.print(' ');
      }

      System.out.println();
      spaces--;
    }
  }

  public static void main(String[] args) {
    new Triangle(6);
  }
}
