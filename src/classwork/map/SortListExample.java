package classwork.map;

import java.util.ArrayList;
import java.util.List;

public class SortListExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user1 = new User("pogos", "poghosyan", "poghos@gmail.com", "poghos");
        User user2 = new User("petros", "petrosyan", "petros@gmail.com", "petros");
        User user3 = new User("tigran", "tigranyanyan", "tigran@gmail.com", "tigran");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        System.out.println("Before sort");
        for (User user : userList) {
            System.out.println(user);
        }

        //Collections.sort(userList);
        userList.sort(new UserEmailComparator());

        System.out.println("After sort");
        for (User user : userList) {
            System.out.println(user);
        }
    }
}