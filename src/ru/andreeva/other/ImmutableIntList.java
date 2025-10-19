package ru.andreeva.other;

import java.util.Arrays;

public final class ImmutableIntList {
    private final int[] values;

    // Конструктор, который принимает и массив, и список чисел
    public ImmutableIntList(int... values) {
        this.values = Arrays.copyOf(values, values.length);
    }

    // Конструктор, который копирует из другого ru.surename.other.ImmutableIntList
    public ImmutableIntList(ImmutableIntList other) {
        this.values = Arrays.copyOf(other.values, other.values.length);
    }

    // Получаем значение по индексу
    public int get(int index) {
        checkIndex(index);
        return values[index];
    }

    // Устанавливаем новое значение по индексу
    public ImmutableIntList set(int index, int newValue) {
        checkIndex(index);
        int[] copy = Arrays.copyOf(values, values.length);
        copy[index] = newValue;
        return new ImmutableIntList(copy);
    }

    // Пустой ли список
    public boolean isEmpty() {
        return values.length == 0;
    }

    // Размер списка
    public int size() {
        return values.length;
    }

    // Возвращает копию в виде обычного int[]
    public int[] toArray() {
        return Arrays.copyOf(values, values.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    // Проверка на корректность индекса
    private void checkIndex(int index) {
        if (index < 0 || index >= values.length) {
            throw new IndexOutOfBoundsException(
                    "Индекс " + index + " вне диапазона (0.." + (values.length - 1) + ")"
            );
        }
    }
}
