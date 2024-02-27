public class test {
    public static void main(String[] args) {
        try {
            testMethod();
        } catch (myException ex) {
            System.out.println("Test 1");
        }
    }

    public static void testMethod() { //line 1
        try {
            throw (Math.random() > 0.5) ? new myException() :
                    new RuntimeException();
        } catch (RuntimeException ex) {
            System.out.println("Test 2");
        }
    }
}

class myException extends RuntimeException {
}