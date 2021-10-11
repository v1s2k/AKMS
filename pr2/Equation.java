package second.source;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Equation extends Remote {

    String solve(double a, double b, double c) throws RemoteException;
}
