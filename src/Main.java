import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập số hàng của mảng: ");
       int row = sc.nextInt();
       System.out.print("Nhập số cột của mảng: ");
       int col = sc.nextInt();
       int[][] matrix = new int[row][col];

       int chan = 0, le = 0;
       System.out.println("Nhập các phần tử của mảng:");
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
               System.out.printf("Phần tử [%d][%d]: ", i, j);
               matrix[i][j] = sc.nextInt();
               if (matrix[i][j] % 2 == 0) {
                   chan += matrix[i][j];
               } else {
                   le += matrix[i][j];
               }
           }
       }
       System.out.println("Tổng các số chẵn: " + chan);
       System.out.println("Tổng các số lẻ: " + le);
    }
}
