package org.vistula.customertest;

import org.junit.Test;
import org.vistula.customer.Customer;

public class CustomerTest {

    @Test
    public void shouldCheckAgeOver(){

        Customer michal = new Customer();
        michal.setAge(19);

        assert michal.isClientAdult()== true;
    }

    @Test
     public void shouldCheckAgeUnder(){
        Customer michal = new Customer();
        michal.setAge(17);
        assert michal.isClientAdult()== false;
    }
    @Test
    public void shouldCheckAge(){
        Customer michal = new Customer();
        michal.setAge(18);
        assert michal.isClientAdult()== true;

    }

    @Test
    public void shouldDetectSlawek() {
        Customer slawek = new Customer();
        slawek.setName("Slawek");
        assert slawek.isSlawek() == true;
    }

}
