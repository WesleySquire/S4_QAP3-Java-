package Problem1;

class CollegeStudent extends Student {
  protected String myMajor;
  protected int myYear;

  public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
    // use the super class’ constructor
    super(name, age, gender, idNum, gpa);

    // initialize what’s new to Student
    myMajor = major;
    myYear = year;
  }

  public String toString() {
    return super.toString() + ", " + "major: " + this.myMajor + ", " + "year: " + this.myYear;
  }

  // Getters
  public String getMajor() {
    return this.myMajor;
  }

  public int getYear() {
    return this.myYear;
  }

  // Setters
  public void setMajor(String major) {
    this.myMajor = major;
  }

  public void setYear(int year) {
    this.myYear = year;
  }
}
