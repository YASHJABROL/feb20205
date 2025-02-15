package encapsulationexample;

public class MainClass {
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.setId(011);
        student1.setEmail("yadjkdfhsk@gmail.com");
        student1.setAddress("dfsdfsdf");
        student1.setName("Yash");
        student1.setGender("male");
        student1.setGrade("A");

        System.out.println(student1);
        System.out.println(student1.getEmail());
        System.out.println(student1.getGender());

    }
}
