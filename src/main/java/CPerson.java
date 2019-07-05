import java.time.LocalDate;

public class CPerson  implements CheckPerson {


    @Override
    public boolean test(Person p) {
        if(p.getAge()<20)
            return true;
        else
            return false;
    }
}
