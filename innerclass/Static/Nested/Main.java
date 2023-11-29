
public class Main {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.NestedStaticClass nestedObject = new OuterClass.NestedStaticClass(15);

        // Call the display method to show the values
        nestedObject.display();
    }
}
