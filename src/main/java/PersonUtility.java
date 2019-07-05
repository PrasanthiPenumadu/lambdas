import java.util.List;

public class PersonUtility {

    public static void printPersonsOlderThan(List<Person> lPeople, int age) {
        for (Person p : lPeople) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
    public static void printPersonsWithinAgeRange(
            List<Person> lPeople, int low, int high) {
        for (Person p : lPeople) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
    public static void printPersons(List<Person> lPeople, CheckPerson tester) {
        for (Person p : lPeople) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
