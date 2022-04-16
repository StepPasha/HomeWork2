package ru.gb.stepanov;

public class Task1 {
    public static void main(String[] args) {
        boolean result;
        result = method1020(4, 10);

    }

    public static boolean method1020(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}

