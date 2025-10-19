package ru.andreeva.main;

public class PowerCalculator {

    // Метод принимает две строки, возвращает X^Y
    public static double powFromStrings(String xStr, String yStr) {
        // Преобразуем строки в числа
        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);

        // Возводим x в степень y и возвращаем результат
        return Math.pow(x, y);
    }

}
