import java.util.List;
import java.util.stream.Collectors;

public class PersonUtilityLambas {
//    public static void printPersonsOlderThan(List<Person> lPeople, int age) {
//        for (Person p : lPeople) {
//            if (p.getAge() >= age) {
//                p.printPerson();
//            }
//        }
//        lPeople.stream().filter(person -> (person.getAge()>age)).collect(Collectors.toList());
//    }
//    public static void printPersonsWithinAgeRange(
//            List<Person> lPeople, int low, int high) {
//        for (Person p : lPeople) {
//            if (low <= p.getAge() && p.getAge() < high) {
//                p.printPerson();
//            }
//        }
//    }
//    public static void printPersons(List<Person> lPeople, CheckPerson tester) {
//        for (Person p : lPeople) {
//            if (tester.test(p)) {
//                p.printPerson();
//            }
//        }
//    }
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
