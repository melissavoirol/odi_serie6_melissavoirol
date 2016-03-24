package ch.hearc.ig.odi.customeraccount.business;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private Map<String, Account> accounts;  //Converti en Map car Collection<Account> accounts; depuis VP
    private int number;

    public Customer(Integer number) {
        this.number = number;
        this.accounts = new HashMap();
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Account getAccountByNumber(String number) {
        return this.accounts.get(number);
    }

    public void addAccount(Account account) {
        accounts.put(account.getNumber(), account);
    }

    //Méthode toString()
    public String custToString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Customer N°");
        sb.append(this.number);
        sb.append("\n");
        sb.append("Accounts : ");
        for (Account acc : this.accounts.values()) {
            sb.append(acc.accToString());
            Bank.nbAcc = Bank.nbAcc + 1;
        }
        sb.append("\n");

        return sb.toString();
    }

}
