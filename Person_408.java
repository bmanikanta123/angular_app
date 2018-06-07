/**
 * Created by dt212979 on 6/6/2018.
 */
public class Person_408 implements Comparable<Person_408>{
  private String name;
  private int age;
  private char gender;

  public Person_408(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person_408() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return name+','+age+','+gender;
  }

  @Override
  public int compareTo(Person_408 person) {
    return this.getAge()-person.getAge();
  }
}
