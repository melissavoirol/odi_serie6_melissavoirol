package ch.hearc.ig.odi.customeraccount.beans;

import ch.hearc.ig.odi.customeraccount.business.Account;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
@Named(value = "accountDetailsBean")
@RequestScoped
public class AccountDetailsBean {
    
    private Account account;

    /**
     * Creates a new instance of AccountDetailsBean
     */
    public AccountDetailsBean() {
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
