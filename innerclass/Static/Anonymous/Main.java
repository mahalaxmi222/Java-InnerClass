
public class Main {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass(15);

        // Call the method with the anonymous inner class
        nestedObject.anonymousInnerClassExample();
    }
}
