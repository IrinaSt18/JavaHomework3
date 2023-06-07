package Homework3;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

        public static void main(String[] args) {
            // Создаем список чисел и заполняем его случайными значениями
            List<Integer> numbers = IntStream.range(0, 20)
                    .mapToObj(i -> new Random().nextInt(100))
                    .collect(Collectors.toList());

            // Удаляем четные числа из списка
            numbers.removeIf(number -> number % 2 == 0);

            // Находим минимальное значение с использованием Collections
            int min = Collections.min(numbers);

            // Находим максимальное значение
            int max = Collections.max(numbers);

            // Находим среднее значение
            double average = numbers.stream()
                    .mapToDouble(Integer::doubleValue)
                    .average()
                    .orElse(0);

            // Выводим результаты на консоль
            System.out.println("Исходный список чисел: " + numbers);
            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее значение: " + average);
        }
    }


