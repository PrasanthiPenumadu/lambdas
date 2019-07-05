import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getAge() {
        Person person = new Person("heidi", LocalDate.of(1990, 9, 19),
                Person.Sex.FEMALE, "h.com");
        Assert.assertEquals(28,person.getAge(), 0.0009);
    }
    @Test
    public void getAge1() {
        Person person = new Person("heidi", LocalDate.of(1990, 9, 19),
                Person.Sex.FEMALE, "h.com");
        Assert.assertNotEquals(0,person.getAge(), 0.0009);
    }
    @Test
    public void printPerson() {
        Person person = new Person("heidi", LocalDate.of(1990, 9, 19),
                Person.Sex.FEMALE, "h.com");
        person.printPerson();
    }
    @Test
    public void getName() {
        Person person = new Person("heidi", LocalDate.of(1990, 9, 19),
                Person.Sex.FEMALE, "h.com");
        Assert.assertEquals("heidi",person.getName());
    }
    @Test
    public void getName1() {
        Person person = new Person("heidi", LocalDate.of(1990, 9, 19),
                Person.Sex.FEMALE, "h.com");
        Assert.assertNotEquals("",person.getName());
    }


}
