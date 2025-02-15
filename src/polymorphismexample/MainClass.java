package polymorphismexample;

public class MainClass {
    public static void main(String[] args)
    {
       SampleClass sampleClass = new SampleClass();
       sampleClass.sum(12,34);
        sampleClass.sum(12,34,23);
        sampleClass.sum(12.23f,34.34f);
        sampleClass.sum(12.45,34.65);
        sampleClass.sum(12,34.11);

    }
}
