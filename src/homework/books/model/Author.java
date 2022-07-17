package homework.books.model;

import java.util.Date;

import static homework.books.util.DateUtil.dateToString;

public class Author {
    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private Date registrationDate;

    public Author(String name, String surname, String email, Gender gender, Date registrationDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
        this.registrationDate = registrationDate;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", registrationDate=" + dateToString(registrationDate) +
                '}';
    }
}
