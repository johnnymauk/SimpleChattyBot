import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        for (int ii = 0; ii < 1000; ii++) {
            if (n[0] * Math.pow(ii, 3) + n[1] * Math.pow(ii, 2) + n[2] * ii + n[3] == 0) {
                System.out.println(ii);
            }
        }
    }
}