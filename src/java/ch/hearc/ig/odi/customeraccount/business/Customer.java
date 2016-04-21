package ch.hearc.ig.odi.customeraccount.business;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private int number;
    private String firstName;
    private String lastName;
    private Map<String, Account> accounts;  //Converti en Map car Collection<Account> accounts; depuis VP

    public Customer() {

    }

    public Customer(Integer number) {
        this.number = number;
        this.accounts = new HashMap();
    }

    public Customer(Integer number, String fn, String ln) {
        this.number = number;
        this.firstName = fn;
        this.lastName = ln;
        this.accounts = new HashMap();
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

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public Account getAccountByNumber(String number) {
        return accounts.get(number);
    }

    public void addAccount(Account account) {
        this.accounts.put(account.getNumber(), account);
    }

    @Override
    public String toString() {
        return "Customer{" + "number=" + number + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }

}
