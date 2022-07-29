package classwork.map;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private String surnName;
    private String email;
    private String password;

    public User(String name, String surnName, String email, String password) {
        this.name = name;
        this.surnName = surnName;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnName() {
        return surnName;
    }

    public void setSurnName(String surnName) {
        this.surnName = surnName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surnName, user.surnName) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surnName, email, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surnName='" + surnName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }
}
