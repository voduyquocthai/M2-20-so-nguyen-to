import java.util.Scanner;

public class SoNguyenTo20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in: ");
        int numbers = input.nextInt();
        int N = 2;

        for (int count = 0; count < numbers; N++){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
                count++;
            }
        }
    }
}
