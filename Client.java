import java.math.BigDecimal;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BigDecimal num1, num2;

        num1 = getInput("first");
        num2 = getInput("second");

        SumInterface sumInterface = (SumInterface) Naming.lookup("SUM");
        System.out.println("Sum = " + sumInterface.sum(num1, num2));
    }

    public static BigDecimal getInput(String seqNum) {
        BigDecimal num = null;
        System.out.print("Enter " + seqNum + " number = ");

        // accepts: +343.353, -3434.454, .45, 0, +.34, -.343
        if (in.hasNext("[+-]?(\\d*\\.)?\\d+"))
            num = in.nextBigDecimal();
        else
            System.err.println("Invalid Input: only integers and decimal numbers accepted");

        return num;
    }
}

