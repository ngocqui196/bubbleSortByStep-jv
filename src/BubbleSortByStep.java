import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {

                    System.out.println("Đổi  " + list[i] + " với " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }

            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }

            System.out.print("Mảng hiển thị sau " + k + "' lần lặp:  ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập phần tử số" + list.length + ": ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\n Dò xem các phần tử dịch chuyển như nào nhé....");
        bubbleSortByStep(list);
    }
}
