// Outer class
class OuterClass {
    private int outerField;

    // Constructor
    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    // Member Inner Class
    class InnerClass {
        private int innerField;

        // Constructor for InnerClass
        public InnerClass(int innerField) {
            this.innerField = innerField;
        }

        // Method to display values of both outer and inner fields
        public void display() {
            System.out.println("Outer Field: " + outerField);
            System.out.println("Inner Field: " + innerField);
        }
    }
}