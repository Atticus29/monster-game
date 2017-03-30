import org.sql2o.*;

public class Person {

  public Person() {
    private String name;
private String email;

public Person(String name, String email) {
  this.name = name;
  this.email = email;
}

public String getName() {
  return name;
}

public String getEmail() {
  return email;
}

@Override
public boolean equals(Object otherPerson){
  if (!(otherPerson instanceof Person)) {
    return false;
  } else {
    Person otherPerson = (Person) otherPerson;
    return this.getName().equals(otherPerson.getName());
  }
}

  }
}
