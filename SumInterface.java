import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SumInterface extends Remote {
    BigDecimal sum(BigDecimal x, BigDecimal y) throws RemoteException;
}
