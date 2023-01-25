package Problem2;

class Rectangle extends Shape {
  protected Double myWidth;
  protected Double myLength;

  public Rectangle() {
    super();
    myLength = 1.0;
    myWidth = 1.0;
  }

  public Rectangle(Double width, Double length) {
    super();
    myWidth = width;
    myLength = length;
  }

  public Rectangle(Double width, Double length, String color, Boolean filled) {
    super(color, filled);
    this.myWidth = width;
    this.myLength = length;
  }

  // Getters
  public Double getLength() {
    return this.myLength;
  }

  public Double getWidth() {
    return this.myWidth;
  }

  public Double getArea() {
    final Double area;
    area = this.myLength * this.myWidth;
    return area;
  }

  public Double getPerimeter() {
    final Double peri;
    peri = 2 * (this.myLength + this.myWidth);
    return peri;
  }

  // Setters
  public void setLength(Double length) {
    this.myLength = length;
  }

  public void setWidth(Double width) {
    this.myWidth = width;
  }

  @Override
  public String toString() {
    return "A Rectangle with width= " + this.myWidth + " and length= " + this.myLength + ", which is a subclass of "
        + super.toString();
  }
}