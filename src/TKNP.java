import java.util.Scanner;

public class TKNP {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 10, 16};
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị cần tìm: ");
        int n = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == n) {
                System.out.println("Tìm thấy tại vị trí: " + mid);
                break;
            } else if (arr[mid] > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}