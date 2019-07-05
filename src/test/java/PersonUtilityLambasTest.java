import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonUtilityLambasTest {

    @Test
    public void personOlder() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1999,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1997,9,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        PersonUtilityLambas pUl=new PersonUtilityLambas();
        Assert.assertEquals(1, pUl.personOlder(lpeople, 25),0.0001);
    }

    @Test
    public void personWithInRange() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1999,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1997,9,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        PersonUtilityLambas pUl=new PersonUtilityLambas();
        Assert.assertEquals(2, pUl.personWithInRange(lpeople, 20,30),0.0001);

    }

    @Test
    public void printPerson() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1999,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1997,9,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        PersonUtilityLambas pUl=new PersonUtilityLambas();
        CPerson c=new CPerson();
        Assert.assertEquals(1,  pUl.printPerson(lpeople,c), 0.0009);
    }
    @Test
    public void personOlder1() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1999,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1997,9,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        PersonUtilityLambas pUl=new PersonUtilityLambas();
        Assert.assertNotEquals(0, pUl.personOlder(lpeople, 25),0.0001);
    }

    @Test
    public void personWithInRange1() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1999,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1997,9,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        PersonUtilityLambas pUl=new PersonUtilityLambas();
        Assert.assertNotEquals(3, pUl.personWithInRange(lpeople, 20,30),0.0001);

    }

    @Test
    public void printPerson1() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1999,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1997,9,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        PersonUtilityLambas pUl=new PersonUtilityLambas();
        CPerson c=new CPerson();
        Assert.assertNotEquals(0,  pUl.printPerson(lpeople,c), 0.0009);
    }

}