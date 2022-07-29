package classwork.collections.comparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>(new UserEmailComparator());
        User user1 = new User("pogos", "poghosyan", "poghos@gmail.com", "poghos");
        User user2 = new User("petros", "petrosyan", "petros@gmail.com", "petros");
        User user3 = new User("tigran", "tigranyan", "tigran@gmail.com", "tigran");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
