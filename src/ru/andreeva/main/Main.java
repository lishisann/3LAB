package ru.andreeva.main;

import ru.andreeva.geometry.Line;
import ru.andreeva.geometry.Polyline;
import ru.andreeva.geometry.Square;
import ru.andreeva.points.Point2D;
import ru.andreeva.points.Point3D;
import ru.andreeva.points.Point1;
import ru.andreeva.points.Point2;
import ru.andreeva.points.Point3;
import ru.andreeva.other.ImmutableIntList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите упражнение для запуска:");
            System.out.println("1 — exercise_1_6");
            System.out.println("2 — exercise_1_12");
            System.out.println("3 — exercise_2_1");
            System.out.println("4 — exercise_3_5");
            System.out.println("5 — exercise_4_5");
            System.out.println("6 — exercise_5_1");
            System.out.println("7 — exercise_6_3");
            System.out.println("8 — exercise_7_3");
            System.out.println("9 — exercise_8_5");
            System.out.println("0 — Выход");
            System.out.print("Введите номер: ");

            int choice = scanner.nextInt();
            System.out.println();

            if (choice == 0) {
                System.out.println("Выход из программы...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("exercise_1_6");
                    exercise_1_6();
                    break;
                case 2:
                    System.out.println("exercise_1_12");
                    exercise_1_12();
                    break;
                case 3:
                    System.out.println("exercise_2_1");
                    exercise_2_1();
                    break;
                case 4:
                    System.out.println("exercise_3_5");
                    exercise_3_5();
                    break;
                case 5:
                    System.out.println("exercise_4_5");
                    exercise_4_5();
                    break;
                case 6:
                    System.out.println("exercise_5_1");
                    exercise_5_1();
                    break;
                case 7:
                    System.out.println("exercise_6_3");
                    exercise_6_3();
                    break;
                case 8:
                    System.out.println("exercise_7_3");
                    exercise_7_3();
                    break;
                case 9:
                    System.out.println("exercise_8_5");
                    exercise_8_5();
                    break;
                default:
                    System.out.println("Неверный выбор");
            }

            System.out.println("\n");
        }

        scanner.close();
    }

    public static void exercise_8_5() {
        Line original = new Line(1, 2, 3, 4);
        System.out.println("Оригинал: " + original);

        // Копируем линию
        Line copy = original.clone();
        System.out.println("Копия: " + copy);

        // Меняем точку начала копии
        copy.setStart(new Point2D(10, 20));
        System.out.println("\nПосле изменения копии:");
        System.out.println("Оригинал: " + original);
        System.out.println("Копия: " + copy);
    }

    public static void exercise_7_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X: ");
        String xStr = scanner.nextLine();

        System.out.print("Введите Y: ");
        String yStr = scanner.nextLine();

        double result = PowerCalculator.powFromStrings(xStr, yStr);

        System.out.println("Результат: " + result);
    }


    public static void exercise_6_3() {
        Point2D point1 = new Point2D(0, 0);
        Point2D point2 = new Point2D(3, 4);

        Point2D point3 = new Point2D(0, 0);
        Point2D point4 = new Point2D(3, 4);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        if (line1.equals(line2)) {
            System.out.println("Линии одинаковые!");
        } else {
            System.out.println("Линии разные!");
        }
    }

    public static void exercise_5_1() {
        Summable addition1 = new Addition(2, (double)3/5, 2.3);
        System.out.println("Сумма 1: " + addition1.sum());

        Summable addition2 = new Addition(3.6,(double)49/12, 3, 3.2);
        System.out.println("Сумма 2: " + addition2.sum());

        Summable addition3 = new Addition((double)1/3, 1);
        System.out.println("Сумма 3: " + addition3.sum());
    }

    public static void exercise_4_5() {
        Point1 point1 = new Point1(3);
        point1.setColor("red");

        Point3 point3 = new Point3(4, 2, 5);
        point3.setCreateTime("11:00");

        Point2 point2 = new Point2(7, 7);
        point2.setCreateTime("15:35");
        point2.setColor("yellow");

        System.out.print("Точка с одной координатой и цветом: ");
        System.out.println(point1);

        System.out.print("Точка с тремя координатами и временем: ");
        System.out.println(point3);

        System.out.print("Точка с двумя координатами, цветом и временем: ");
        System.out.println(point2);
    }

    public static void exercise_3_5() {
        Point3D point3D = new Point3D(10, 5, 7);

        System.out.print("Точка в трехмерном пространстве: ");
        System.out.println(point3D);

        System.out.println("Получаем X и Y благодаря методам родительского класса (Point): ");
        System.out.println("X: " + point3D.getX());
        System.out.println("Y: " + point3D.getY());

        point3D.shiftPointTo(11, 6, 3);
        System.out.print("Точка после сдвига: ");
        System.out.println(point3D);
    }

    public static void exercise_2_1() {
        ImmutableIntList list1 = new ImmutableIntList(new int[]{1, 2, 3});
        System.out.println("list1: " + list1);

        // Создание через varargs
        ImmutableIntList list2 = new ImmutableIntList(10, 20, 30, 40);
        System.out.println("list2: " + list2);

        // Создание из другого списка
        ImmutableIntList list3 = new ImmutableIntList(list1);
        System.out.println("list3 (копия list1): " + list3);

        // Получение элемента
        System.out.println("Элемент под индексом 1: " + list1.get(1));

        // Замена значения (создаёт новый объект)
        ImmutableIntList list4 = list1.set(1, 99);
        System.out.println("list4 (после замены): " + list4);
        System.out.println("Исходный list1 не изменился: " + list1);

        // Проверка пустоты и размера
        ImmutableIntList empty = new ImmutableIntList();
        System.out.println("Пустой список? " + empty.isEmpty());
        System.out.println("Размер list2: " + list2.size());

        // Получение стандартного массива
        int[] arr = list2.toArray();
        System.out.print("Массив из list2: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }



    public static void exercise_1_12() {
        Square square = new Square(new Point2D(5, 3), 23);
        Polyline polyline = square.getPolyline();

        System.out.print("Длина полученной лини: ");
        System.out.println(polyline.getLength());

        polyline.shiftPointToByIndex(4, 15, 25);

        System.out.print("Длина полученной лини после сдвига последней точки: ");
        System.out.println(polyline.getLength());
    }

    public static void exercise_1_6() {
        Point2D point2D1 = new Point2D(0, 0);
        Point2D point2D2 = new Point2D(3, 4);

        Line line1 = new Line(point2D1, point2D2);
        Line line2 = new Line(point2D1, point2D2);

        // Меняем point1 - линии не должны измениться
        point2D1.setX(100);
        point2D1.setY(100);

        System.out.println(line1); // Линия от (0,0) до (3,4)
        System.out.println(line2); // Линия от (0,0) до (3,4)
        System.out.println(point2D1);    // Точка (100,100)

        line1.setStart(new Point2D(10, 2));
        line1.setEnd(new Point2D(5, 18));

        System.out.println(line1.getStart());
        System.out.println(line1.getEnd());
    }
}