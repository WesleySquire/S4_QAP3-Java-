package Problem2;

public class Shape {
  protected String myColor;
  protected Boolean myFilled;

  public Shape(String color, Boolean filled) {
    myColor = color;
    myFilled = filled;
  }

  public Shape() {
    myColor = "Green";
    myFilled = true;
  }

  // Getters
  public String getColor() {
    return this.myColor;
  }

  public Boolean isFILLED() {
    return this.myFilled;
  }

  // Setters
  public void setColor(String color) {
    this.myColor = color;
  }

  public void setFilled(Boolean filled) {
    this.myFilled = filled;
  }

  public String toString() {
    final String strFilled;
    if (this.myFilled == true) {
      strFilled = "filled";
    } else {
      strFilled = "not filled";
    }
    return "A shape with color of " + this.myColor + " and is " + strFilled;
  }
}
