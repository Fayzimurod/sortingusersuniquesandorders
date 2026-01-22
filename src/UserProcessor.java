import java.util.*;

public class UserProcessor {

    public static List<User> removeDuplicatesKeepOrder(List<User> users) {
        Set<User> uniqueUsers = new LinkedHashSet<>(users);
        return new ArrayList<>(uniqueUsers);
    }

    public static class UserLookup {
        private final Set<User> userSet;

        public UserLookup(List<User> users) {
            this.userSet = new HashSet<>(users); // HashSet для быстрого поиска O(1)
        }

        public boolean contains(User user) {
            return userSet.contains(user);
        }

        public boolean containsById(int id) {
            return userSet.stream().anyMatch(u -> u.getId() == id);
        }

        public Optional<User> getById(int id) {
            return userSet.stream()
                    .filter(u -> u.getId() == id)
                    .findFirst();
        }
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Иван", "ivan@mail.com"),
                new User(2, "Мария", "maria@mail.com"),
                new User(1, "Иван", "ivan@mail.com"), // Дубликат
                new User(3, "Петр", "petr@mail.com"),
                new User(2, "Мария", "maria@mail.com") // Дубликат
        );

        System.out.println("Исходный список:");
        users.forEach(System.out::println);

        List<User> uniqueUsers = removeDuplicatesKeepOrder(users);

        System.out.println("\nБез дубликатов (порядок сохранен):");
        uniqueUsers.forEach(System.out::println);

        UserLookup lookup = new UserLookup(uniqueUsers);

        User testUser = new User(1, "Иван", "ivan@mail.com");
        System.out.println("\nПроверка пользователя " + testUser.getName() + ": " +
                lookup.contains(testUser)); // true

        User newUser = new User(4, "Анна", "anna@mail.com");
        System.out.println("Проверка пользователя " + newUser.getName() + ": " +
                lookup.contains(newUser)); // false
    }
}


