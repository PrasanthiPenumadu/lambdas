import java.util.List;
import java.util.stream.Collectors;

public class PersonUtilityLambas {
    public static void printPersonsOlderThan(List<Person> lPeople, int age) {
                List<Person> lPpl=  lPeople.stream().filter(person -> (person.getAge()>age)).collect(Collectors.toList());
        for (Person p : lPpl) {
            p.printPerson();
            }
        }

    public static void printPersonsWithinAgeRange(
            List<Person> lPeople, int low, int high) {
        List<Person> lPpl=  lPeople.stream().filter(person -> (person.getAge()>low&&person.getAge()<high)).collect(Collectors.toList());
        for (Person p : lPpl) {
            p.printPerson();
        }

    }
    public static void printPersons(List<Person> lPeople, CheckPerson tester) {
        List<Person> lPpl=  lPeople.stream().filter(person -> (tester.test(person))).collect(Collectors.toList());
        for (Person p : lPpl) {
            p.printPerson();
        }
    }
        public  Integer personOlder(List<Person> lPeople, int age){

            return lPeople.stream().filter(person -> (person.getAge()>age)).collect(Collectors.toList()).size();

        }
        public Integer personWithInRange(List<Person> lPeople, int low, int high){
            return lPeople.stream().filter(person -> (person.getAge()>low&&person.getAge()<high)).collect(Collectors.toList()).size();
        }
        public Integer printPerson(List<Person> lPeople, CheckPerson tester){
            return lPeople.stream().filter(person -> (tester.test(person))).collect(Collectors.toList()).size();

        }

}
