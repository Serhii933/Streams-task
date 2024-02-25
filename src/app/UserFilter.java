package app;

import java.util.List;
import java.util.stream.Collectors;

public class UserFilter {
    public static List<User> filterUsersWith123(List<User> users) {
        return users.stream()
                .filter(user -> user.getEmail().contains("123"))
                .collect(Collectors.toList());
    }
}
