//KHUSHI DESAI
//21BCP264
import java.util.Scanner;

public class Q10 {
    static Scanner sc = new Scanner(System.in);
    String name, account;
    int bal;

    Q10() {
        name = "(Customer name)";
        account = "(account value)";
        bal = 1000;
    }

    public static void main(String[] args) {
        Q10 object1 = new Q10();
        int selection;
        boolean check = true;
        int amount;
        do {
            System.out.println("\nEnter a choice \n1: Withdraw \n2: Deposit \n3: Exit");
            selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    System.out.println("Please enter amount to be withdrawn");
                    amount = sc.nextInt();
                    if (checkBal(object1, amount)) {
                        (object1).bal = (object1).bal - amount;
                        System.out.println("Amount withdrawn: " + amount + ", New Balance: " + (object1).bal);
                    } else {
                        System.out.println("Insufficient balance to withdraw given amount");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Please enter amount to be deposited");
                    amount = sc.nextInt();
                    (object1).bal = (object1).bal + amount;
                    System.out.println("Amount deposited: " + amount + ", New Balance: " + (object1).bal);
                    break;
                }

                case 3: {
                    check = false;
                    break;
                }

                default: {
                    System.out.println("Enter valid input");
                }
            }
        } while (check);
    }

    public static boolean checkBal(Q10 p1, int withdrawing) {
        if (p1.bal >= withdrawing) {
            return true;
        } else {
            return false;
        }

    }
}
