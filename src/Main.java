import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(12);
//        numbers.add(7);
//        numbers.add(24);
//        numbers.add(15);
//        numbers.add(8);
//        numbers.add(30);
//        numbers.add(11);
//        numbers.add(4);
//        numbers.add(18);
// //        System.out.println("Исходный список: " + numbers);
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            Integer number = iterator.next();
//            if (number % 2 == 0 && number > 10) {
//                iterator.remove();
//            }
//        }
// // 1 option 1 exercise
//        ArrayList<Integer> numbers = new ArrayList<>();
//        int[] values = {5, 12, 7, 24, 15, 8, 30, 11, 4, 18};
//        for (int value : values) {
//            numbers.add(value);
//        }
//        System.out.println("Исходный список: " + numbers);
//        for (int i = numbers.size() - 1; i >= 0; i--) {
//            int number = numbers.get(i);
//            if (number % 2 == 0 && number > 10) {
//                numbers.remove(i);
//            }
//        }
//        System.out.println("Список после удаления четных чисел больше 10: " + numbers);
// // 2 option 1 exercise
//        LinkedList<String> queue = new LinkedList<>();
//        queue.add("Клиент 1");
//        queue.add("Клиент 2");
//        queue.add("Клиент 3");
//        queue.add("Клиент 4");
//        queue.add("Клиент 5");
//        System.out.println("После добавления 5 клиентов: " + queue);
//        queue.poll();
//        queue.poll();
//        System.out.println("После обслуживания 2 клиентов: " + queue);
//        queue.offer("Новый клиент");
//        System.out.println("Текущая очередь: " + queue);
//        System.out.println("Следующий к обслуживанию: " + queue.peek());
// // 1 option 2 exercise
//        LinkedList<String> customerQueue = new LinkedList<>();
//        System.out.println("=== Управление очередью клиентов ===");
//        System.out.println("1. Добавляем 5 клиентов в очередь:");
//        customerQueue.addLast("Иван Иванов");
//        customerQueue.addLast("Петр Петров");
//        customerQueue.addLast("Мария Сидорова");
//        customerQueue.addLast("Анна Кузнецова");
//        customerQueue.addLast("Сергей Смирнов");
//        System.out.println("   Текущая очередь: " + customerQueue);
//        System.out.println("   Количество клиентов в очереди: " + customerQueue.size());
//        System.out.println("2. Обслуживаем первых двух клиентов:");
//        if (!customerQueue.isEmpty()) {
//            String firstCustomer = customerQueue.removeFirst();
//            System.out.println("   Обслужен: " + firstCustomer);
//        }
//        if (!customerQueue.isEmpty()) {
//            String secondCustomer = customerQueue.removeFirst();
//            System.out.println("   Обслужен: " + secondCustomer);
//        }
//        System.out.println("   Очередь после обслуживания: " + customerQueue);
//        System.out.println("   Количество клиентов в очереди: " + customerQueue.size());
//        System.out.println("3. Добавляем нового клиента в конец очереди:");
//        customerQueue.addLast("Елена Васильева");
//        System.out.println("   Новый клиент добавлен: Елена Васильева");
//        System.out.println("4. Текущее состояние очереди:");
//        System.out.println("   Очередь: " + customerQueue);
//        System.out.println("   Первый в очереди: " + customerQueue.peekFirst());
//        System.out.println("   Последний в очереди: " + customerQueue.peekLast());
//        System.out.println("   Количество клиентов в очереди: " + customerQueue.size());
//        System.out.println("=== Дополнительно: продолжаем обслуживание ===");
//        while (!customerQueue.isEmpty()) {
//            String customer = customerQueue.removeFirst();
//            System.out.println("   Обслужен: " + customer);
//            System.out.println("   Осталось в очереди: " + customerQueue);
//        }
//        System.out.println("Очередь пуста. Все клиенты обслужены!");
// // 2 option 2 exercise
    }
}
