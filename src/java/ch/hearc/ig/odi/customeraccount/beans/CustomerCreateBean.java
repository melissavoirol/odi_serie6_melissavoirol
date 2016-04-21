package ch.hearc.ig.odi.customeraccount.beans;

import ch.hearc.ig.odi.customeraccount.services.Services;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
@Named(value = "customerCreateBean")
@RequestScoped
public class CustomerCreateBean {
    
    @Inject
    Services services;
    
    private int number;
    private String firstName;
    private String lastName;

    /**
     * Creates a new instance of CustomerCreateBean
     */
    public CustomerCreateBean() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void save() {
        services.saveCustomer(number, firstName, lastName);
    }
    
}
