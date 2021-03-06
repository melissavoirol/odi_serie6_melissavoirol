package ch.hearc.ig.odi.customeraccount.beans;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
@Named(value = "accountCreateBean")
@SessionScoped
public class AccountCreateBean implements Serializable {

    @Inject
    Services services;

    private Customer customer;
    private String number;
    private String name;
    private double rate;

    /**
     * Creates a new instance of AccountCreateBean
     */
    public AccountCreateBean() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String save() {
        services.saveAccount(number, name, rate, customer);
        this.number = null;
        this.name = null;
        this.rate = 0.0;
        return "validate";
    }

}
