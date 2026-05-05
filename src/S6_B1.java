import java.util.Arrays;
import java.util.Scanner;

public class S6_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sinh viên: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int currentIndex = 0;

        do {
            System.out.println("\n******************QUẢN LÝ ĐIỂM SV****************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình của các sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Chọn ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ":");
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Danh sách điểm");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("\nĐiểm sinh viên thứ %d là %d", (i + 1), arr[i]);
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    int avg = sum / n;
                    System.out.println("Điểm trung bình của các sinh viên là: " + avg);
                    break;
                case 4:
                    int max = arr[0], min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Điểm cao nhất: " + max);
                    System.out.println("Điểm thấp nhất: " + min);
                    break;
                case 5:
                    int counDat = 0, counTruot = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] >= 5) {
                            counDat++;
                        } else {
                            counTruot++;
                        }
                    }
                    System.out.println("Số lượng sinh viên đạt : " + counDat);
                    System.out.println("Số lượng sinh viên trượt : " + counTruot);
                    break;
                case 6:
                    Arrays.sort(arr);
                    System.out.println("Danh sách điểm tăng dần");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 7:
                    int coun = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] >= 8) {
                            coun++;
                        }
                    }
                    System.out.println("Số lượng sinh viên giỏi và xuất sắc : " + coun);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1-8");
            }
        } while (true);
    }
}
