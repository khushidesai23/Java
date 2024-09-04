
class HDFC {
    void getIFSC() {
        System.out.println("IFSC code of A branch of HDFC bank is: HDFCXXXXX");
    }
}

// Creating child classes.
class ICICI extends HDFC {
    void getIFSC() {
        System.out.println("IFSC code of B branch of ICICI bank is: ICICIXXXXX");
    }
}

class SBI extends HDFC {
    void getIFSC() {
        System.out.println("IFSC code of C branch of SBI bank is: SBIXXXXX");
    }
}

// Test class to create objects and call the methods
class que10 {
    public static void main(String args[]) {
        HDFC s = new HDFC();
        ICICI i = new ICICI();
        SBI a = new SBI();
        s.getIFSC();
        i.getIFSC();
        a.getIFSC();

    }
}