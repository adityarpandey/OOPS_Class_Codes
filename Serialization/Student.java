package concepts.Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1;

    private String name;
    private int age;
    private int rollNo;


    public Student(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }
}
