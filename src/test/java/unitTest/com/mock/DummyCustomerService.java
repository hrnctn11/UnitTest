package unitTest.com.mock;

/**
 * Created by Harun on 21.04.2019.
 */
public interface DummyCustomerService {

    public void addCustomer(String customerName);

    public void removeCustomer(String customerName);

    public void updateCustomer(String customerName);

    public String getCustomer(String customerName);
}
