import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {

  @Before
  public void setUp() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/virtual_pets_test", null, null);
  }

  @After
  public void tearDown() {
    try (Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM people *;";
      con.createQuery(sql).executeUpdate();
    }
  }

  @Test
  public void person_instantiatesCorrectly_true() {
    Person testPerson = new Person("Henry", "henry@henry.com");
    assertEquals(true, testPerson instanceof Person);
  }

  @Test
public void getName_personInstantiatesWithName_Henry() {
  Person testPerson = new Person("Henry", "henry@henry.com");
  assertEquals("Henry", testPerson.getName());
}

@Test
public void getEmail_personInstantiatesWithEmail_String() {
  Person testPerson = new Person("Henry", "henry@henry.com");
  assertEquals("henry@henry.com", testPerson.getEmail());
}

@Test
public void equals_returnsTrueIfNameAndEmailAreSame_true() {
  Person firstPerson = new Person("Henry", "henry@henry.com");
  Person anotherPerson = new Person("Henry", "henry@henry.com");
  assertTrue(firstPerson.equals(anotherPerson));
}

@Test
public void save_insertsObjectIntoDatabase_Person() {
  Person testPerson = new Person("Henry", "henry@henry.com");
  testPerson.save();
  assertTrue(Person.all().get(0).equals(testPerson));
}

}
}
