public class problem_9 {
    
}
class A {
    public void methodA() {
        System.out.println("Calling method from object of 'a'. ");
        System.out.println();
        System.out.println("        Inside 'a' class.");
        System.out.println("        End of method of 'a' class.");
        System.out.println();
    }
}

class B extends A {
    public void methodB() {
        System.out.println("Calling method from object of 'b'. ");
        System.out.println();
        System.out.println("        Inside 'b' class.");

        System.out.println("                calling method of parent class 'a'.");
        System.out.println("        Inside 'a' class.");
        System.out.println("        End of method of 'a' class.");
        System.out.println("        End of method of 'b' class.");
    }

    public static void main(String args[]) {
        B obj = new B();

        obj.methodB();
        obj.methodA();

    }
}

class D extends A {
    public void methodD() {
        System.out.println("Calling method from object of 'd'. ");
        System.out.println();
        System.out.println("        Inside 'd' class.");

        System.out.println("                calling method of parent class 'a'.");
        System.out.println("        Inside 'a' class.");
        System.out.println("        End of method of 'a' class.");
        System.out.println("        End of method of 'd' class.");
    }

    public static void main(String args[]) {
        D obj = new D();

        obj.methodD(); 
        obj.methodA(); 

    }
}

class C extends B {
    public void methodC() {
        System.out.println("Calling method from object of 'C'. ");
        System.out.println();
        System.out.println("        Inside 'C' class.");
        System.out.println("        End of method of 'C' class.");
    }

    public static void main(String args[]) {
        C obj = new C();
        obj.methodC();
        obj.methodB();
        obj.methodA();
    }
}