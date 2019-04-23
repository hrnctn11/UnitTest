package unitTest.com.assertj;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Harun on 23.04.2019.
 */
@Data
@AllArgsConstructor
public class Customer {

    private String username;
    private String email;
    private List<Gift> gifts=new ArrayList<>();

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public Customer(String username,String email){
        this.username=username;
        this.email=email;
    }
}
