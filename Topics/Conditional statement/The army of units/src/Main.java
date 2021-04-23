import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        String type = "no army";
        if(units < 1 ){
            type = "no army";
        } else if(units <= 19){
            type = "pack";
        } else if(units <= 249){
            type = "throng";
        } else if(units <= 999){
            type = "zounds";
        } else{
            type = "legion";
        }
        System.out.println(type);
    }
}