public class Main {
    // Вводные данные
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr1 = new int[30];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100_000) + 100_000;
        }
        return arr1;
    }

    public static void main(String[] args) {
        // Тренировака
        System.out.println("Тренировка");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {902, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weightsCopy[0] = 823;
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);

        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.println(weightsCopy[i]);
        }

        int[] arr = new int[10]; // Создали массив на 10 элементов
        int arrSize = arr.length;
        System.out.println(arr.length);
        System.out.println(arr.length - 1);
        System.out.println(arrSize);
        System.out.println(arrSize - 1);
        System.out.println(" ");

        int maxWaight = -1;
        for (final int current : weights) {
            if (current > maxWaight) maxWaight = current;
        }
        System.out.println(maxWaight);

        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }
        System.out.println(" ");
        // Задание 1
        System.out.println("Задание 1");
        int [] arr1 = generateRandomArray();
        int summArr1 = 0;
        for (int i : arr1) {
            System.out.println("Сумма трат за месяц составила " + i + " рублей");
            summArr1 += i;
        }
        System.out.println("Сумма всех выплат за месяц состаила " + summArr1 + " рублей");
        System.out.println(" ");
        // Задание 2
        System.out.println("Задание 2");
        int minArr1 = 200000;
        int maxArr1 = -1;
        for (int i : arr1) {
            if (i > maxArr1) maxArr1 = i;
            if (i < minArr1) minArr1 = i;
        }
            System.out.println("Минимальная сумма трат за день составила " + minArr1 + " рублей");
            System.out.println("Максимальная сумма трат за день составила " + maxArr1 + " рублей");
        System.out.println(" ");
        // Задание 3
        System.out.println("Задание 3");
        double medArr1 = 0;
        for (int i : arr1) {
            medArr1 += i;
        }
        medArr1 = medArr1 / arr1.length;
        System.out.println("Средняя сумма трат за месяц составила " + medArr1 + " рублей");
        System.out.println(" ");
        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + " ");
        }
    }
}

