import java.rmi.Naming;

public class AddServer {

	public static void main(String[] args) {
		try {
			AddServerIntf addServerImpl = new AddServerImpl();
			Naming.rebind("AddServer", addServerImpl);
			System.out.println("Object registered..and Server Started...");
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
