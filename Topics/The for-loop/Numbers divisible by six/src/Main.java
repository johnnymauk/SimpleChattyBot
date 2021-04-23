import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int total = 0;
        for (int ii = 0; ii < nums; ii++) {
            int temp = sc.nextInt();
            total += temp % 6 == 0 ? temp : 0;
        }
        System.out.println(total);
    }
}