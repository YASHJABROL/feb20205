package classesandobjects;

public class Student {
    int id;
    String name;
    String email;
    String gender;
    String grade;
    String address;
    public void demo1()
    {
        System.out.println("non-static");
    }
    public static void demo2()
    {
        System.out.println("static");
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                '}';


    }
}
