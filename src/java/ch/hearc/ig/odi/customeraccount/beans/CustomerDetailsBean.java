package ch.hearc.ig.odi.customeraccount.beans;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
@Named(value = "customerDetailsBean")
@RequestScoped
public class CustomerDetailsBean {

    private Customer customer;

    /**
     * Creates a new instance of CustomerDetailsBean
     */
    public CustomerDetailsBean() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Account> getAccountsList() {
        if (this.customer != null) {
            return new ArrayList(this.customer.getAccounts().values());
        } else {
            return null;
        }
    }

}
