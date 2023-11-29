// Outer class
class OuterClass {
    private static int outerStaticField = 5;
    private int outerInstanceField = 10;

    // Static nested class
    static class StaticNestedClass {
        private int nestedField;

        // Constructor for the static nested class
        public StaticNestedClass(int nestedField) {
            this.nestedField = nestedField;
        }

        // Method to display values of both outer and nested fields
        public void display() {
            // Note: Static nested class cannot access non-static (instance) fields of the outer class directly
            System.out.println("Outer Static Field: " + outerStaticField);
            System.out.println("Nested Field: " + nestedField);
        }
    }
}

