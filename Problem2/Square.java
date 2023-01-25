package Problem2;

class Square extends Rectangle {
  protected Double mySide;

  public Square() {
    super(1.0, 1.0);
  }

  public Square(Double side) {
    super(side, side);
  }

  public Square(Double side, String color, Boolean filled) {
    super(side, side, color, filled);
  }

  // Setters
  @Override
  public void setWidth(Double side) {
    this.myLength = side;
    this.myWidth = side;
  }

  @Override
  public void setLength(Double side) {
    this.myLength = side;
    this.myWidth = side;
  }

  @Override
  public String toString() {
    return "A Square with side= " + this.myWidth + ", which is a subclass of "
        + super.toString();
  }

}
