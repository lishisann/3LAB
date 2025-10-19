package ru.andreeva.main;

public class Addition implements Summable {
    private double[] numbers;

    // Конструктор принимает набор чисел
    public Addition(double... numbers) {
        this.numbers = numbers;
    }

    // Реализация метода интерфейса
    @Override
    public double sum() {
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }
}
