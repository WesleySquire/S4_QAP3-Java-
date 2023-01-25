package Problem1;

public class Person {
  protected String myName; // name of the person
  protected int myAge; // person’s age
  protected String myGender; // "M" for male, "F" for female

  public Person(String name, int age, String gender) {
    myName = name;
    myAge = age;
    myGender = gender;
  }

  public String toString() {
    return myName + ", age: " + myAge + ", gender: " + myGender;
  }

  // Getters
  public String getName() {
    return this.myName;
  }

  public String getGender() {
    return this.myGender;
  }

  public int getAge() {
    return this.myAge;
  }

  // Setters
  public void setName(String name) {
    this.myName = name;
  }

  public void setGender(String gender) {
    this.myGender = gender;
  }

  public void setAge(int age) {
    this.myAge = age;
  }
}
