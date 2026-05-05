import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số lượng phần tử của mảng: ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        System.out.println("Nhập các phần tử của mảng:");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Phần tử thứ %d: ", (i+1));
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (a[i] < a[j]) {
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        System.out.println("Mảng sau khi sắp xếp giảm dần: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số hàng của mảng: ");
//        int row = sc.nextInt();
//        System.out.print("Nhập số cột của mảng: ");
//        int col = sc.nextInt();
//        int[][] matrix = new int[row][col];
//
//        int chan = 0, le = 0;
//        System.out.println("Nhập các phần tử của mảng:");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.printf("Phần tử [%d][%d]: ", i, j);
//                matrix[i][j] = sc.nextInt();
//                if (matrix[i][j] % 2 == 0) {
//                    chan += matrix[i][j];
//                } else {
//                    le += matrix[i][j];
//                }
//            }
//        }
//        System.out.println("Tổng các số chẵn: " + chan);
//        System.out.println("Tổng các số lẻ: " + le);


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số lượng phần tử của mảng: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Nhập các phần tử của mảng:");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Phần tử thứ %d: ", (i + 1));
//            arr[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        System.out.println("Mảng sau khi sắp xếp giảm dần:");
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }
//
//        System.out.print("\nNhập số cần tìm: ");
//        int search = sc.nextInt();
//
//        int vttt = -1;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == search) {
//                vttt = i;
//                break;
//            }
//        }
//        System.out.printf("Tìm kiếm tuyến tính: Số %d có tại vị trí %d\n", search, vttt);
//
//        int left = 0, right = n - 1;
//        int vtnp = -1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (arr[mid] == search) {
//                vtnp = mid;
//                break;
//            } else if (arr[mid] < search) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//
//        System.out.printf("Tìm kiếm nhị phân: Số %d có tại vị trí %d\n", search, vtnp);


//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nhập số lượng phần tử: ");
//        int n = sc.nextInt();
//        int[] inp = new int[n];
//
//        if (n == 0) {
//            System.out.println("Mảng không có phần tử");
//        } else {
//
//            for (int i = 0; i < n; i++) {
//                System.out.printf("Phần tử thứ %d: ", (i + 1));
//                inp[i] = sc.nextInt();
//            }
//
//            int[] chan = new int[n];
//            int[] le = new int[n];
//            int a = 0, b = 0;
//
//            for (int i = 0; i < n; i++) {
//                if (inp[i] % 2 == 0) {
//                    chan[a++] = inp[i];
//                } else {
//                    le[b++] = inp[i];
//                }
//            }
//
//
//            for (int i = 0; i < a; i++) {
//                System.out.print(chan[i] + " ");
//            }
//            for (int i = 0; i < b; i++) {
//                System.out.print(le[i] + " ");
//            }
//        }


