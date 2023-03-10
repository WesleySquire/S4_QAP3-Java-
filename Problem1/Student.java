package Problem1;

class Student extends Person {
  protected String myIdNum; // Student Id Number
  protected double myGPA; // grade point average

  public Student(String name, int age, String gender, String idNum, double gpa) {
    // use the super class’ constructor
    super(name, age, gender);

    // initialize what’s new to Student
    myIdNum = idNum;
    myGPA = gpa;
  }

  // Getters
  public String getIdNum() {
    return this.myIdNum;
  }

  public double getGPA() {
    return this.myGPA;
  }

  // Setters
  public void setIdNum(String idNum) {
    this.myIdNum = idNum;
  }

  public void setGPA(Double gpa) {
    this.myGPA = gpa;
  }

  public String toString() {
    return super.toString() + ", " + "id num: " + this.myIdNum + ", " + "gpa: " + this.myGPA;
  }

}
