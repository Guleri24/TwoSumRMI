import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SumImpl extends UnicastRemoteObject implements SumInterface {

    public SumImpl() throws Exception {
        super();
    }

    @Override
    public BigDecimal sum(BigDecimal x, BigDecimal y) throws RemoteException {
        return x.add(y);
    }
}
