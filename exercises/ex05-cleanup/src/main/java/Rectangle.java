public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }

    public double area(){

        return width*height;
    }

    /**
     * scales the rectangle
     * @param factor the factor the rectangle's scaled to
     */
    public void scale(double factor) {
      width = width * factor;
      height = height * factor;
    }

    public boolean isLargerThan(Rectangle other){
        return area() > other.area();
    }
}
