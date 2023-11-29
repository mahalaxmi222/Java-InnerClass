
public class Main {
    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outerObject = new OuterClass(10);

        // Create an instance of the inner class using the outer class instance
        OuterClass.InnerClass innerObject = outerObject.new InnerClass(20);

        // Call the display method to show the values
        innerObject.display();
    }
}
