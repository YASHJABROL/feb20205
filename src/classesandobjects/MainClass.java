package classesandobjects;

public class MainClass {
    public static void main(String[] args)
    {
        Student student1 = new Student();
        System.out.println("before aassigning values :" + student1);

        student1.id = 121;
        student1.name = "Yash";
        student1.email = "yasha@gmail.com";
        student1.gender = "Male";
        student1.grade = "A";
        student1.address = "cfkgmtrkmr";

        System.out.println("after assigning values :" + student1);
        student1.demo1();
        Student.demo2();

    }
}
