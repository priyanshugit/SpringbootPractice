package GeneralPrograms;
import java.io.*;
class Student implements Serializable {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class SerializableExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        try{
            // Serailized data
            FileOutputStream fos = new FileOutputStream("SerializableExample.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("serialized data saved in SerializableExample.ser");
            //Deserailized data
            FileInputStream fis = new FileInputStream("SerializableExample.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student deserializedStudent = (Student) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserailized student ......");
            System.out.println("ID: " + deserializedStudent.id);
            System.out.println("Name: " + deserializedStudent.name);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
