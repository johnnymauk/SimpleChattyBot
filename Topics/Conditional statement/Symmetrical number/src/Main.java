import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 10 == num / 1000 && (num / 100) % 10 == (num / 10) % 10) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}