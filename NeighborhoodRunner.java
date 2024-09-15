import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
// Creats a mural of a flower
MuralPainter backgroundPainter = new MuralPainter();
// Creats a FlowerPainter object
FlowerPainter flower = new FlowerPainter();
    // paints background
    backgroundPainter.paintBackground("SkyBlue", 16);
    // creates a flower
flower.paintFlower("green", "red", "yellow");
  }
}
