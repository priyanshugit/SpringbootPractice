package CloneObject;
class Student implements Cloneable{
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class UsingCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("John", 25);
        Student s2 = (Student) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
    }
}
