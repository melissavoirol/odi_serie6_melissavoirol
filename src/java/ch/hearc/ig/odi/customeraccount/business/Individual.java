package ch.hearc.ig.odi.customeraccount.business;

import java.util.Date;

/**
 *
 * @author Melissa Voirol <melissa.voirol@he-arc.ch>
 */
public class Individual extends Customer {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;

    public Individual(Integer number, String firstName, String lastName, Date birthDate, String email) {
        super(number);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Individual{" + "firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", email=" + email + '}';
    }

}
