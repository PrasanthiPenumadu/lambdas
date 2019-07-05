import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonUtilityTest {

    @Test
    public void printPersonsOlderThan() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);

   PersonUtility.printPersonsOlderThan(lpeople, 7);
      //  Assert.assertEquals(, );
    }

    @Test
    public void printPersonsWithinAgeRange() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,5,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1999,11,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        PersonUtility.printPersonsWithinAgeRange(lpeople, 7,20 );
    }

    @Test
    public void printPersons() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,5,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1999,11,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        CheckPerson p=new CheckPerson() {
            @Override
            public boolean test(Person p) {
                if(p.getAge()>20)
                return true;
                else
                    return false;
            }
        };
        PersonUtility.printPersons(lpeople, p);
    }
    @Test
    public void printPersons1() {
        List<Person> lpeople=new ArrayList<>();
        Person person=new Person("heidi", LocalDate.of(1990,5,19),
                Person.Sex.FEMALE,"h.com");
        Person person1=new Person("heidi1", LocalDate.of(1990,9,19),
                Person.Sex.FEMALE,"h.com");
        Person person2=new Person("heidi2", LocalDate.of(1999,11,19),
                Person.Sex.FEMALE,"h.com");
        lpeople.add(person);
        lpeople.add(person1);
        lpeople.add(person2);
        CPerson c=new CPerson();
        PersonUtility.printPersons(lpeople, c);
    }
}