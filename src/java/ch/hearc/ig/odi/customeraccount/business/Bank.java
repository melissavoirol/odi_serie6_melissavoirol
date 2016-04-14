package ch.hearc.ig.odi.customeraccount.business;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author steven.habegger
 */
public class Bank {

    private int number;
    private String name;
    private HashMap<String, Account> accounts;
    private HashMap<Integer, Customer> customers;
    public static int nbAcc;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.accounts = new HashMap<String, Account>();
        this.customers = new HashMap<Integer, Customer>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<String, Account> accounts) {
        this.accounts = accounts;
    }

    public HashMap<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<Integer, Customer> customers) {
        this.customers = customers;
    }

    public static int getNbAcc() {
        return nbAcc;
    }

    public static void setNbAcc(int nbAcc) {
        Bank.nbAcc = nbAcc;
    }

    public Account getAccountByNumber(String number) {
        return this.accounts.get(number);
    }

    public Customer getCustomerByNumber(int number) {
        return this.customers.get(number);
    }

    public Customer addCustomer(Integer number, String fn, String ln) {
        Customer cust = new Customer(number, fn, ln);
        customers.put(number, cust);
        return cust;
    }

    public Individual addIndividual(Integer number, String fn, String ln, Date birthDate, String email) {
        Individual ind = new Individual(number, fn, ln, birthDate, email);
        customers.put(number, ind);
        return ind;
    }

    public Company addCompany(Integer number, String companyName, String phone, String fax) {
        Company comp = new Company(number, companyName, phone, fax);
        customers.put(number, comp);
        return comp;
    }

    public void addAccount(String number, String name, double rate, Customer cust) {
        Account account = new Account(number, name, rate, cust);
        accounts.put(number, account);
        cust.addAccount(account);
    }

    //Méthode toString()
    public String accountToString() {
        int nb = 0;
        StringBuilder sb = new StringBuilder();

        sb.append("Bank N°");
        sb.append(this.number);
        sb.append("\n");
        sb.append("Name : ");
        sb.append(this.name);
        sb.append("\n");
        sb.append("Accounts : ");
        for (Account acc : this.accounts.values()) {
            sb.append(acc.accToString());
            nb = nb + 1;
        }
        sb.append("\n");
        sb.append("Nombre de compte dans la banque : ");
        sb.append(nb);
        sb.append("\n");

        return sb.toString();
    }

    public String allToString() {
        Bank.nbAcc = 0;
        StringBuilder sb = new StringBuilder();

        sb.append("Bank N°");
        sb.append(this.number);
        sb.append("\n");
        sb.append("Name : ");
        sb.append(this.name);
        sb.append("\n");
        sb.append("Accounts : ");
        for (Customer cust : this.customers.values()) {
            sb.append(cust.custToString());
        }
        sb.append("\n");
        sb.append("Nombre de compte dans la banque : ");
        sb.append(Bank.nbAcc);
        sb.append("\n");

        return sb.toString();
    }

}
