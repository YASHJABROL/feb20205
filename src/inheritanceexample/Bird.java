package inheritanceexample;

public class Bird extends Animal{

    public void fly()
    {
        System.out.println(super.abc);
        System.out.println("Bird can fly");
    }

    @Override
    public void breathe() {
        System.out.println("Bird can breath");
    }

    @Override
    public void see() {
        System.out.println("Bird can see");
    }

    @Override
    public void sleep() {
        System.out.println("Bird can sleep");
    }
}
