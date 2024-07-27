package CloneObject;

class Student1{
    int id;
    String name;
    //Regular constructor
    Student1(int id, String name){
        this.id = id;
        this.name = name;
    }
    //copy constructor
    Student1(Student1 student){
        this.id = student.id;
        this.name = student.name;
    }

}

public class CopyConstructor {
    public static void main(String[] args) {
        Student1 student1 = new Student1(1, "John");
        Student1 student2 = new Student1(student1);
        System.out.println(student1.id+" "+student1.name);
        System.out.println(student2.id+" "+student2.name);
    }
}
