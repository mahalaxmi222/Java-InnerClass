// Outer class
class OuterClass {
    private static int outerStaticField = 5;

    // Method with a static nested class (local inner class)
    public void localStaticNestedClassExample() {
        final int localVar = 10; // Local variable must be final or effectively final for use in a local inner class

        // Static Nested Class (local inner class)
        static class LocalStaticNestedClass {
            private int nestedField;

            // Constructor for the local static nested class
            public LocalStaticNestedClass(int nestedField) {
                this.nestedField = nestedField;
            }

            // Method to display values of both outer static field and nested field
            public void display() {
                System.out.println("Outer Static Field: " + outerStaticField);
                System.out.println("Local Variable: " + localVar);
                System.out.println("Nested Field: " + nestedField);
            }
        }

        // Create an instance of the local static nested class
        LocalStaticNestedClass localStaticNestedObject = new LocalStaticNestedClass(15);

        // Call the display method to show the values
        localStaticNestedObject.display();
    }
}
