import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

  @Test
  void testGetSurface() {
    Cuboid cuboid = new Cuboid(5, 10, 15);
    assertEquals(550, cuboid.getSurface());
  }

  @Test
  void testGetVolume() {
    Cuboid cuboid = new Cuboid(5, 10, 15);
    assertEquals(750, cuboid.getVolume());
  }

}