//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nhập mảng: ");
//        String input = sc.nextLine();
//
//        if (input == "") {
//            System.out.println("Mảng không có phần tử");
//            return;
//        }
//
//        String[] parts = input.split(" ");
//        int[] arr = new int[parts.length];
//
//        for (int i = 0; i < parts.length; i++) {
//            arr[i] = Integer.parseInt(parts[i]);
//        }
//
//        int[] chan = new int[parts.length];
//        int[] le = new int[parts.length];
//        int a = 0, b = 0;
//
//        for (int i = 0; i < parts.length; i++) {
//            if (arr[i] % 2 == 0) {
//                chan[a++] = arr[i];
//            } else {
//                le[b++] = arr[i];
//            }
//        }
//
//        for (int i = 0; i < a; i++) {
//            System.out.print(chan[i] + " ");
//        }
//        for (int i = 0; i < b; i++) {
//            System.out.print(le[i] + " ");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số lượng sinh viên: ");
//        int n = sc.nextInt();
//        Float[] arr = new Float[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Nhập điểm sinh viên thứ %d: ", (i+1));
//            arr[i] = sc.nextFloat();
//        }
//
//        do {
//            System.out.println("\n--- QUẢN LÝ ĐIỂM SINH VIÊN ---");
//            System.out.println("1. Xem tất cả điểm");
//            System.out.println("2. Sắp xếp điểm");
//            System.out.println("3. Tìm kiểm điểm");
//            System.out.println("4. Thống kê điểm");
//            System.out.println("5. Thoát");
//            System.out.print("Lựa chọn của bạn: ");
//
//            int ch = sc.nextInt();
//            switch (ch) {
//                case 1:
//                    System.out.println("Danh sách điểm: ");
//                    for (int i = 0; i < n; i++) {
//                        System.out.printf("\nSinh viên %d: %.1f", (i + 1), arr[i]);
//                    }
//                    break;
//                case 2:
//                    System.out.println("Chọn cách sắp xếp:");
//                    System.out.println("1. Tăng dần");
//                    System.out.println("2. Giảm dần");
//                    int ch2 = sc.nextInt();
//                    switch (ch2) {
//                        case 1:
//                            Arrays.sort(arr);
//                            System.out.println("Đã sắp xếp tăng dần.");
//                            for (int i = 0; i < n; i++) {
//                                System.out.print(arr[i] + " ");
//                            }
//                            break;
//                        case 2:
//                            for (int i = 0; i < n - 1; i++) {
//                                for (int j = i + 1; j < n; j++) {
//                                    if (arr[i] < arr[j]) {
//                                        Float temp = arr[i];
//                                        arr[i] = arr[j];
//                                        arr[j] = temp;
//                                    }
//                                }
//                            }
//                            System.out.println("Đã sắp xếp giảm dần.");
//                            for (int i = 0; i < n; i++) {
//                                System.out.print(arr[i] + " ");
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                    break;
//                case 3:
//                    System.out.print("Nhập điểm cần tìm: ");
//                    float ch3 = sc.nextFloat();
//
//                    int vttt = -1;
//                    for (int i = 0; i < n; i++) {
//                        if (arr[i] == ch3) {
//                            vttt = i;
//                            break;
//                        }
//                    }
//                    System.out.println("Tìm kiếm tuyến tính: Tìm thấy tại vị trí " + vttt);
//
//                    Arrays.sort(arr);
//                    int left = 0, right = arr.length - 1;
//                    int vtnp = -1;
//
//                    while (left <= right) {
//                        int mid = left + (right - left) / 2;
//                        if (arr[mid] == ch3) {
//                            vtnp = mid;
//                            break;
//                        } else if (arr[mid] > ch3) {
//                            right = mid - 1;
//                        } else {
//                            left = mid + 1;
//                        }
//                    }
//                    System.out.println("Tìm kiếm nhị phân (mảng tăng dần): Tìm thấy tại vị trí " + vtnp);
//                    break;
//
//                case 4:
//                    float sum = 0;
//                    int cnt = 0;
//                    float min = arr[0], max = arr[0];
//
//                    for (int i = 0; i < n; i++) {
//                        sum += arr[i];
//                        if (arr[i] > max) max = arr[i];
//                        if (arr[i] < min) min = arr[i];
//                        if (arr[i] > 5) cnt++;
//                    }
//
//                    System.out.printf("Điểm trung bình: %.1f\n", (sum / n));
//                    System.out.printf("Điểm cao nhất: %.1f\n", max);
//                    System.out.printf("Điểm thấp nhất: %.1f\n", min);
//                    System.out.printf("Số sinh viên có điểm trên trung bình: %d\n", cnt);
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Vui lòng nhập từ 1-5");
//                    break;
//            }
//        } while (true);


        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        Float[] arr = new Float[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập lương nhân viên %d: ", (i+1));
            arr[i] = sc.nextFloat();
        }

        do {
            System.out.println("\n--- QUẢN LÝ ĐIỂM LƯƠNG NHÂN VIÊN ---");
            System.out.println("1. Xem danh sách lương");
            System.out.println("2. Sắp xếp lương");
            System.out.println("3. Tìm kiểm lương");
            System.out.println("4. Thống kê lương");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Danh sách lương nhân viên: ");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Nhân viên %d: %.1f", (i + 1), arr[i]);
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Chọn cách sắp xếp:");
                    System.out.println("1. Tăng dần");
                    System.out.println("2. Giảm dần");
                    int ch2 = sc.nextInt();
                    switch (ch2) {
                        case 1:
                            Arrays.sort(arr);
                            System.out.println("Đã sắp xếp lương tăng dần.");
                            for (int i = 0; i < n; i++) {
                                System.out.print(arr[i] + " ");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < n - 1; i++) {
                                for (int j = i + 1; j < n; j++) {
                                    if (arr[i] < arr[j]) {
                                        Float temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                    }
                                }
                            }
                            System.out.println("Đã sắp xếp lương giảm dần.");
                            for (int i = 0; i < n; i++) {
                                System.out.print(arr[i] + " ");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Nhập lương cần tìm: ");
                    float ch3 = sc.nextFloat();

                    int vttt = -1;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == ch3) {
                            vttt = i;
                            break;
                        }
                    }
                    if (vttt != -1) {
                        System.out.println("Linear Search: Tìm thấy tại vị trí " + vttt);
                    } else {
                        System.out.println("Linear Search: Không tìm thấy");
                    }

                    Arrays.sort(arr);
                    int left = 0, right = arr.length - 1;
                    int vtnp = -1;

                    while (left <= right) {
                        int mid = left + (right - left) / 2;
                        if (arr[mid] == ch3) {
                            vtnp = mid;
                            break;
                        } else if (arr[mid] > ch3) {
                            right = mid - 1;
                        } else {
                            left = mid + 1;
                        }
                    }
                    if (vtnp != -1) {
                        System.out.println("Binary Search (mảng tăng dần): Tìm thấy tại vị trí " + vtnp);
                    } else {
                        System.out.println("Binary Search (mảng tăng dần): Không tìm thấy");
                    }
                    break;

                case 4:
                    float sum = 0;
                    int cnt = 0;
                    float min = arr[0], max = arr[0];

                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                        if (arr[i] > max) max = arr[i];
                        if (arr[i] < min) min = arr[i];
                    }
                    Float avg = sum / n;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > avg) {
                            cnt++;
                        }
                    }

                    System.out.printf("Tổng lương: %.1f\n", sum);
                    System.out.printf("Điểm trung bình: %f\n", avg);
                    System.out.printf("Điểm cao nhất: %.1f\n", max);
                    System.out.printf("Điểm thấp nhất: %.1f\n", min);
                    System.out.printf("Số nhân viên có lương trên trung bình: %d\n", cnt);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1-5");
                    break;
            }
        } while (true);
    }
}
