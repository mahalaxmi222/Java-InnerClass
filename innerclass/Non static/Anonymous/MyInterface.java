// Interface to be implemented
interface MyInterface {
    void myMethod();
}

// Outer class
class OuterClass {
    public void createAnonymousInnerClass() {
        // Anonymous Inner Class implementing MyInterface
        MyInterface anonymousInnerObject = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Inside myMethod of Anonymous Inner Class");
            }
        };

        // Call the method of the anonymous inner class
        anonymousInnerObject.myMethod();
    }
}


