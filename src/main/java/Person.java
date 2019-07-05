import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    List<Person> lPeople;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public enum Sex {
        MALE, FEMALE;
    }


    public int getAge() {
        LocalDate currentDate=LocalDate.now();
        return Period.between(birthday, currentDate).getYears();
    }

    public void printPerson() {
        System.out.println("Name: "+this.name+" Birthday: "+this.birthday+"\n"
        +"Gender: "+this.gender+" EmailId: "+this.emailAddress);
    }


}