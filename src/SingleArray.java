import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] studentNames = new String[10];

        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
        }

        System.out.println("\nTên các sinh viên là:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }


        Scanner sc1 = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = sc1.nextInt();
        int[] score = new int[n];

        int choice;
        int sum;

        do {
            System.out.println("\n***** MENU *****");
            System.out.println("1. Nhập mảng");
            System.out.println("2. Tính tổng");
            System.out.println("3. In số lẻ");
            System.out.println("4. In số lượng phần tử chia hết cho 3");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");

            choice = sc1.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập giá trị thứ " + (i + 1) + ": ");
                        score[i] = sc1.nextInt();
                    }
                    break;

                case 2:
                    sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += score[i];
                    }
                    System.out.println("Tổng = " + sum);
                    break;

                case 3:
                    System.out.println("Các phần tử lẻ:");
                    for (int i = 0; i < n; i++) {
                        if (score[i] % 2 != 0) {
                            System.out.print(score[i] + " ");
                        }
                    }
                    break;

                case 4:
                    int dem = 0;

                    for (int i = 0; i < n; i++) {
                        if (score[i] % 3 == 0) {
                            dem += 1;
                        }
                    }
                    System.out.printf("Số lượng phần tử chia hết cho 3:" + dem);
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 5);
    }
}