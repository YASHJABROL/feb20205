package polymorphismexample;

public class SampleClass {

    public void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    public void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    public void sum(float a,float b)
    {
        System.out.println(a+b);
    }

    public void sum(double a,double b)
    {
        System.out.println(a+b);
    }
    public void sum(int a,double b)
    {
        System.out.println(a+b);
    }
}
