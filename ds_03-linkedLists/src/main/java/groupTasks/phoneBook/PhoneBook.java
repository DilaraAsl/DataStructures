package groupTasks.phoneBook;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;


@Getter
@Setter

@NoArgsConstructor
public class PhoneBook {
    String name;
    String last_name;
    String email;
    String phoneNumber;
    static LinkedList<PhoneBook> phoneBook = new LinkedList<>();
    static List<PhoneBook> phoneBooksList = new ArrayList<>();


    public PhoneBook(String name, String last_name, String email, String phoneNumber) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.phoneNumber = phoneNumber;


    }

    public void insert(PhoneBook pbo) {

        phoneBook.add(pbo);


    }

    public PhoneBook  findByName(String name) {
        Node<PhoneBook> head;
       head= phoneBook.getHead();
       Node<PhoneBook> current=head;
       while(current!=null){
           if(current.value.name.equals(name)) return current.value;
       }
       return null;

    }

    public PhoneBook findByLastName(String last_name) {
        Node<PhoneBook> head;
        head= phoneBook.getHead();
        Node<PhoneBook> current=head;
        while(current!=null){
            if(current.value.last_name.equals(last_name)) return current.value;
        }
        return null;



    }

    public void deleteByName(String name) {

        Node<PhoneBook> head;
        head= phoneBook.getHead();
        Node<PhoneBook> current=head;
        while(current!=null){
            if(current.value.name.equals(name)) {phoneBook.delete(current.value); break;}

            current=current.next;
        }




    }

    public void deleteAllMatchingLastName(String last_name) {
        Node<PhoneBook> head;
        head= phoneBook.getHead();
        Node<PhoneBook> current=head;
        while(current!=null){
            if(current.value.last_name.equals(last_name)) phoneBook.delete(current.value);

            current=current.next;
        }

    }

    public List<PhoneBook> findAll() {


        Node<PhoneBook> head;
        head= phoneBook.getHead();
        Node<PhoneBook> current=head;
        while(current!=null){
           phoneBooksList.add(current.value);

            current=current.next;
        }
        return phoneBooksList;
    }

    public void printPhoneBook() {
        for (PhoneBook each : phoneBooksList) {
            System.out.println(each);
        }
    }


}
