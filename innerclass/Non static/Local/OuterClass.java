// Outer class
class OuterClass {
    private int outerField = 10;

    // Method with a local inner class
    public void localInnerClassExample() {
        final int localVar = 5; // Local variable must be final or effectively final for use in a local inner class

        // Local Inner Class
        class LocalInnerClass {
            // Method in the local inner class
            public void display() {
                System.out.println("Outer Field: " + outerField);
                System.out.println("Local Variable: " + localVar);
            }
        }

        // Create an instance of the local inner class
        LocalInnerClass localInnerObject = new LocalInnerClass();

        // Call the display method of the local inner class
        localInnerObject.display();
    }
}
