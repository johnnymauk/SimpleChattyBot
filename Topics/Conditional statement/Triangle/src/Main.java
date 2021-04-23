import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        boolean isT = s[0] + s[1] > s[2] && s[2] + s[0] > s[1] && s[1] + s[2] > s[0];
        System.out.println(isT ? "YES" : "NO");
    }
}