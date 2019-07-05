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
        System.out.println(person.getAge());
    }

    @org.junit.Test
    public void printPerson() {
        Person person = new Person("heidi", LocalDate.of(1990, 9, 19),
                Person.Sex.FEMALE, "h.com");
        person.printPerson();
    }


}
