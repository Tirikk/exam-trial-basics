public class Cuboid {
  int width;
  int height;
  int depth;

  Cuboid(int a, int b, int c) {
    this.width = a;
    this.height = b;
    this.depth = c;
  }

  int getSurface() {
    return 2 * width * height + 2 * width * depth + 2 * height * depth;
  }

  int getVolume() {
    return width * height * depth;
  }
}
