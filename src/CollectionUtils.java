import java.util.*;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static <T> List<T> removeDuplicates(List<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static <T extends Comparable<T>> List<T> deduplicateAndSort(List<T> list) {
        return new ArrayList<>(new TreeSet<>(list));
    }

    public static <T> boolean containsFast(Collection<T> collection, T element) {
        return new HashSet<>(collection).contains(element);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 3, 1, 4);
        List<Integer> sortedUniqueNumbers = deduplicateAndSort(numbers);
        System.out.println("Числа: " + sortedUniqueNumbers);

        List<String> strings = Arrays.asList("яблоко", "банан", "яблоко", "апельсин");
        List<String> sortedUniqueStrings = deduplicateAndSort(strings);
        System.out.println("Строки: " + sortedUniqueStrings);

        List<User> users = Arrays.asList(
                new User(1, "Анна", "anna@mail.com"),
                new User(2, "Борис", "boris@mail.com"),
                new User(1, "Анна", "anna@mail.com")
        );

        List<User> uniqueUsers = removeDuplicates(users);
        System.out.println("\nУникальные пользователи (порядок сохранен):");
        uniqueUsers.forEach(System.out::println);
    }
}