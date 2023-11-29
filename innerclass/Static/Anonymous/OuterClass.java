// Outer class
class OuterClass {
    private static int outerStaticField = 5;

    // Static nested class
    static class StaticNestedClass {
        private int nestedField;

        public StaticNestedClass(int nestedField) {
            this.nestedField = nestedField;
        }

        // Method with an anonymous inner class
        public void anonymousInnerClassExample() {
            // Anonymous Inner Class
            Runnable myRunnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running from anonymous inner class");
                    System.out.println("Outer Static Field: " + outerStaticField);
                    System.out.println("Nested Field: " + nestedField);
                }
            };

            // Run the anonymous inner class
            myRunnable.run();
        }
    }
}
