package groupTasks.phonebookLinkedList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

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
        phoneBooksList.add(pbo);

    }

    public PhoneBook findByName(String name) {


        return phoneBooksList.stream()
                .filter(n -> n.getName().equals(name))
                .findFirst().orElseThrow(NoSuchElementException::new);
    }

    public List<PhoneBook> findByLastName(String last_name) {

        return phoneBooksList.stream()
                .filter(ln -> ln.last_name.equals(last_name))
                .collect(Collectors.toList());

    }

    public void deleteByName(String name) {


        phoneBooksList.removeIf(n -> n.getName().equals(name));


    }

    public void deleteAllMatchingLastName(String last_name) {
        phoneBooksList.removeAll(phoneBooksList.stream().filter(ln -> ln.last_name.equals(last_name)).collect(Collectors.toList()));

    }

    public List<PhoneBook> findAll() {
        return phoneBooksList;
    }

    public void printPhoneBook() {
        for (PhoneBook each : phoneBooksList) {
            System.out.println(each);
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
