import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();

        int[][] array = new int[n][m];

        int ch;
        do {
            System.out.println("\n***** MENU *****");
            System.out.println("1. Nhập mảng");
            System.out.println("2. In mảng");
            System.out.println("3. Tính tổng phần tử biên");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("array[%d][%d] = ", i, j);
                            array[i][j] = sc.nextInt();
                        }
                    }
                    break;

                case 2:
                    System.out.println("Mảng:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("%5d", array[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                                sum += array[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng phần tử biên = " + sum);
                    break;

                case 4:
                    System.out.println("Thoát.");
                    sc.close();
                    return;

                default:
                    System.out.println("Chọn sai!");
            }

        } while (true);
    }
}