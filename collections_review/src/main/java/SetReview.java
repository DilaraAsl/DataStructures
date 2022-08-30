import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        LinkedHashSet<Student> studentLinkedHashSet = new LinkedHashSet<>(Set.of(new Student(1, "Julia"),
                new Student(2, "Jack"), new Student(3, "Mike")));
        System.out.println(studentLinkedHashSet);


        Set<Student> studentSet = new HashSet<>(Set.of(new Student(1, "Julia"),
                new Student(2, "Jack"), new Student(3, "Mike")));
        System.out.println(studentSet);


    }
}