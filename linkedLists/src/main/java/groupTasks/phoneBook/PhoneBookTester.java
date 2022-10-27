package groupTasks.phoneBook;

import groupTasks.phonebookLinkedList.PhoneBook;

public class PhoneBookTester {
    public static void main(String[] args) {
        groupTasks.phonebookLinkedList.PhoneBook pb=new groupTasks.phonebookLinkedList.PhoneBook("John","Wiley","jw@gmail.com","8623341234");
        pb.insert(pb);
        pb.insert(new groupTasks.phonebookLinkedList.PhoneBook("Rondo","Mills","rm@gmail.com","1123341234"));
        pb.insert(new PhoneBook("Alex","Mills","am@gmail.com","1123341234"));
        pb.printPhoneBook();
        System.out.println("**************************");
        System.out.println( pb.findByName("John"));
        System.out.println(pb.findByLastName("Mills"));


        System.out.println("=========================================");
        pb.deleteByName("John");
        pb.deleteAllMatchingLastName("Mills");
        pb.printPhoneBook();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(pb.findAll());

    }
}
