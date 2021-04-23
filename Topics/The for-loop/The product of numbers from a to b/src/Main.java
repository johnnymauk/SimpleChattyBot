import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {sc.nextInt(), sc.nextInt()};
        long prod = 1;
        for (int ii = nums[0]; ii < nums[1]; ii++) {
            prod *= ii;
        }
        System.out.println(prod);
    }
}