import java.util.Objects;

/**
 * The type Student 1.
 */
public class Student1 {
    //variable declaration for name, Rollnumber and age
    private String name;
    private int rollNo;
    private int age;

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets roll no.
     *
     * @param rollNo the roll no
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student1)) return false;
        Student1 student1 = (Student1) o;
        return getRollNo() == student1.getRollNo() && getAge() == student1.getAge() && getName().equals(student1.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRollNo(), getAge());
    }




    /**
     * Get name string.
     *
     * @return the string
     */
//Getter method for name , age, roll number respectively for accessing the data in element
    public String getName(){
        return name;
    }

    /**
     * Get age int.
     *
     * @return the int
     */
    public int getAge(){
        return age;
    }

    /**
     * Get roll no int.
     *
     * @return the int
     */
    public int getRollNo(){
        return rollNo;
    }
}
