import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
       ArrayList<Student> studentList=new ArrayList<>(Arrays.asList( new Student(1,"Julia"),
               new Student(2,"Jack"), new Student(3,"Mike")));

       Iterator iterateList=studentList.iterator();
       while(iterateList.hasNext())
           System.out.println(iterateList.next());

       ListIterator sListIterator=studentList.listIterator();


        while(sListIterator.hasPrevious()){
           System.out.println(sListIterator.previous());
       }

        for(Student each:studentList)
        {
            System.out.println(each);
        }
        studentList.forEach(p->System.out.println(p));

       Collections.sort(studentList,new sortByIdDescendingOrder());// arrayList object

        System.out.println(studentList);


       }

        static class sortByIdDescendingOrder implements Comparator<Student>{

            @Override
            public int compare(Student o1, Student o2) {
                return o2.id-o1.id; // negative result /value means o1 is greater

            }
        }


    }

