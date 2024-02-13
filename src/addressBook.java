import java.util.ArrayList;

public class addressBook {
    ArrayList<Person> mybook = new ArrayList<>();

    public void addingContact(Person a){
        mybook.add(a);
    }

    @Override
    public String toString() {
        return "addressBook{" +
                "mybook=" + mybook +
                '}';
    }
}