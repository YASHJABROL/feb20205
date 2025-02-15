package inheritanceexample;

public class Dog extends Animal{
        public void bark()
        {
            System.out.println("Dog can bark");
        }
    @Override
    public void breathe() {
        System.out.println("Dog can breath");
    }

    @Override
    public void see() {
        System.out.println("Dog can see");
    }

    @Override
    public void sleep() {
        System.out.println("Dog can sleep");
    }
}
