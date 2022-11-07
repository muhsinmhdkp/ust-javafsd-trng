import java.util.*;

/**
 * The type Student main 1.
 */
public class StudentMain1 {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]){
        //creating ArrrayList for Student class
        List<Student1> studentArrayList = new ArrayList<>();

        //declaring a variable name to add prefix to the name
        String name = "abc";


        //Adding elements to Arraylist
        for(int i=0; i<4000; i++){
            Student1 s = new Student1();
            name = name + String.valueOf(i);
            s.setAge(23);
            s.setName(name);
            s.setRollNo(i);
            studentArrayList.add(s);
            name ="abc";
        }

        //Adding 4001 th element
        Student1 s = new Student1();
        s.setAge(24);
        s.setName("abc4001");
        s.setRollNo(4001);
        studentArrayList.add(s);

        //declaration and initialisation of starting time of arraylist
        long startTime = System.currentTimeMillis();

        //printing the ArrayList
        for(Student1 std:studentArrayList)
        {
            System.out.println(std.getName()+" "+std.getAge()+" "+std.getRollNo());
        }

        //printing the time taken for arraylist printing
        System.out.println("Time taken to iterate through ArrayList = "+(System.currentTimeMillis()-startTime));

        //crating linkedlist of student class
        List<Student1> studentLinkedList = new LinkedList<>();
        for(int i=0; i<4000; i++){
            Student1 s1 = new Student1();
            name = name + String.valueOf(i);
            s1.setRollNo(i);
            s1.setName(name);
            s1.setAge(25);
            studentLinkedList.add(s1);
            name ="abc";
        }
        Student1 s1 = new Student1();
        s1.setRollNo(4001);
        s1.setName("abc4001");
        s1.setAge(24);
        studentLinkedList.add(s1);

        long startTime1 = System.currentTimeMillis();
        for(Student1 std:studentLinkedList)
        {
            System.out.println(std.getName()+" "+std.getAge()+" "+std.getRollNo());
        }
        System.out.println("Time taken to iterate through Linkedlist = "+(System.currentTimeMillis()-startTime1));


        Set<Student1> studentHashSet = new HashSet<>();
        for(int i=0; i<4000; i++){
            Student1 s2 = new Student1();
            name = name + String.valueOf(i);
            s2.setRollNo(i);
            s2.setName(name);
            s2.setAge(27);
            studentHashSet.add(s2);
            name ="abc";
        }
        Student1 s2 = new Student1();
        s2.setRollNo(4001);
        s2.setName("abc4001");
        s2.setAge(24);
        studentLinkedList.add(s2);

        long startTime2 = System.currentTimeMillis();
        for(Student1 std:studentHashSet)
        {
            System.out.println(std.getName()+" "+std.getAge()+" "+std.getRollNo());
        }
        System.out.println("Time taken to iterate through HashSet = "+(System.currentTimeMillis()-startTime2));


    }
}
