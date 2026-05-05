import java.util.Arrays;

public class ExchangeSort {
    public static void main(String[] args) {
        int[] numbers = {8, 5, 3, 9, 10, 2, 1};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xêp là: ");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
