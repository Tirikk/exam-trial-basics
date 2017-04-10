public class Cuboid {
  int a;
  int b;
  int c;

  Cuboid(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getSurface() {
    return 2 * a * b + 2 * a * c + 2 * b * c;
  }
}
