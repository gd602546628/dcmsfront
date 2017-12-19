package test;


import com.kissdental.weixin.entity.Customer;
import com.kissdental.weixin.service.CustomerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dartagnan on 17/7/28.
 */
public class UserTest extends Junit4Test {
    @Autowired
    private CustomerService customerService;

    @Test
	public void getByName(){
		System.err.println(customerService.getCustomerByPhone("13888888888").getName());
	}

}
