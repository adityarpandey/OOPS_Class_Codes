package concepts.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(1000 , 12 , "Aditya");

        try(FileOutputStream fileOut = new FileOutputStream("Serialization/Resource/Student.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

        ){

            out.writeObject(student);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
