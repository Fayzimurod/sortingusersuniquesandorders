import java.util.*;

public class NumberProcessor {

    public static List<Integer> deduplicateAndSort(List<Integer> numbers) {
        Set<Integer> sortedSet = new TreeSet<>(numbers);
        return new ArrayList<>(sortedSet);
    }

    public static List<Integer> deduplicateAndSortWithStream(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted()
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 3, 2, 5, 1, 8, 9, 0, 4);

        System.out.println("Исходный список чисел: " + numbers);

        List<Integer> result1 = deduplicateAndSort(numbers);
        System.out.println("Без дубликатов, отсортировано (TreeSet): " + result1);

        List<Integer> result2 = deduplicateAndSortWithStream(numbers);
        System.out.println("Без дубликатов, отсортировано (Stream API): " + result2);

        System.out.println("Результаты одинаковы: " + result1.equals(result2));
    }
}