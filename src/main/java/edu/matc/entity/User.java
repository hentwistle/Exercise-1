package edu.matc.entity;

// TODO Add instance variable for the date of birth
// TODO Add a calculation for the user's age. Age should not be stored, it should be calculated only.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * A class to represent a user.
 *
 * @author pwaite
 */
public class User {
    private String firstName;
    private String lastName;
    private String userid;
    private LocalDate birthdate;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userid    the userid
     * @param birthdate the birthdate
     */
    public User(String firstName, String lastName, String userid, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userid = userid;
        this.birthdate = birthdate;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }


    /**
     * Gets birthdate
     *
     * @return the birthdate
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * Sets birthdate.
     *
     * @param birthdate the birthdate
     */
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


    public int calculateAge() {
        LocalDate now = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthdate, now);

        return (int)age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userid='" + userid + '\'' +
                ", birthdate=' " + birthdate + '\'' +
                '}';
    }


}