// Outer class
class OuterClass {
    private static int outerStaticField = 5;

    // Static nested class
    static class StaticNestedClass {
        private int nestedField;

        public StaticNestedClass(int nestedField) {
            this.nestedField = nestedField;
        }

        // Method to display values of both outer static field and nested field
        public void display() {
            System.out.println("Outer Static Field: " + outerStaticField);
            System.out.println("Nested Field: " + nestedField);
        }
    }
}

