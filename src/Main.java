public class Main {
    public static void main(String[] args) {
        // Тренировака
        System.out.println("Тренировка");
        int [] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights [january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        int[] arr = new int[10]; // Создали массив на 10 элементов
        int arrSize = arr.length;
        System.out.println(arr.length);
        System.out.println(arr.length - 1);
        System.out.println(arrSize);
        System.out.println(arrSize - 1);
        System.out.println(" ");
    }
}