import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean a = year % 4 == 0 && year % 100 != 0;
        boolean b = year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
        System.out.println(a || b ? "Leap" : "Regular");
    }
}