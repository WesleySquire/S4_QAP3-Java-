package Problem1;

class Teacher extends Person {
  protected String mySubject;
  protected Double mySalary;

  public Teacher(String name, int age, String gender, String subject, Double salary) {
    // Super class constructor
    super(name, age, gender);

    // init for new teacher
    mySubject = subject;
    mySalary = salary;
  }

  // Getters
  public String getSubject() {
    return this.mySubject;
  }

  public Double getSalary() {
    return this.mySalary;
  }

  // Setters
  public void setSubject(String subject) {
    this.mySubject = subject;
  }

  public void setSalary(Double salary) {
    this.mySalary = salary;
  }

  public String toString() {
    return super.toString() + ", " + "subject: " + this.mySubject + ", " + "salary: $" + this.mySalary;
  }
}
