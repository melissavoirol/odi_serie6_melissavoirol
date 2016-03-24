package ch.hearc.ig.odi.customeraccount.business;

/**
 *
 * @author steven.habegger
 */
public class Company extends Customer {

    private String companyName;
    private String phone;
    private String fax;

    public Company(Integer number, String companyName, String phone, String fax) {
        super(number);
        this.companyName = companyName;
        this.phone = phone;
        this.fax = fax;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Company{" + "companyName=" + companyName + ", phone=" + phone + ", fax=" + fax + '}';
    }

}
