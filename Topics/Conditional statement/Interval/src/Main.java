import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
       if (-15 < input && input <= 12 || 14 < input && input < 17 || 19 <= input) {
           System.out.println("True");
       } else {
           System.out.println("False");
       }
    }
}