import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] q = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        boolean d = q[0] - q[2] == q[1] - q[3] || q[0] - q[2] == q[3] - q[1];
        boolean s = q[0] == q[2] || q[1] == q[3];
        System.out.println(d || s ? "YES" : "NO");
    }
}