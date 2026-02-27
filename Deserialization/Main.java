package concepts.Deserialization;

import concepts.Serialization.Student;

import java.io.FileInputStream;

import java.io.ObjectInputStream;


public class Main {

    public static void main(String[] args) {



        try(FileInputStream fileOut = new FileInputStream("Serialization/Resource/Student.ser");

            ObjectInputStream in = new ObjectInputStream(fileOut);

        ){

            Student student = (Student) in.readObject();

            student.display();


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
