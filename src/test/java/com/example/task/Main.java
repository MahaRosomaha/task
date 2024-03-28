package com.example.task;

public class Main {
  public static void main(String[] args) {
    // Заданный массив целых чисел
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Вывод чётных чисел из массива
    System.out.println("Чётные числа в массиве:");
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.println(number);
      }
    }
  }
}
// 
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ввод двух целых чисел a и b
    System.out.print("Введите первое целое число (a): ");
    int a = scanner.nextInt();

    System.out.print("Введите второе целое число (b): ");
    int b = scanner.nextInt();

    // Сравнение двух чисел и вывод результата
    if (a > b) {
      System.out.println("a > b");
    } else if (a < b) {
      System.out.println("a < b");
    } else {
      System.out.println("a = b");
    }

    // Выполнение операций над числами и вывод результатов
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));

    // Проверка деления на ноль перед выполнением операции деления
    if (b != 0) {
      System.out.println("a / b = " + ((double) a / b));
    } else {
      System.out.println("Деление на ноль невозможно.");
    }

    System.out.println("a * b = " + (a * b));

    scanner.close(); // Закрываем сканнер
  }
}
// 
package com.example.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine();

        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}
