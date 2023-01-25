package Problem2;

class Circle extends Shape {
  protected Double myRadius;

  public Circle() {
    super();
    this.myRadius = 1.0;
  }

  public Circle(Double radius) {
    super();
    this.myRadius = radius;
  }

  public Circle(Double radius, String color, Boolean filled) {
    super(color, filled);
    this.myRadius = radius;
  }

  // Getters
  public Double getRadius() {
    return this.myRadius;
  }

  public Double getArea() {
    final Double area;
    area = 3.14 * (this.myRadius * this.myRadius);
    return area;
  }

  public Double getCircumference() {
    final Double circum;
    circum = 2 * (3.14 * this.myRadius);
    return circum;
  }

  // Setters
  public void setRadius(Double radius) {
    this.myRadius = radius;
  }

  @Override
  public String toString() {
    return "A circle with the radius = " + this.myRadius + ", which is a subclass of " + super.toString();
  }
}
