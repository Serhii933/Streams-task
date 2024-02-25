package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("User1", "Jack1@mail12.com"));
        users.add(new User("User2", "Kate2@mail.com"));
        users.add(new User("User3", "John3@mail123.com"));
        users.add(new User("User4", "Bob4@mail321.com"));
        users.add(new User("User5", "Dad5@mail123.com"));

        List<User> filteredUsers = UserFilter.filterUsersWith123(users);

        System.out.println("Користувачі з '123' в електронній пошті:");
        for (User user : filteredUsers) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }
    }
}

