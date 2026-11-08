/**
 * Exercise 5. Clean up rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Make a rectangle.
   *
   * @param w the width of the rectangle.
   *
   * @param h the height of the rectangle.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Initializes the rectangle.
   *
   *@return the area of the rectangle.
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the factor the rectangle is scaled to.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Check which rectangle is larger.
   *
   * @param other the other rectangle to be compared to this rectangle
   * @return if this rectangle is bigger than other
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}