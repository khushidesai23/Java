
class CallConstructor {
    // other constructor
    CallConstructor() {
        System.out.println("Start of called Constructer.");
        System.out.println("Executing command in called constructer.");
        System.out.println("End of called constructer.");
        System.out.println();

    }

    // default constructor
    CallConstructor(int n) {
        // calling other constructor
        this();
        System.out.println("Command exactly after calling Default constructer.");
        System.out.println("End of default constructer. ");
    }
}

public class Q8 {
    public static void main(String arg[]) {
        // calling the other constructor
        CallConstructor obj = new CallConstructor(1);
    }
}