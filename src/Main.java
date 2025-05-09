public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] expenses = {1765, 6782, 76543, 762, 123};
        int sum = 0;
        for (int element : expenses) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        expenses = new int[]{1345, 890, 1298, 23456, 78};
        int maxExpenses = expenses[0];
        int minExpenses = expenses[0];
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");
        System.out.println("Минмальная сумма трат за неделю составила " + minExpenses + " рублей");

        //Задача 3
        expenses = new int[]{2345, 7890, 42789, 988, 52};
        double total = 0;
        for (int value : expenses)
            total += value;
        total = total / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + total + " рублей");

        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}

