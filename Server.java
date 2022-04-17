import java.rmi.Naming;

public class Server {
    public static void main(String[] args) throws Exception {
        SumImpl sum = new SumImpl();
        Naming.rebind("SUM", sum);
        System.out.println("Server Started & Listening...");
    }
}
