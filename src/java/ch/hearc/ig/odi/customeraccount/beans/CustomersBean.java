package ch.hearc.ig.odi.customeraccount.beans;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
@Named(value = "CustomersBean")
@RequestScoped
public class CustomersBean {

    @Inject
    Services services;

    /**
     * Creates a new instance of CustomersBean
     */
    public CustomersBean() {
    }

    public List<Customer> getCustomers() {
        return services.getCustomersList();
    }

}
