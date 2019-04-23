package unitTest.com.assertj;

import lombok.Setter;

/**
 * Created by Harun on 23.04.2019.
 */
@Setter
public class CustomerService {

    private CustomerRepository customerRepository;
    private NotificationService notificationService;

    public Customer handleNewCustomer(String customerName, String email)
    {

        Customer customer=new Customer(customerName,email);
        giveWelcomeGifts(customer);
        customerRepository.save(customer);
        notificationService.sendWelcomeNotification(customerName,email);

        return customer;

    }

    private void giveWelcomeGifts(Customer customer) {
        customer.addGift(new Gift("welcome1"));
        customer.addGift(new Gift("welcome2"));

    }
}
