import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person1 = new Person("Joe", "Joe@email.com");
        Person person2 = new Person("John", "John@email.com");
        person1.display();
        person2.display();


        addressBook book = new addressBook();
        book.addingContact(person1);
        System.out.println(book);








    }


    }


